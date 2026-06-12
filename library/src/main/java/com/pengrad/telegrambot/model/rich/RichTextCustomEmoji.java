package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextCustomEmoji extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "custom_emoji";

    private String custom_emoji_id;
    private String alternative_text;

    public String customEmojiId() { return custom_emoji_id; }
    public String alternativeText() { return alternative_text; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextCustomEmoji that = (RichTextCustomEmoji) o;
        return Objects.equals(custom_emoji_id, that.custom_emoji_id) && Objects.equals(alternative_text, that.alternative_text);
    }

    @Override
    public int hashCode() { return Objects.hash(custom_emoji_id, alternative_text); }

    @Override
    public String toString() {
        return "RichTextCustomEmoji{custom_emoji_id='" + custom_emoji_id + "', alternative_text='" + alternative_text + "'}";
    }
}
