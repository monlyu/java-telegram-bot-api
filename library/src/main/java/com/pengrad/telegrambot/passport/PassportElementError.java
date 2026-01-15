package com.pengrad.telegrambot.passport;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Stas Parshin
 * 30 July 2018
 */
public abstract class PassportElementError implements Serializable {
    private final static long serialVersionUID = 0L;

    @SerializedName("@targetClass")
    private String targetClass;

    private final String source;
    private final String type;
    private final String message;

    public PassportElementError(String source, String type, String message) {
        this.targetClass = this.getClass().getName();
        this.source = source;
        this.type = type;
        this.message = message;
    }
}
