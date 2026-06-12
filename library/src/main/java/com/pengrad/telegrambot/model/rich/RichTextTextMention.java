package com.pengrad.telegrambot.model.rich;

import com.pengrad.telegrambot.model.User;
import java.util.Objects;

public class RichTextTextMention extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "text_mention";

    private RichText text;
    private User user;

    public RichText text() { return text; }
    public User user() { return user; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextTextMention that = (RichTextTextMention) o;
        return Objects.equals(text, that.text) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() { return Objects.hash(text, user); }

    @Override
    public String toString() {
        return "RichTextTextMention{text=" + text + ", user=" + user + "}";
    }
}
