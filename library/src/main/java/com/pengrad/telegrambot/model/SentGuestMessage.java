package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Objects;

public class SentGuestMessage implements Serializable {
    private final static long serialVersionUID = 0L;

    private String inline_message_id;

    public SentGuestMessage() {
    }

    public SentGuestMessage(String inlineMessageId) {
        this.inline_message_id = inlineMessageId;
    }

    public String inlineMessageId() {
        return inline_message_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SentGuestMessage that = (SentGuestMessage) o;
        return Objects.equals(inline_message_id, that.inline_message_id);
    }

    @Override
    public int hashCode() {
        return inline_message_id != null ? inline_message_id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "SentGuestMessage{" +
                "inline_message_id='" + inline_message_id + '\'' +
                '}';
    }
}
