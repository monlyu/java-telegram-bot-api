package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BaseResponse;

public class RemoveMyProfilePhoto extends BaseRequest<RemoveMyProfilePhoto, BaseResponse> {

    public RemoveMyProfilePhoto() {
        super(BaseResponse.class);
    }
}
