package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class LivePhoto implements Serializable {
    private final static long serialVersionUID = 0L;

    private PhotoSize[] photo;
    private String file_id;
    private String file_unique_id;
    private Integer width;
    private Integer height;
    private Integer duration;
    private String mime_type;
    private Long file_size;

    public PhotoSize[] photo() {
        return photo;
    }

    public String fileId() {
        return file_id;
    }

    public String fileUniqueId() {
        return file_unique_id;
    }

    public Integer width() {
        return width;
    }

    public Integer height() {
        return height;
    }

    public Integer duration() {
        return duration;
    }

    public String mimeType() {
        return mime_type;
    }

    public Long fileSize() {
        return file_size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivePhoto livePhoto = (LivePhoto) o;
        return Objects.equals(file_id, livePhoto.file_id) &&
                Objects.equals(file_unique_id, livePhoto.file_unique_id) &&
                Objects.equals(width, livePhoto.width) &&
                Objects.equals(height, livePhoto.height) &&
                Objects.equals(duration, livePhoto.duration) &&
                Objects.equals(mime_type, livePhoto.mime_type) &&
                Objects.equals(file_size, livePhoto.file_size) &&
                Arrays.equals(photo, livePhoto.photo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(file_id, file_unique_id, width, height, duration, mime_type, file_size);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }

    @Override
    public String toString() {
        return "LivePhoto{" +
                "photo=" + Arrays.toString(photo) +
                ", file_id='" + file_id + '\'' +
                ", file_unique_id='" + file_unique_id + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", duration=" + duration +
                ", mime_type='" + mime_type + '\'' +
                ", file_size=" + file_size +
                '}';
    }
}
