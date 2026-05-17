package com.pengrad.telegrambot.response;

import com.pengrad.telegrambot.model.SentGuestMessage;

public class SentGuestMessageResponse extends BaseResponse {

    private SentGuestMessage result;

    public SentGuestMessage sentGuestMessage() {
        return result;
    }

    @Override
    public String toString() {
        return "SentGuestMessageResponse{" +
                "result=" + result +
                '}';
    }
}
