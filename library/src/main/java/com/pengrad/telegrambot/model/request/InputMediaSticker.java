package com.pengrad.telegrambot.model.request;

import com.pengrad.telegrambot.request.ContentTypes;

import java.io.File;
import java.io.Serializable;

public class InputMediaSticker extends InputMedia<InputMediaSticker> implements Serializable {
    private final static long serialVersionUID = 1L;

    private String emoji;

    public InputMediaSticker(String media) {
        super("sticker", media);
    }

    public InputMediaSticker(File media) {
        super("sticker", media);
    }

    public InputMediaSticker(byte[] media) {
        super("sticker", media);
    }

    public InputMediaSticker emoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    @Override
    public String getDefaultFileName() {
        return ContentTypes.PHOTO_FILE_NAME;
    }

    @Override
    public String getDefaultContentType() {
        return ContentTypes.PHOTO_MIME_TYPE;
    }
}
