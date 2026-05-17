package com.pengrad.telegrambot.model.paidmedia;

import com.pengrad.telegrambot.model.LivePhoto;

import java.util.Objects;

public class PaidMediaLivePhoto extends PaidMedia {

    public final static String TYPE = "live_photo";

    private LivePhoto live_photo;

    public PaidMediaLivePhoto() {
        super(TYPE);
    }

    public LivePhoto getLivePhoto() {
        return live_photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaidMediaLivePhoto that = (PaidMediaLivePhoto) o;
        return Objects.equals(type(), that.type()) &&
                Objects.equals(live_photo, that.live_photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type(), live_photo);
    }

    @Override
    public String toString() {
        return "PaidMediaLivePhoto{" +
                "live_photo=" + live_photo +
                '}';
    }
}
