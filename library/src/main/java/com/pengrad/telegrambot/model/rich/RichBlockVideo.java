package com.pengrad.telegrambot.model.rich;

import com.pengrad.telegrambot.model.Video;
import java.util.Objects;

public class RichBlockVideo extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "video";

    private Video video;
    private Boolean has_spoiler;
    private RichBlockCaption caption;

    public Video video() { return video; }
    public Boolean hasSpoiler() { return has_spoiler; }
    public RichBlockCaption caption() { return caption; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockVideo that = (RichBlockVideo) o;
        return Objects.equals(video, that.video) && Objects.equals(has_spoiler, that.has_spoiler) && Objects.equals(caption, that.caption);
    }

    @Override
    public int hashCode() { return Objects.hash(video, has_spoiler, caption); }

    @Override
    public String toString() { return "RichBlockVideo{video=" + video + ", has_spoiler=" + has_spoiler + ", caption=" + caption + "}"; }
}
