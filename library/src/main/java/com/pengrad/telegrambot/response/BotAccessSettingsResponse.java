package com.pengrad.telegrambot.response;

import com.pengrad.telegrambot.model.BotAccessSettings;

public class BotAccessSettingsResponse extends BaseResponse {

    private BotAccessSettings result;

    public BotAccessSettings botAccessSettings() {
        return result;
    }

    @Override
    public String toString() {
        return "BotAccessSettingsResponse{" +
                "result=" + result +
                '}';
    }
}
