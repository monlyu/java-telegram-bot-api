package com.pengrad.telegrambot.utility.extend;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Base64;

/**
 * Gson type adapter for byte[] to Base64 string.
 */
public class Byte2B64Adapter implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {

    @Override
    public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive("@byte" + Base64.getEncoder().encodeToString(src));
    }

    @Override
    public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String jsonText = json.getAsString();
        if (jsonText.startsWith("@byte")) {
            jsonText = jsonText.substring("@byte".length());
        }
        return Base64.getDecoder().decode(jsonText);
    }

    public static Object guestValue(Object value) {
        if (value instanceof String) {
            String str = (String) value;
            if (str.startsWith("@byte")) {
                str = str.substring("@byte".length());
                return Base64.getDecoder().decode(str);
            }
        }
        return value;
    }

}
