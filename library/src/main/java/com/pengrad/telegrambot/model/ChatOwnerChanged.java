package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Objects;

public class ChatOwnerChanged implements Serializable {
    private final static long serialVersionUID = 0L;

    private User new_owner;

    public User newOwner() {
        return new_owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatOwnerChanged that = (ChatOwnerChanged) o;
        return Objects.equals(new_owner, that.new_owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(new_owner);
    }

    @Override
    public String toString() {
        return "ChatOwnerChanged{" +
                "new_owner=" + new_owner +
                '}';
    }
}
