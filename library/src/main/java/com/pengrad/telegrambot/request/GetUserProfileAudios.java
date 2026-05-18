package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.GetUserProfileAudiosResponse;

public class GetUserProfileAudios extends BaseRequest<GetUserProfileAudios, GetUserProfileAudiosResponse> {

    public GetUserProfileAudios(long userId) {
        super(GetUserProfileAudiosResponse.class);
        add("user_id", userId);
    }

    public GetUserProfileAudios offset(int offset) {
        return add("offset", offset);
    }

    public GetUserProfileAudios limit(int limit) {
        return add("limit", limit);
    }
}
