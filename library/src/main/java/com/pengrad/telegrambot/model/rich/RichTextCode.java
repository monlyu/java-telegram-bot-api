package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextCode extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "code";

    private RichText text;

    public RichText text() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextCode that = (RichTextCode) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "RichTextCode{text=" + text + "}";
    }
}
