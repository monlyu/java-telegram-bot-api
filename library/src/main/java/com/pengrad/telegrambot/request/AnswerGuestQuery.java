package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.model.request.InlineQueryResult;
import com.pengrad.telegrambot.response.SentGuestMessageResponse;

public class AnswerGuestQuery extends BaseRequest<AnswerGuestQuery, SentGuestMessageResponse> {

    public AnswerGuestQuery(String guestQueryId, InlineQueryResult<?> result) {
        super(SentGuestMessageResponse.class);
        add("guest_query_id", guestQueryId).add("result", result);
    }
}
