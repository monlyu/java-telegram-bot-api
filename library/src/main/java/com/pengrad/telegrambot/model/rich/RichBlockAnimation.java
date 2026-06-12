package com.pengrad.telegrambot.model.rich;

import com.pengrad.telegrambot.model.Animation;
import java.util.Objects;

public class RichBlockAnimation extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "animation";

    private Animation animation;
    private Boolean has_spoiler;
    private RichBlockCaption caption;

    public Animation animation() { return animation; }
    public Boolean hasSpoiler() { return has_spoiler; }
    public RichBlockCaption caption() { return caption; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockAnimation that = (RichBlockAnimation) o;
        return Objects.equals(animation, that.animation) && Objects.equals(has_spoiler, that.has_spoiler) && Objects.equals(caption, that.caption);
    }

    @Override
    public int hashCode() { return Objects.hash(animation, has_spoiler, caption); }

    @Override
    public String toString() { return "RichBlockAnimation{animation=" + animation + ", has_spoiler=" + has_spoiler + ", caption=" + caption + "}"; }
}
