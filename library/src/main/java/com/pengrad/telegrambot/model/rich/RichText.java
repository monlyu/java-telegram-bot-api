package com.pengrad.telegrambot.model.rich;

import java.io.Serializable;
import java.util.Objects;

public class RichText implements Serializable {
    private final static long serialVersionUID = 0L;

    private String type;

    public RichText() {
    }

    public RichText(String type) {
        this.type = type;
    }

    public String type() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichText that = (RichText) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "RichText{type='" + type + "'}";
    }
}
