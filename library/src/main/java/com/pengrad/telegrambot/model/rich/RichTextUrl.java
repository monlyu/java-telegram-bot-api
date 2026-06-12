package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextUrl extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "url";

    private RichText text;
    private String url;

    public RichText text() { return text; }
    public String url() { return url; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextUrl that = (RichTextUrl) o;
        return Objects.equals(text, that.text) && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() { return Objects.hash(text, url); }

    @Override
    public String toString() {
        return "RichTextUrl{text=" + text + ", url='" + url + "'}";
    }
}
