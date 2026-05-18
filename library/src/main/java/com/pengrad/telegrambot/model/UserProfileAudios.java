package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class UserProfileAudios implements Serializable {
    private final static long serialVersionUID = 0L;

    private Integer total_count;
    private Audio[] audios;

    public Integer totalCount() {
        return total_count;
    }

    public Audio[] audios() {
        return audios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfileAudios that = (UserProfileAudios) o;
        return Objects.equals(total_count, that.total_count) && Arrays.equals(audios, that.audios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(total_count);
        result = 31 * result + Arrays.hashCode(audios);
        return result;
    }

    @Override
    public String toString() {
        return "UserProfileAudios{" +
                "total_count=" + total_count +
                ", audios=" + Arrays.toString(audios) +
                '}';
    }
}
