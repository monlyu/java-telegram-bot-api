package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextBankCardNumber extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "bank_card_number";

    private RichText text;
    private String bank_card_number;

    public RichText text() { return text; }
    public String bankCardNumber() { return bank_card_number; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextBankCardNumber that = (RichTextBankCardNumber) o;
        return Objects.equals(text, that.text) && Objects.equals(bank_card_number, that.bank_card_number);
    }

    @Override
    public int hashCode() { return Objects.hash(text, bank_card_number); }

    @Override
    public String toString() {
        return "RichTextBankCardNumber{text=" + text + ", bank_card_number='" + bank_card_number + "'}";
    }
}
