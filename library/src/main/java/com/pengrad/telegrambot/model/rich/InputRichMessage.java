package com.pengrad.telegrambot.model.rich;

import java.io.Serializable;
import java.util.Objects;

public class InputRichMessage implements Serializable {
    private final static long serialVersionUID = 0L;

    private String html;
    private String markdown;
    private Boolean is_rtl;
    private Boolean skip_entity_detection;

    public static InputRichMessage fromHtml(String html) {
        InputRichMessage msg = new InputRichMessage();
        msg.html = html;
        return msg;
    }

    public static InputRichMessage fromMarkdown(String markdown) {
        InputRichMessage msg = new InputRichMessage();
        msg.markdown = markdown;
        return msg;
    }

    public InputRichMessage isRtl(Boolean isRtl) {
        this.is_rtl = isRtl;
        return this;
    }

    public InputRichMessage skipEntityDetection(Boolean skipEntityDetection) {
        this.skip_entity_detection = skipEntityDetection;
        return this;
    }

    public String html() { return html; }
    public String markdown() { return markdown; }
    public Boolean isRtl() { return is_rtl; }
    public Boolean skipEntityDetection() { return skip_entity_detection; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputRichMessage that = (InputRichMessage) o;
        return Objects.equals(html, that.html) && Objects.equals(markdown, that.markdown) &&
               Objects.equals(is_rtl, that.is_rtl) && Objects.equals(skip_entity_detection, that.skip_entity_detection);
    }

    @Override
    public int hashCode() { return Objects.hash(html, markdown, is_rtl, skip_entity_detection); }

    @Override
    public String toString() {
        return "InputRichMessage{html='" + html + "', markdown='" + markdown + "', is_rtl=" + is_rtl + ", skip_entity_detection=" + skip_entity_detection + "}";
    }
}
