package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichBlockPullQuotation extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "pullquote";

    private RichText text;
    private RichText credit;

    public RichText text() { return text; }
    public RichText credit() { return credit; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockPullQuotation that = (RichBlockPullQuotation) o;
        return Objects.equals(text, that.text) && Objects.equals(credit, that.credit);
    }

    @Override
    public int hashCode() { return Objects.hash(text, credit); }

    @Override
    public String toString() { return "RichBlockPullQuotation{text=" + text + ", credit=" + credit + "}"; }
}
