package com.pengrad.telegrambot.model.rich;

import com.pengrad.telegrambot.model.Voice;
import java.util.Objects;

public class RichBlockVoiceNote extends RichBlock {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "voice_note";

    private Voice voice_note;
    private RichBlockCaption caption;

    public Voice voiceNote() { return voice_note; }
    public RichBlockCaption caption() { return caption; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichBlockVoiceNote that = (RichBlockVoiceNote) o;
        return Objects.equals(voice_note, that.voice_note) && Objects.equals(caption, that.caption);
    }

    @Override
    public int hashCode() { return Objects.hash(voice_note, caption); }

    @Override
    public String toString() { return "RichBlockVoiceNote{voice_note=" + voice_note + ", caption=" + caption + "}"; }
}
