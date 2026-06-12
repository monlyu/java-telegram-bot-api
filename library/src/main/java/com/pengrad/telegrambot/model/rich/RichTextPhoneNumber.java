package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextPhoneNumber extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "phone_number";

    private RichText text;
    private String phone_number;

    public RichText text() { return text; }
    public String phoneNumber() { return phone_number; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextPhoneNumber that = (RichTextPhoneNumber) o;
        return Objects.equals(text, that.text) && Objects.equals(phone_number, that.phone_number);
    }

    @Override
    public int hashCode() { return Objects.hash(text, phone_number); }

    @Override
    public String toString() {
        return "RichTextPhoneNumber{text=" + text + ", phone_number='" + phone_number + "'}";
    }
}
