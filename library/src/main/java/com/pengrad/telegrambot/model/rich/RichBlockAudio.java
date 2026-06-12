package com.pengrad.telegrambot.model.rich;

import com.pengrad.telegrambot.model.Audio;
import java.util.Objects;

public class RichBlockAudio extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "audio";

    private Audio audio;
    private RichBlockCaption caption;

    public Audio audio() { return audio; }
    public RichBlockCaption caption() { return caption; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockAudio that = (RichBlockAudio) o;
        return Objects.equals(audio, that.audio) && Objects.equals(caption, that.caption);
    }

    @Override
    public int hashCode() { return Objects.hash(audio, caption); }

    @Override
    public String toString() { return "RichBlockAudio{audio=" + audio + ", caption=" + caption + "}"; }
}
