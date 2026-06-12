package com.pengrad.telegrambot.model.rich;

import java.util.Arrays;
import java.util.Objects;

public class RichBlockBlockQuotation extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "blockquote";

    private RichBlock[] blocks;
    private RichText credit;

    public RichBlock[] blocks() { return blocks; }
    public RichText credit() { return credit; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockBlockQuotation that = (RichBlockBlockQuotation) o;
        return Arrays.equals(blocks, that.blocks) && Objects.equals(credit, that.credit);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(credit);
        result = 31 * result + Arrays.hashCode(blocks);
        return result;
    }

    @Override
    public String toString() { return "RichBlockBlockQuotation{blocks=" + Arrays.toString(blocks) + ", credit=" + credit + "}"; }
}
