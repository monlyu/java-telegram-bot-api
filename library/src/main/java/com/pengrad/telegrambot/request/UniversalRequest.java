package com.pengrad.telegrambot.request;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.utility.extend.Byte2B64Adapter;
import com.pengrad.telegrambot.utility.extend.InputFileAdapter;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.*;

public class UniversalRequest<R extends BaseResponse> extends BaseRequest<UniversalRequest<R>, R> {

    private String requestClassName;
    private String responseClassName;
    private boolean isMultipart = false;
    private String requestMethod;

    private UniversalRequest(Class<? extends R> responseClass) {
        super(responseClass);
    }

    private static Object convertType(Object rawValue, Class<?> expectedType) {
        if (rawValue == null) return null;
        // If the type is already correct, return it
        if (expectedType.isInstance(rawValue)) {
            return rawValue;
        }
        // Handle numeric conversions (e.g., Double to int/long)
        if (rawValue instanceof Number) {
            Number num = (Number) rawValue;
            if (expectedType == int.class || expectedType == Integer.class) {
                return num.intValue();
            }
            if (expectedType == long.class || expectedType == Long.class) {
                return num.longValue();
            }
            if (expectedType == double.class || expectedType == Double.class) {
                return num.doubleValue();
            }
            if (expectedType == float.class || expectedType == Float.class) {
                return num.floatValue();
            }
        }
        // If no special conversion is found, try a simple cast.
        // This will throw ClassCastException if types are incompatible, which we catch above.
        return expectedType.cast(rawValue);
    }

    /**
     * Creates an object instance from a class name and a map of properties
     * by dynamically matching constructors.
     *
     * @param className The fully qualified name of the class to instantiate.
     * @param valueMap  A map of property names to their values.
     * @return An instance of the specified class, or null if no suitable constructor is found.
     */
    private static Object createInstanceFromMap(String className, Map<String, Object> valueMap) {
        try {
            Class<?> clazz = Class.forName(className);

            boolean any = Arrays.stream(clazz.getConstructors()).anyMatch(e -> e.getParameters().length == 0);
            if (any) {
                String jsonString = new Gson().toJson(valueMap);
                return new Gson().fromJson(jsonString, clazz);
            }

            for (Constructor<?> ctor : clazz.getConstructors()) {
                Parameter[] params = ctor.getParameters();
                boolean canSatisfy = true;
                List<Object> args = new ArrayList<>();
                for (Parameter p : params) {
                    String paramName = p.getName();
                    if (valueMap.containsKey(paramName)) {
                        Object rawValue = valueMap.get(paramName);
                        Class<?> expectedType = p.getType();
                        try {
                            Object convertedValue = convertType(rawValue, expectedType);
                            args.add(convertedValue);
                        } catch (ClassCastException e) {
                            canSatisfy = false;
                            break;
                        }
                    } else {
                        canSatisfy = false;
                        break;
                    }
                }
                if (canSatisfy) {
                    return ctor.newInstance(args.toArray());
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static UniversalRequest makeFromJson(String json) {
        Map<String, Object> rawMap = new Gson().fromJson(json, Map.class);
        try {
            String responseClassName = (String) rawMap.remove("@response");
            String methodName = (String) rawMap.remove("@method");
            String requestClassName = (String) rawMap.remove("@request");
            boolean multipart = Boolean.valueOf((String) rawMap.remove("@multipart"));
            Class<? extends BaseResponse> responseClass = (Class<? extends BaseResponse>) Class.forName(responseClassName);
//            Class<? extends BaseRequest> requestClass = (Class<? extends BaseRequest>) Class.forName(requestClassName);

            UniversalRequest universalRequest = new UniversalRequest(responseClass);
            universalRequest.isMultipart = multipart;
            universalRequest.requestMethod = methodName;
            universalRequest.requestClassName = requestClassName;
            universalRequest.responseClassName = responseClassName;

            if (methodName == null) throw new JsonParseException("Missing '@method' field");
            for (Map.Entry<String, Object> entry : rawMap.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Map) {
                    try {
                        Map<String, Object> valueMap = ((Map<String, Object>) value);
                        if (valueMap.containsKey("@targetClass")) {
                            Map<String, Object> valus = (Map<String, Object>) value;
                            String className = (String) valus.remove("@targetClass");
                            Object instance = createInstanceFromMap(className, valus);
                            universalRequest.add(entry.getKey(), instance);
                        } else if (valueMap.containsKey("path")) {
                            universalRequest.add(entry.getKey(), new File(((String) valueMap.get("path"))));
                        } else if (valueMap.containsKey("isInputFile")) {
                            universalRequest.add(entry.getKey(), InputFileAdapter.backToFile(valueMap));
                        } else {
                            universalRequest.add(entry.getKey(), valueMap);
                        }
                    } catch (Exception e) {
                        System.err.println("实例化失败: " + e.getMessage());
                        e.printStackTrace();
                    }
                } else {
                    universalRequest.add(entry.getKey(), Byte2B64Adapter.guestValue(value));
                }
            }
            return universalRequest;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isMultipart() {
        return isMultipart;
    }


    private static String getAttachName(Object object) {
        if (!(object instanceof Map)) {
            return null;
        }
        for (Object value : ((Map<String, Object>) object).values()) {
            if (value instanceof String && ((String) value).startsWith("attach://")) {
                return ((String) value).substring("attach://".length());
            }
        }
        return null;
    }


    @Override
    public String getMethod() {
        return requestMethod;
    }

    public String logParams() {
        Map<String, Object> back = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Object> entry : this.getParameters().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            builder.append(key).append("=");
            builder.append(value);
            builder.append("\n");
        }
        return builder.toString();
    }
}
