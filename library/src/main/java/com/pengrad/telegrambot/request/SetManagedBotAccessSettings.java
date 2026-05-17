package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BaseResponse;

public class SetManagedBotAccessSettings extends BaseRequest<SetManagedBotAccessSettings, BaseResponse> {

    public SetManagedBotAccessSettings(long userId, boolean isAccessRestricted) {
        super(BaseResponse.class);
        add("user_id", userId).add("is_access_restricted", isAccessRestricted);
    }

    public SetManagedBotAccessSettings addedUserIds(long... addedUserIds) {
        return add("added_user_ids", addedUserIds);
    }
}
