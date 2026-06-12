package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextDateTime extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "date_time";

    private RichText text;
    private Integer unix_time;
    private String date_time_format;

    public RichText text() { return text; }
    public Integer unixTime() { return unix_time; }
    public String dateTimeFormat() { return date_time_format; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextDateTime that = (RichTextDateTime) o;
        return Objects.equals(text, that.text) && Objects.equals(unix_time, that.unix_time) && Objects.equals(date_time_format, that.date_time_format);
    }

    @Override
    public int hashCode() { return Objects.hash(text, unix_time, date_time_format); }

    @Override
    public String toString() {
        return "RichTextDateTime{text=" + text + ", unix_time=" + unix_time + ", date_time_format='" + date_time_format + "'}";
    }
}
