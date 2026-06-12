package com.pengrad.telegrambot.model.rich;

import com.pengrad.telegrambot.model.PhotoSize;
import java.util.Arrays;
import java.util.Objects;

public class RichBlockPhoto extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "photo";

    private PhotoSize[] photo;
    private Boolean has_spoiler;
    private RichBlockCaption caption;

    public PhotoSize[] photo() { return photo; }
    public Boolean hasSpoiler() { return has_spoiler; }
    public RichBlockCaption caption() { return caption; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockPhoto that = (RichBlockPhoto) o;
        return Arrays.equals(photo, that.photo) && Objects.equals(has_spoiler, that.has_spoiler) && Objects.equals(caption, that.caption);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(has_spoiler, caption);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }

    @Override
    public String toString() { return "RichBlockPhoto{photo=" + Arrays.toString(photo) + ", has_spoiler=" + has_spoiler + ", caption=" + caption + "}"; }
}
