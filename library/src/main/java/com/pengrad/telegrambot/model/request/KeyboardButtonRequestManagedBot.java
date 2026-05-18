package com.pengrad.telegrambot.model.request;

import java.io.Serializable;
import java.util.Objects;

public class KeyboardButtonRequestManagedBot implements Serializable {
    private final static long serialVersionUID = 0L;

    private Integer request_id;
    private String suggested_name;
    private String suggested_username;

    public KeyboardButtonRequestManagedBot(Integer requestId) {
        this.request_id = requestId;
    }

    public KeyboardButtonRequestManagedBot suggestedName(String suggestedName) {
        this.suggested_name = suggestedName;
        return this;
    }

    public KeyboardButtonRequestManagedBot suggestedUsername(String suggestedUsername) {
        this.suggested_username = suggestedUsername;
        return this;
    }

    public Integer requestId() {
        return request_id;
    }

    public String suggestedName() {
        return suggested_name;
    }

    public String suggestedUsername() {
        return suggested_username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyboardButtonRequestManagedBot that = (KeyboardButtonRequestManagedBot) o;
        return Objects.equals(request_id, that.request_id) &&
                Objects.equals(suggested_name, that.suggested_name) &&
                Objects.equals(suggested_username, that.suggested_username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request_id, suggested_name, suggested_username);
    }

    @Override
    public String toString() {
        return "KeyboardButtonRequestManagedBot{" +
                "request_id=" + request_id +
                ", suggested_name='" + suggested_name + '\'' +
                ", suggested_username='" + suggested_username + '\'' +
                '}';
    }
}
