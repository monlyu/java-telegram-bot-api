package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichBlockAnchor extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "anchor";

    private String name;

    public String name() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockAnchor that = (RichBlockAnchor) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name); }

    @Override
    public String toString() { return "RichBlockAnchor{name='" + name + "'}"; }
}
