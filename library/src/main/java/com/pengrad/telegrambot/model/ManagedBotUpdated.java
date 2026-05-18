package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Objects;

public class ManagedBotUpdated implements Serializable {
    private final static long serialVersionUID = 0L;

    private User user;
    private User bot;

    public User user() {
        return user;
    }

    public User bot() {
        return bot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagedBotUpdated that = (ManagedBotUpdated) o;
        return Objects.equals(user, that.user) && Objects.equals(bot, that.bot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, bot);
    }

    @Override
    public String toString() {
        return "ManagedBotUpdated{" +
                "user=" + user +
                ", bot=" + bot +
                '}';
    }
}
