package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextReferenceLink extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "reference_link";

    private RichText text;
    private String reference_name;

    public RichText text() { return text; }
    public String referenceName() { return reference_name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextReferenceLink that = (RichTextReferenceLink) o;
        return Objects.equals(text, that.text) && Objects.equals(reference_name, that.reference_name);
    }

    @Override
    public int hashCode() { return Objects.hash(text, reference_name); }

    @Override
    public String toString() { return "RichTextReferenceLink{text=" + text + ", reference_name='" + reference_name + "'}"; }
}
