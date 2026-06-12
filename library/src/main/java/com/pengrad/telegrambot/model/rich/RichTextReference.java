package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextReference extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "reference";

    private RichText text;
    private String name;

    public RichText text() { return text; }
    public String name() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextReference that = (RichTextReference) o;
        return Objects.equals(text, that.text) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() { return Objects.hash(text, name); }

    @Override
    public String toString() { return "RichTextReference{text=" + text + ", name='" + name + "'}"; }
}
