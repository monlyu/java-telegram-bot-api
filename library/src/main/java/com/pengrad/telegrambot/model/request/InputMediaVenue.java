package com.pengrad.telegrambot.model.request;

import java.io.Serializable;

public class InputMediaVenue implements Serializable {
    private final static long serialVersionUID = 1L;

    private final String type = "venue";
    private final Float latitude;
    private final Float longitude;
    private final String title;
    private final String address;
    private String foursquare_id;
    private String foursquare_type;
    private String google_place_id;
    private String google_place_type;

    public InputMediaVenue(float latitude, float longitude, String title, String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

    public InputMediaVenue foursquareId(String foursquareId) {
        this.foursquare_id = foursquareId;
        return this;
    }

    public InputMediaVenue foursquareType(String foursquareType) {
        this.foursquare_type = foursquareType;
        return this;
    }

    public InputMediaVenue googlePlaceId(String googlePlaceId) {
        this.google_place_id = googlePlaceId;
        return this;
    }

    public InputMediaVenue googlePlaceType(String googlePlaceType) {
        this.google_place_type = googlePlaceType;
        return this;
    }
}
