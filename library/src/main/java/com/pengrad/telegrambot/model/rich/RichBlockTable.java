package com.pengrad.telegrambot.model.rich;

import java.util.Arrays;
import java.util.Objects;

public class RichBlockTable extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "table";

    private RichBlockTableCell[][] cells;
    private Boolean is_bordered;
    private Boolean is_striped;
    private RichText caption;

    public RichBlockTableCell[][] cells() { return cells; }
    public Boolean isBordered() { return is_bordered; }
    public Boolean isStriped() { return is_striped; }
    public RichText caption() { return caption; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockTable that = (RichBlockTable) o;
        return Arrays.deepEquals(cells, that.cells) && Objects.equals(is_bordered, that.is_bordered) &&
               Objects.equals(is_striped, that.is_striped) && Objects.equals(caption, that.caption);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(is_bordered, is_striped, caption);
        result = 31 * result + Arrays.deepHashCode(cells);
        return result;
    }

    @Override
    public String toString() {
        return "RichBlockTable{cells=" + Arrays.deepToString(cells) + ", is_bordered=" + is_bordered +
               ", is_striped=" + is_striped + ", caption=" + caption + "}";
    }
}
