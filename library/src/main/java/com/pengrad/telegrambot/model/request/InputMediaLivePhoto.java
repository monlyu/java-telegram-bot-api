package com.pengrad.telegrambot.model.request;

import com.pengrad.telegrambot.request.ContentTypes;

import java.io.File;
import java.io.Serializable;

public class InputMediaLivePhoto extends InputMedia<InputMediaLivePhoto> implements Serializable {
    private final static long serialVersionUID = 1L;

    private String photo;
    private Boolean has_spoiler;

    public InputMediaLivePhoto(String media) {
        super("live_photo", media);
    }

    public InputMediaLivePhoto(File media) {
        super("live_photo", media);
    }

    public InputMediaLivePhoto(byte[] media) {
        super("live_photo", media);
    }

    public InputMediaLivePhoto photo(String photo) {
        this.photo = photo;
        return this;
    }

    public InputMediaLivePhoto photo(File photo) {
        this.photo = addAttachment(photo);
        return this;
    }

    public InputMediaLivePhoto photo(byte[] photo) {
        this.photo = addAttachment(photo);
        return this;
    }

    public InputMediaLivePhoto hasSpoiler(boolean hasSpoiler) {
        this.has_spoiler = hasSpoiler;
        return this;
    }

    @Override
    public String getDefaultFileName() {
        return ContentTypes.VIDEO_FILE_NAME;
    }

    @Override
    public String getDefaultContentType() {
        return ContentTypes.VIDEO_MIME_TYPE;
    }
}
