package com.pengrad.telegrambot.model.rich;

import java.util.Arrays;
import java.util.Objects;

public class RichTextArray extends RichText {
    private final static long serialVersionUID = 0L;

    private RichText[] texts;

    public RichTextArray() {}

    public RichTextArray(RichText[] texts) {
        this.texts = texts;
    }

    public RichText[] texts() {
        return texts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextArray that = (RichTextArray) o;
        return Arrays.equals(texts, that.texts);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(texts);
    }

    @Override
    public String toString() {
        return "RichTextArray{texts=" + Arrays.toString(texts) + "}";
    }
}
