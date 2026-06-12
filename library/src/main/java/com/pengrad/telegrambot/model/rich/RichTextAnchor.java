package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextAnchor extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "anchor";

    private String name;

    public String name() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextAnchor that = (RichTextAnchor) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name); }

    @Override
    public String toString() { return "RichTextAnchor{name='" + name + "'}"; }
}
