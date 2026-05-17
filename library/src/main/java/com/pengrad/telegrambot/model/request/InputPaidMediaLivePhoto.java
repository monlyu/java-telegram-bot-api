package com.pengrad.telegrambot.model.request;

import com.pengrad.telegrambot.AttachName;
import com.pengrad.telegrambot.request.ContentTypes;

import java.io.File;
import java.io.Serializable;

public class InputPaidMediaLivePhoto extends InputPaidMedia implements Serializable {

    private final static long serialVersionUID = 1L;

    private String photo;

    public InputPaidMediaLivePhoto(String media) {
        super("live_photo", media);
    }

    public InputPaidMediaLivePhoto(File media) {
        super("live_photo", media);
    }

    public InputPaidMediaLivePhoto(byte[] media) {
        super("live_photo", media);
    }

    public InputPaidMediaLivePhoto photo(String photo) {
        this.photo = photo;
        return this;
    }

    public InputPaidMediaLivePhoto photo(File photo) {
        this.photo = addAttachment(photo);
        return this;
    }

    public InputPaidMediaLivePhoto photo(byte[] photo) {
        this.photo = addAttachment(photo);
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
