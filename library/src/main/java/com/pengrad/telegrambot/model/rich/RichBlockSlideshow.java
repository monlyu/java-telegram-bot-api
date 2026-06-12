package com.pengrad.telegrambot.model.rich;

import java.util.Arrays;
import java.util.Objects;

public class RichBlockSlideshow extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "slideshow";

    private RichBlock[] blocks;
    private RichBlockCaption caption;

    public RichBlock[] blocks() { return blocks; }
    public RichBlockCaption caption() { return caption; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockSlideshow that = (RichBlockSlideshow) o;
        return Arrays.equals(blocks, that.blocks) && Objects.equals(caption, that.caption);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(caption);
        result = 31 * result + Arrays.hashCode(blocks);
        return result;
    }

    @Override
    public String toString() { return "RichBlockSlideshow{blocks=" + Arrays.toString(blocks) + ", caption=" + caption + "}"; }
}
