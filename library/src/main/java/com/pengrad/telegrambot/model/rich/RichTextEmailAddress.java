package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextEmailAddress extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "email_address";

    private RichText text;
    private String email_address;

    public RichText text() { return text; }
    public String emailAddress() { return email_address; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextEmailAddress that = (RichTextEmailAddress) o;
        return Objects.equals(text, that.text) && Objects.equals(email_address, that.email_address);
    }

    @Override
    public int hashCode() { return Objects.hash(text, email_address); }

    @Override
    public String toString() {
        return "RichTextEmailAddress{text=" + text + ", email_address='" + email_address + "'}";
    }
}
