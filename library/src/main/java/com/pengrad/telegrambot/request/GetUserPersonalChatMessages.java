package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.MessagesResponse;

public class GetUserPersonalChatMessages extends BaseRequest<GetUserPersonalChatMessages, MessagesResponse> {

    public GetUserPersonalChatMessages(long userId, int limit) {
        super(MessagesResponse.class);
        add("user_id", userId).add("limit", limit);
    }
}
