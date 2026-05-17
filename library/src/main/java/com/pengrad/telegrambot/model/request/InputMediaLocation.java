package com.pengrad.telegrambot.model.request;

import java.io.Serializable;

public class InputMediaLocation implements Serializable {
    private final static long serialVersionUID = 1L;

    private final String type = "location";
    private final Float latitude;
    private final Float longitude;
    private Float horizontal_accuracy;

    public InputMediaLocation(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public InputMediaLocation horizontalAccuracy(float horizontalAccuracy) {
        this.horizontal_accuracy = horizontalAccuracy;
        return this;
    }
}
