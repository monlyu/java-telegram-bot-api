package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextCashtag extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "cashtag";

    private RichText text;
    private String cashtag;

    public RichText text() { return text; }
    public String cashtag() { return cashtag; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextCashtag that = (RichTextCashtag) o;
        return Objects.equals(text, that.text) && Objects.equals(cashtag, that.cashtag);
    }

    @Override
    public int hashCode() { return Objects.hash(text, cashtag); }

    @Override
    public String toString() {
        return "RichTextCashtag{text=" + text + ", cashtag='" + cashtag + "'}";
    }
}
