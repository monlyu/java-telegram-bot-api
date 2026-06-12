package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Objects;

public class Link implements Serializable {
    private final static long serialVersionUID = 0L;

    private String url;

    public String url() { return url; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link that = (Link) o;
        return Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() { return Objects.hash(url); }

    @Override
    public String toString() { return "Link{url='" + url + "'}"; }
}
