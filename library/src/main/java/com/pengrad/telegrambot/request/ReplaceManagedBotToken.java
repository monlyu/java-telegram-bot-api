package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.StringResponse;

public class ReplaceManagedBotToken extends BaseRequest<ReplaceManagedBotToken, StringResponse> {

    public ReplaceManagedBotToken(long userId) {
        super(StringResponse.class);
        add("user_id", userId);
    }
}
