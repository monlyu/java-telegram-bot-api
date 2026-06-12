package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextPlain extends RichText {
    private final static long serialVersionUID = 0L;

    private String text;

    public String text() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextPlain that = (RichTextPlain) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "RichTextPlain{text='" + text + "'}";
    }
}
