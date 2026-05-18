package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * Stas Parshin
 * 17 April 2019
 */
public class PollOption implements Serializable {
    private final static long serialVersionUID = 0L;

    private String persistent_id;
    private String text;
    private Integer voter_count;
    private MessageEntity[] text_entities;
    private PollMedia media;
    private User added_by_user;
    private Chat added_by_chat;
    private Integer addition_date;

    public String persistentId() {
        return persistent_id;
    }

    public String text() {
        return text;
    }

    public Integer voterCount() {
        return voter_count;
    }

    public MessageEntity[] textEntities() {
        return text_entities;
    }

    public PollMedia media() {
        return media;
    }

    public User addedByUser() {
        return added_by_user;
    }

    public Chat addedByChat() {
        return added_by_chat;
    }

    public Integer additionDate() {
        return addition_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PollOption that = (PollOption) o;

        if (!Arrays.equals(text_entities, that.text_entities)) return false;

        return Objects.equals(persistent_id, that.persistent_id) &&
                Objects.equals(text, that.text) &&
                Objects.equals(voter_count, that.voter_count) &&
                Objects.equals(media, that.media) &&
                Objects.equals(added_by_user, that.added_by_user) &&
                Objects.equals(added_by_chat, that.added_by_chat) &&
                Objects.equals(addition_date, that.addition_date);
    }

    @Override
    public int hashCode() {
        int result = persistent_id != null ? persistent_id.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (voter_count != null ? voter_count.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PollOption{" +
                "persistent_id='" + persistent_id + '\'' +
                ", text='" + text + '\'' +
                ", voter_count=" + voter_count +
                ", text_entities=" + Arrays.toString(text_entities) +
                ", media=" + media +
                ", added_by_user=" + added_by_user +
                ", added_by_chat=" + added_by_chat +
                ", addition_date=" + addition_date +
                '}';
    }
}
