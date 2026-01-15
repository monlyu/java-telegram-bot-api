package com.pengrad.telegrambot.model.request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Stas Parshin
 * 06 May 2016
 */
public abstract class InputMessageContent implements Serializable {
    private final static long serialVersionUID = 0L;

    @SerializedName("@targetClass")
    private String targetClass;

    InputMessageContent() {
        this.targetClass = this.getClass().getName();
    }

}
