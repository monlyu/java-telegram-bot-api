package com.pengrad.telegrambot.model.rich;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class RichMessage implements Serializable {
    private final static long serialVersionUID = 0L;

    private RichBlock[] blocks;
    private Boolean is_rtl;

    public RichBlock[] blocks() { return blocks; }
    public Boolean isRtl() { return is_rtl; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichMessage that = (RichMessage) o;
        return Arrays.equals(blocks, that.blocks) && Objects.equals(is_rtl, that.is_rtl);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(is_rtl);
        result = 31 * result + Arrays.hashCode(blocks);
        return result;
    }

    @Override
    public String toString() {
        return "RichMessage{blocks=" + Arrays.toString(blocks) + ", is_rtl=" + is_rtl + "}";
    }
}
