package com.pengrad.telegrambot.model.request;

import java.io.Serializable;

import com.pengrad.telegrambot.model.WebAppInfo;

/**
 * Stas Parshin
 * 06 May 2016
 */
public class KeyboardButton implements Serializable {
    private final static long serialVersionUID = 0L;

    private String text;
    private String icon_custom_emoji_id;
    private String style;
    private boolean request_contact;
    private boolean request_location;
    private KeyboardButtonPollType request_poll;
    private KeyboardButtonRequestUsers request_users;
    private KeyboardButtonRequestChat request_chat;
    private KeyboardButtonRequestManagedBot request_managed_bot;
    private WebAppInfo web_app;

    public KeyboardButton(String text) {
        this.text = text;
    }

    public KeyboardButton iconCustomEmojiId(String iconCustomEmojiId) {
        this.icon_custom_emoji_id = iconCustomEmojiId;
        return this;
    }

    public KeyboardButton style(String style) {
        this.style = style;
        return this;
    }

    public KeyboardButton requestLocation(boolean requestLocation) {
        request_location = requestLocation;
        return this;
    }

    public KeyboardButton requestContact(boolean requestContact) {
        request_contact = requestContact;
        return this;
    }

    public KeyboardButton requestPoll(KeyboardButtonPollType poll) {
        this.request_poll = poll;
        return this;
    }

    public KeyboardButton requestUsers(KeyboardButtonRequestUsers users) {
        this.request_users = users;
        return this;
    }

    public KeyboardButton requestChat(KeyboardButtonRequestChat chat) {
        this.request_chat = chat;
        return this;
    }

    public KeyboardButton requestManagedBot(KeyboardButtonRequestManagedBot managedBot) {
        this.request_managed_bot = managedBot;
        return this;
    }

    public KeyboardButton webAppInfo(WebAppInfo webApp) {
        this.web_app = webApp;
        return this;
    }
}
