package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextBotCommand extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "bot_command";

    private RichText text;
    private String bot_command;

    public RichText text() { return text; }
    public String botCommand() { return bot_command; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextBotCommand that = (RichTextBotCommand) o;
        return Objects.equals(text, that.text) && Objects.equals(bot_command, that.bot_command);
    }

    @Override
    public int hashCode() { return Objects.hash(text, bot_command); }

    @Override
    public String toString() {
        return "RichTextBotCommand{text=" + text + ", bot_command='" + bot_command + "'}";
    }
}
