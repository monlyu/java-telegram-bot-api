package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BaseResponse;

public class DeleteMessageReaction extends BaseRequest<DeleteMessageReaction, BaseResponse> {

    public DeleteMessageReaction(Object chatId, int messageId) {
        super(BaseResponse.class);
        add("chat_id", chatId).add("message_id", messageId);
    }

    public DeleteMessageReaction userId(long userId) {
        return add("user_id", userId);
    }

    public DeleteMessageReaction actorChatId(long actorChatId) {
        return add("actor_chat_id", actorChatId);
    }
}
