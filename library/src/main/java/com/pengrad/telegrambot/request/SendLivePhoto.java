package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.AttachName;
import com.pengrad.telegrambot.model.MessageEntity;
import com.pengrad.telegrambot.model.request.InputFile;
import com.pengrad.telegrambot.model.request.Keyboard;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.model.request.ReplyParameters;
import com.pengrad.telegrambot.model.suggestedposts.SuggestedPostParameters;
import com.pengrad.telegrambot.response.SendResponse;

import java.io.File;

public class SendLivePhoto extends BaseRequest<SendLivePhoto, SendResponse> {

    private boolean isMultipart;

    public SendLivePhoto(Object chatId, Object livePhoto, Object photo) {
        super(SendResponse.class);
        add("chat_id", chatId);
        attach("live_photo", livePhoto);
        attach("photo", photo);
    }

    private void attach(String paramName, Object data) {
        if (data instanceof String) {
            add(paramName, data);
        } else if (data instanceof File) {
            String attachName = AttachName.next();
            add(paramName, "attach://" + attachName);
            add(attachName, new InputFile((File) data, ContentTypes.VIDEO_FILE_NAME, ContentTypes.VIDEO_MIME_TYPE));
            isMultipart = true;
        } else if (data instanceof byte[]) {
            String attachName = AttachName.next();
            add(paramName, "attach://" + attachName);
            add(attachName, new InputFile((byte[]) data, ContentTypes.VIDEO_FILE_NAME, ContentTypes.VIDEO_MIME_TYPE));
            isMultipart = true;
        } else {
            throw new IllegalArgumentException("live_photo / photo must be String, File or byte[]");
        }
    }

    @Override
    public boolean isMultipart() {
        return isMultipart;
    }

    public SendLivePhoto businessConnectionId(String businessConnectionId) {
        return add("business_connection_id", businessConnectionId);
    }

    public SendLivePhoto messageThreadId(int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    public SendLivePhoto directMessagesTopicId(int directMessagesTopicId) {
        return add("direct_messages_topic_id", directMessagesTopicId);
    }

    public SendLivePhoto caption(String caption) {
        return add("caption", caption);
    }

    public SendLivePhoto parseMode(ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public SendLivePhoto captionEntities(MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public SendLivePhoto showCaptionAboveMedia(boolean showCaptionAboveMedia) {
        return add("show_caption_above_media", showCaptionAboveMedia);
    }

    public SendLivePhoto hasSpoiler(boolean hasSpoiler) {
        return add("has_spoiler", hasSpoiler);
    }

    public SendLivePhoto disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public SendLivePhoto protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    public SendLivePhoto allowPaidBroadcast(boolean allowPaidBroadcast) {
        return add("allow_paid_broadcast", allowPaidBroadcast);
    }

    public SendLivePhoto messageEffectId(String messageEffectId) {
        return add("message_effect_id", messageEffectId);
    }

    public SendLivePhoto suggestedPostParameters(SuggestedPostParameters suggestedPostParameters) {
        return add("suggested_post_parameters", suggestedPostParameters);
    }

    public SendLivePhoto replyParameters(ReplyParameters replyParameters) {
        return add("reply_parameters", replyParameters);
    }

    public SendLivePhoto replyMarkup(Keyboard replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}
