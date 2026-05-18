package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Objects;

public class ManagedBotCreated implements Serializable {
    private final static long serialVersionUID = 0L;

    private User bot;

    public User bot() {
        return bot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagedBotCreated that = (ManagedBotCreated) o;
        return Objects.equals(bot, that.bot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bot);
    }

    @Override
    public String toString() {
        return "ManagedBotCreated{" +
                "bot=" + bot +
                '}';
    }
}
