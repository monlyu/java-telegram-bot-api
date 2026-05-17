package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BaseResponse;

public class DeleteAllMessageReactions extends BaseRequest<DeleteAllMessageReactions, BaseResponse> {

    public DeleteAllMessageReactions(Object chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }

    public DeleteAllMessageReactions userId(long userId) {
        return add("user_id", userId);
    }

    public DeleteAllMessageReactions actorChatId(long actorChatId) {
        return add("actor_chat_id", actorChatId);
    }
}
