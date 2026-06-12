package com.pengrad.telegrambot.model.rich;

import com.pengrad.telegrambot.model.Location;
import java.util.Objects;

public class RichBlockMap extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "map";

    private Location location;
    private Integer zoom;
    private Integer width;
    private Integer height;
    private RichBlockCaption caption;

    public Location location() { return location; }
    public Integer zoom() { return zoom; }
    public Integer width() { return width; }
    public Integer height() { return height; }
    public RichBlockCaption caption() { return caption; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockMap that = (RichBlockMap) o;
        return Objects.equals(location, that.location) && Objects.equals(zoom, that.zoom) &&
               Objects.equals(width, that.width) && Objects.equals(height, that.height) &&
               Objects.equals(caption, that.caption);
    }

    @Override
    public int hashCode() { return Objects.hash(location, zoom, width, height, caption); }

    @Override
    public String toString() {
        return "RichBlockMap{location=" + location + ", zoom=" + zoom + ", width=" + width + ", height=" + height + ", caption=" + caption + "}";
    }
}
