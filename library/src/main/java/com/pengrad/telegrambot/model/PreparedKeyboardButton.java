package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Objects;

public class PreparedKeyboardButton implements Serializable {
    private final static long serialVersionUID = 0L;

    private String id;

    public String id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreparedKeyboardButton that = (PreparedKeyboardButton) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PreparedKeyboardButton{" +
                "id='" + id + '\'' +
                '}';
    }
}
