package com.pengrad.telegrambot.model;

import com.pengrad.telegrambot.model.message.MaybeInaccessibleMessage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class PollOptionAdded implements Serializable {
    private final static long serialVersionUID = 0L;

    private MaybeInaccessibleMessage poll_message;
    private String option_persistent_id;
    private String option_text;
    private MessageEntity[] option_text_entities;

    public MaybeInaccessibleMessage pollMessage() {
        return poll_message;
    }

    public String optionPersistentId() {
        return option_persistent_id;
    }

    public String optionText() {
        return option_text;
    }

    public MessageEntity[] optionTextEntities() {
        return option_text_entities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PollOptionAdded that = (PollOptionAdded) o;
        return Objects.equals(poll_message, that.poll_message) &&
                Objects.equals(option_persistent_id, that.option_persistent_id) &&
                Objects.equals(option_text, that.option_text) &&
                Arrays.equals(option_text_entities, that.option_text_entities);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(poll_message, option_persistent_id, option_text);
        result = 31 * result + Arrays.hashCode(option_text_entities);
        return result;
    }

    @Override
    public String toString() {
        return "PollOptionAdded{" +
                "poll_message=" + poll_message +
                ", option_persistent_id='" + option_persistent_id + '\'' +
                ", option_text='" + option_text + '\'' +
                ", option_text_entities=" + Arrays.toString(option_text_entities) +
                '}';
    }
}
