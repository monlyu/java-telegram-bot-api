package com.pengrad.telegrambot.utility.castor;

import com.google.gson.Gson;

import java.util.Map;

public interface JsonCastor {
    public Object cast(Gson gson, Class<?> target, Map<String, Object> jsonValue);
}
