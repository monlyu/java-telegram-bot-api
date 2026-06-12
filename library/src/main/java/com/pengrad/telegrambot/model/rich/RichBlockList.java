package com.pengrad.telegrambot.model.rich;

import java.util.Arrays;
import java.util.Objects;

public class RichBlockList extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "list";

    private RichBlockListItem[] items;

    public RichBlockListItem[] items() { return items; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockList that = (RichBlockList) o;
        return Arrays.equals(items, that.items);
    }

    @Override
    public int hashCode() { return Arrays.hashCode(items); }

    @Override
    public String toString() { return "RichBlockList{items=" + Arrays.toString(items) + "}"; }
}
