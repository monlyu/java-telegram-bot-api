package com.pengrad.telegrambot.model.rich;

import java.util.Objects;

public class RichTextMathematicalExpression extends RichText {
    private final static long serialVersionUID = 0L;
    public static final String TYPE = "mathematical_expression";

    private String expression;

    public String expression() { return expression; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RichTextMathematicalExpression that = (RichTextMathematicalExpression) o;
        return Objects.equals(expression, that.expression);
    }

    @Override
    public int hashCode() { return Objects.hash(expression); }

    @Override
    public String toString() {
        return "RichTextMathematicalExpression{expression='" + expression + "'}";
    }
}
