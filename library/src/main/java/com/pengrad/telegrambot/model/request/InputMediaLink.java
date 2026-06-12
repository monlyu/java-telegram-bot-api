package com.pengrad.telegrambot.model.request;

import java.io.Serializable;
import java.util.Objects;

public class InputMediaLink implements Serializable {
    private final static long serialVersionUID = 0L;

    private final String type = "link";
    private final String url;

    public InputMediaLink(String url) {
        this.url = url;
    }

    public String type() { return type; }
    public String url() { return url; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputMediaLink that = (InputMediaLink) o;
        return Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() { return Objects.hash(url); }

    @Override
    public String toString() { return "InputMediaLink{url='" + url + "'}"; }
}
