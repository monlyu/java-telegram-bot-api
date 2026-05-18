package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.StringResponse;

public class GetManagedBotToken extends BaseRequest<GetManagedBotToken, StringResponse> {

    public GetManagedBotToken(long userId) {
        super(StringResponse.class);
        add("user_id", userId);
    }
}
