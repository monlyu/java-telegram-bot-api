package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class BotAccessSettings implements Serializable {
    private final static long serialVersionUID = 0L;

    private Boolean is_access_restricted;
    private User[] added_users;

    public Boolean isAccessRestricted() {
        return is_access_restricted != null && is_access_restricted;
    }

    public User[] addedUsers() {
        return added_users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BotAccessSettings that = (BotAccessSettings) o;
        return Objects.equals(is_access_restricted, that.is_access_restricted) &&
                Arrays.equals(added_users, that.added_users);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(is_access_restricted);
        result = 31 * result + Arrays.hashCode(added_users);
        return result;
    }

    @Override
    public String toString() {
        return "BotAccessSettings{" +
                "is_access_restricted=" + is_access_restricted +
                ", added_users=" + Arrays.toString(added_users) +
                '}';
    }
}
