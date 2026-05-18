package com.pengrad.telegrambot.response;

import com.pengrad.telegrambot.model.UserProfileAudios;

public class GetUserProfileAudiosResponse extends BaseResponse {

    private UserProfileAudios result;

    public UserProfileAudios result() {
        return result;
    }

    @Override
    public String toString() {
        return "GetUserProfileAudiosResponse{" +
                "result=" + result +
                ", base=" + super.toString() +
                '}';
    }
}
