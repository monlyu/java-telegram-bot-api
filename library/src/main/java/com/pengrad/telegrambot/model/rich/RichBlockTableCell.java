package com.pengrad.telegrambot.model.rich;

import java.io.Serializable;
import java.util.Objects;

public class RichBlockTableCell implements Serializable {
    private final static long serialVersionUID = 0L;

    private RichText text;
    private Boolean is_header;
    private Integer colspan;
    private Integer rowspan;
    private String align;
    private String valign;

    public RichText text() { return text; }
    public Boolean isHeader() { return is_header; }
    public Integer colspan() { return colspan; }
    public Integer rowspan() { return rowspan; }
    public String align() { return align; }
    public String valign() { return valign; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockTableCell that = (RichBlockTableCell) o;
        return Objects.equals(text, that.text) && Objects.equals(is_header, that.is_header) &&
               Objects.equals(colspan, that.colspan) && Objects.equals(rowspan, that.rowspan) &&
               Objects.equals(align, that.align) && Objects.equals(valign, that.valign);
    }

    @Override
    public int hashCode() { return Objects.hash(text, is_header, colspan, rowspan, align, valign); }

    @Override
    public String toString() {
        return "RichBlockTableCell{text=" + text + ", is_header=" + is_header + ", colspan=" + colspan +
               ", rowspan=" + rowspan + ", align='" + align + "', valign='" + valign + "'}";
    }
}
