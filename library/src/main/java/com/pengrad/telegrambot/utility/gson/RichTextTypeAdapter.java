package com.pengrad.telegrambot.utility.gson;

import com.google.gson.*;
import com.pengrad.telegrambot.model.rich.*;

import java.lang.reflect.Type;

public class RichTextTypeAdapter implements JsonDeserializer<RichText> {

    @Override
    public RichText deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        if (element.isJsonPrimitive()) {
            JsonObject obj = new JsonObject();
            obj.addProperty("text", element.getAsString());
            return context.deserialize(obj, RichTextPlain.class);
        }

        if (element.isJsonArray()) {
            JsonArray jsonArray = element.getAsJsonArray();
            RichText[] texts = new RichText[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); i++) {
                texts[i] = context.deserialize(jsonArray.get(i), RichText.class);
            }
            return new RichTextArray(texts);
        }

        if (element.isJsonObject()) {
            JsonObject object = element.getAsJsonObject();
            JsonPrimitive primitive = object.getAsJsonPrimitive("type");
            String discriminator = primitive != null ? primitive.getAsString() : null;

            if (discriminator == null) {
                return context.deserialize(object, RichTextPlain.class);
            }

            switch (discriminator) {
                case RichTextBold.TYPE: return context.deserialize(object, RichTextBold.class);
                case RichTextItalic.TYPE: return context.deserialize(object, RichTextItalic.class);
                case RichTextUnderline.TYPE: return context.deserialize(object, RichTextUnderline.class);
                case RichTextStrikethrough.TYPE: return context.deserialize(object, RichTextStrikethrough.class);
                case RichTextSpoiler.TYPE: return context.deserialize(object, RichTextSpoiler.class);
                case RichTextDateTime.TYPE: return context.deserialize(object, RichTextDateTime.class);
                case RichTextTextMention.TYPE: return context.deserialize(object, RichTextTextMention.class);
                case RichTextSubscript.TYPE: return context.deserialize(object, RichTextSubscript.class);
                case RichTextSuperscript.TYPE: return context.deserialize(object, RichTextSuperscript.class);
                case RichTextMarked.TYPE: return context.deserialize(object, RichTextMarked.class);
                case RichTextCode.TYPE: return context.deserialize(object, RichTextCode.class);
                case RichTextCustomEmoji.TYPE: return context.deserialize(object, RichTextCustomEmoji.class);
                case RichTextMathematicalExpression.TYPE: return context.deserialize(object, RichTextMathematicalExpression.class);
                case RichTextUrl.TYPE: return context.deserialize(object, RichTextUrl.class);
                case RichTextEmailAddress.TYPE: return context.deserialize(object, RichTextEmailAddress.class);
                case RichTextPhoneNumber.TYPE: return context.deserialize(object, RichTextPhoneNumber.class);
                case RichTextBankCardNumber.TYPE: return context.deserialize(object, RichTextBankCardNumber.class);
                case RichTextMention.TYPE: return context.deserialize(object, RichTextMention.class);
                case RichTextHashtag.TYPE: return context.deserialize(object, RichTextHashtag.class);
                case RichTextCashtag.TYPE: return context.deserialize(object, RichTextCashtag.class);
                case RichTextBotCommand.TYPE: return context.deserialize(object, RichTextBotCommand.class);
                case RichTextAnchor.TYPE: return context.deserialize(object, RichTextAnchor.class);
                case RichTextAnchorLink.TYPE: return context.deserialize(object, RichTextAnchorLink.class);
                case RichTextReference.TYPE: return context.deserialize(object, RichTextReference.class);
                case RichTextReferenceLink.TYPE: return context.deserialize(object, RichTextReferenceLink.class);
                default: return new RichText(discriminator);
            }
        }

        return new RichText(null);
    }
}
