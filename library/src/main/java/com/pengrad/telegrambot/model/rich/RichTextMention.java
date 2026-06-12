package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextMention extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "mention";

    private RichText text;
    private String username;

    public RichText text() { return text; }
    public String username() { return username; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextMention that = (RichTextMention) o;
        return Objects.equals(text, that.text) && Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() { return Objects.hash(text, username); }

    @Override
    public String toString() {
        return "RichTextMention{text=" + text + ", username='" + username + "'}";
    }
}
