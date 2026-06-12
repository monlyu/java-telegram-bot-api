package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class PollMedia implements Serializable {
    private final static long serialVersionUID = 0L;

    private Animation animation;
    private Audio audio;
    private Document document;
    private LivePhoto live_photo;
    private Location location;
    private PhotoSize[] photo;
    private Sticker sticker;
    private Venue venue;
    private Video video;
    private Link link;

    public Animation animation() {
        return animation;
    }

    public Audio audio() {
        return audio;
    }

    public Document document() {
        return document;
    }

    public LivePhoto livePhoto() {
        return live_photo;
    }

    public Location location() {
        return location;
    }

    public PhotoSize[] photo() {
        return photo;
    }

    public Sticker sticker() {
        return sticker;
    }

    public Venue venue() {
        return venue;
    }

    public Video video() {
        return video;
    }

    public Link link() {
        return link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PollMedia that = (PollMedia) o;
        return Objects.equals(animation, that.animation) &&
                Objects.equals(audio, that.audio) &&
                Objects.equals(document, that.document) &&
                Objects.equals(live_photo, that.live_photo) &&
                Objects.equals(location, that.location) &&
                Arrays.equals(photo, that.photo) &&
                Objects.equals(sticker, that.sticker) &&
                Objects.equals(venue, that.venue) &&
                Objects.equals(video, that.video) &&
                Objects.equals(link, that.link);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(animation, audio, document, live_photo, location, sticker, venue, video, link);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }

    @Override
    public String toString() {
        return "PollMedia{" +
                "animation=" + animation +
                ", audio=" + audio +
                ", document=" + document +
                ", live_photo=" + live_photo +
                ", location=" + location +
                ", photo=" + Arrays.toString(photo) +
                ", sticker=" + sticker +
                ", venue=" + venue +
                ", video=" + video +
                ", link=" + link +
                '}';
    }
}
