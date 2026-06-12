package com.pengrad.telegrambot.model.rich;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class RichBlockListItem implements Serializable {
    private final static long serialVersionUID = 0L;

    private String label;
    private RichBlock[] blocks;
    private Boolean has_checkbox;
    private Boolean is_checked;
    private Integer value;
    private String type;

    public String label() { return label; }
    public RichBlock[] blocks() { return blocks; }
    public Boolean hasCheckbox() { return has_checkbox; }
    public Boolean isChecked() { return is_checked; }
    public Integer value() { return value; }
    public String type() { return type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockListItem that = (RichBlockListItem) o;
        return Objects.equals(label, that.label) && Arrays.equals(blocks, that.blocks) &&
               Objects.equals(has_checkbox, that.has_checkbox) && Objects.equals(is_checked, that.is_checked) &&
               Objects.equals(value, that.value) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(label, has_checkbox, is_checked, value, type);
        result = 31 * result + Arrays.hashCode(blocks);
        return result;
    }

    @Override
    public String toString() {
        return "RichBlockListItem{label='" + label + "', blocks=" + Arrays.toString(blocks) +
               ", has_checkbox=" + has_checkbox + ", is_checked=" + is_checked +
               ", value=" + value + ", type='" + type + "'}";
    }
}
