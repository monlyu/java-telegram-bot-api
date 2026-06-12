package com.pengrad.telegrambot.model.rich;

import java.util.Arrays;
import java.util.Objects;

public class RichBlockDetails extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "details";

    private RichText summary;
    private RichBlock[] blocks;
    private Boolean is_open;

    public RichText summary() { return summary; }
    public RichBlock[] blocks() { return blocks; }
    public Boolean isOpen() { return is_open; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockDetails that = (RichBlockDetails) o;
        return Objects.equals(summary, that.summary) && Arrays.equals(blocks, that.blocks) && Objects.equals(is_open, that.is_open);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(summary, is_open);
        result = 31 * result + Arrays.hashCode(blocks);
        return result;
    }

    @Override
    public String toString() { return "RichBlockDetails{summary=" + summary + ", blocks=" + Arrays.toString(blocks) + ", is_open=" + is_open + "}"; }
}
