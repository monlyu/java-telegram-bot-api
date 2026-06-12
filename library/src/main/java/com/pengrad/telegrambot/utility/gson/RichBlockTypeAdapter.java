package com.pengrad.telegrambot.utility.gson;

import com.google.gson.*;
import com.pengrad.telegrambot.model.rich.*;

import java.lang.reflect.Type;

public class RichBlockTypeAdapter implements JsonDeserializer<RichBlock> {

    @Override
    public RichBlock deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        if (!element.isJsonObject()) {
            return new RichBlock(null);
        }

        JsonObject object = element.getAsJsonObject();
        JsonPrimitive primitive = object.getAsJsonPrimitive("type");
        String discriminator = primitive != null ? primitive.getAsString() : null;

        if (discriminator == null) {
            return new RichBlock(null);
        }

        switch (discriminator) {
            case RichBlockParagraph.TYPE: return context.deserialize(object, RichBlockParagraph.class);
            case RichBlockSectionHeading.TYPE: return context.deserialize(object, RichBlockSectionHeading.class);
            case RichBlockPreformatted.TYPE: return context.deserialize(object, RichBlockPreformatted.class);
            case RichBlockFooter.TYPE: return context.deserialize(object, RichBlockFooter.class);
            case RichBlockDivider.TYPE: return context.deserialize(object, RichBlockDivider.class);
            case RichBlockMathematicalExpression.TYPE: return context.deserialize(object, RichBlockMathematicalExpression.class);
            case RichBlockAnchor.TYPE: return context.deserialize(object, RichBlockAnchor.class);
            case RichBlockList.TYPE: return context.deserialize(object, RichBlockList.class);
            case RichBlockBlockQuotation.TYPE: return context.deserialize(object, RichBlockBlockQuotation.class);
            case RichBlockPullQuotation.TYPE: return context.deserialize(object, RichBlockPullQuotation.class);
            case RichBlockCollage.TYPE: return context.deserialize(object, RichBlockCollage.class);
            case RichBlockSlideshow.TYPE: return context.deserialize(object, RichBlockSlideshow.class);
            case RichBlockTable.TYPE: return context.deserialize(object, RichBlockTable.class);
            case RichBlockDetails.TYPE: return context.deserialize(object, RichBlockDetails.class);
            case RichBlockMap.TYPE: return context.deserialize(object, RichBlockMap.class);
            case RichBlockAnimation.TYPE: return context.deserialize(object, RichBlockAnimation.class);
            case RichBlockAudio.TYPE: return context.deserialize(object, RichBlockAudio.class);
            case RichBlockPhoto.TYPE: return context.deserialize(object, RichBlockPhoto.class);
            case RichBlockVideo.TYPE: return context.deserialize(object, RichBlockVideo.class);
            case RichBlockVoiceNote.TYPE: return context.deserialize(object, RichBlockVoiceNote.class);
            case RichBlockThinking.TYPE: return context.deserialize(object, RichBlockThinking.class);
            default: return new RichBlock(discriminator);
        }
    }
}
