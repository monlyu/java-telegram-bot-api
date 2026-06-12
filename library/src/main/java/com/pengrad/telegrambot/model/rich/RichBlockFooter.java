package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichBlockFooter extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "footer";

    private RichText text;

    public RichText text() { return text; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockFooter that = (RichBlockFooter) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() { return Objects.hash(text); }

    @Override
    public String toString() { return "RichBlockFooter{text=" + text + "}"; }
}
