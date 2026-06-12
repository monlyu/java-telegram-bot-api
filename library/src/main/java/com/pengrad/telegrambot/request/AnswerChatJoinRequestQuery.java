package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BaseResponse;

public class AnswerChatJoinRequestQuery extends BaseRequest<AnswerChatJoinRequestQuery, BaseResponse> {

    public enum Result {
        approve, decline, queue
    }

    public AnswerChatJoinRequestQuery(String chatJoinRequestQueryId, Result result) {
        super(BaseResponse.class);
        add("chat_join_request_query_id", chatJoinRequestQueryId);
        add("result", result.name());
    }
}
