package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichBlockSectionHeading extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "heading";

    private RichText text;
    private Integer size;

    public RichText text() { return text; }
    public Integer size() { return size; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockSectionHeading that = (RichBlockSectionHeading) o;
        return Objects.equals(text, that.text) && Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() { return Objects.hash(text, size); }

    @Override
    public String toString() { return "RichBlockSectionHeading{text=" + text + ", size=" + size + "}"; }
}
