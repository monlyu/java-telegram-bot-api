package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.pengrad.telegrambot.response.PreparedKeyboardButtonResponse;

public class SavePreparedKeyboardButton extends BaseRequest<SavePreparedKeyboardButton, PreparedKeyboardButtonResponse> {

    public SavePreparedKeyboardButton(long userId, KeyboardButton button) {
        super(PreparedKeyboardButtonResponse.class);
        add("user_id", userId).add("button", button);
    }
}
