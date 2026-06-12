package com.pengrad.telegrambot.model.request;

import com.pengrad.telegrambot.model.rich.InputRichMessage;
import java.util.Objects;

public class InputRichMessageContent extends InputMessageContent {
    private final static long serialVersionUID = 0L;

    private final InputRichMessage rich_message;

    public InputRichMessageContent(InputRichMessage richMessage) {
        this.rich_message = richMessage;
    }

    public InputRichMessage richMessage() { return rich_message; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputRichMessageContent that = (InputRichMessageContent) o;
        return Objects.equals(rich_message, that.rich_message);
    }

    @Override
    public int hashCode() { return Objects.hash(rich_message); }

    @Override
    public String toString() { return "InputRichMessageContent{rich_message=" + rich_message + "}"; }
}
