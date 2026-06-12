package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextHashtag extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "hashtag";

    private RichText text;
    private String hashtag;

    public RichText text() { return text; }
    public String hashtag() { return hashtag; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextHashtag that = (RichTextHashtag) o;
        return Objects.equals(text, that.text) && Objects.equals(hashtag, that.hashtag);
    }

    @Override
    public int hashCode() { return Objects.hash(text, hashtag); }

    @Override
    public String toString() {
        return "RichTextHashtag{text=" + text + ", hashtag='" + hashtag + "'}";
    }
}
