package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BotAccessSettingsResponse;

public class GetManagedBotAccessSettings extends BaseRequest<GetManagedBotAccessSettings, BotAccessSettingsResponse> {

    public GetManagedBotAccessSettings(long userId) {
        super(BotAccessSettingsResponse.class);
        add("user_id", userId);
    }
}
