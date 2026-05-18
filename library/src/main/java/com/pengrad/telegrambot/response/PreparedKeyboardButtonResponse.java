package com.pengrad.telegrambot.response;

import com.pengrad.telegrambot.model.PreparedKeyboardButton;

public class PreparedKeyboardButtonResponse extends BaseResponse {

    private PreparedKeyboardButton result;

    public PreparedKeyboardButton result() {
        return result;
    }

    @Override
    public String toString() {
        return "PreparedKeyboardButtonResponse{" +
                "result=" + result +
                ", base=" + super.toString() +
                '}';
    }
}
