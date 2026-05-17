package com.pengrad.telegrambot.utility.castor;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class JsonCastors {
    private static final Map<String, JsonCastor> CASTORS = new ConcurrentHashMap<>();

    public static void addCastor(String className, JsonCastor castor) {
        CASTORS.put(className, castor);
    }

    public static void addCastor(Class<?> className, JsonCastor castor) {
        CASTORS.put(className.getName(), castor);
    }

    public static JsonCastor getCastor(String className) {
        return CASTORS.get(className);
    }

    public static JsonCastor getCastor(Class<?> clazz) {
        return CASTORS.get(clazz.getName());
    }
}
