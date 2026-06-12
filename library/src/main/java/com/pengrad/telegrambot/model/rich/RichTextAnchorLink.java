package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextAnchorLink extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "anchor_link";

    private RichText text;
    private String anchor_name;

    public RichText text() { return text; }
    public String anchorName() { return anchor_name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextAnchorLink that = (RichTextAnchorLink) o;
        return Objects.equals(text, that.text) && Objects.equals(anchor_name, that.anchor_name);
    }

    @Override
    public int hashCode() { return Objects.hash(text, anchor_name); }

    @Override
    public String toString() { return "RichTextAnchorLink{text=" + text + ", anchor_name='" + anchor_name + "'}"; }
}
