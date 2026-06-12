package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichBlockPreformatted extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "pre";

    private RichText text;
    private String language;

    public RichText text() { return text; }
    public String language() { return language; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockPreformatted that = (RichBlockPreformatted) o;
        return Objects.equals(text, that.text) && Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() { return Objects.hash(text, language); }

    @Override
    public String toString() { return "RichBlockPreformatted{text=" + text + ", language='" + language + "'}"; }
}
