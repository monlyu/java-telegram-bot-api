package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BaseResponse;

public class SendChatJoinRequestWebApp extends BaseRequest<SendChatJoinRequestWebApp, BaseResponse> {

    public SendChatJoinRequestWebApp(String chatJoinRequestQueryId, String webAppUrl) {
        super(BaseResponse.class);
        add("chat_join_request_query_id", chatJoinRequestQueryId);
        add("web_app_url", webAppUrl);
    }
}
