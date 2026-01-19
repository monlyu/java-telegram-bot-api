package com.pengrad.telegrambot.utility;

import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.User;

public class Updates {

    public static Chat FromChat(Update update) {
        if (update.message() != null) return update.message().chat();
        if (update.editedMessage() != null) return update.editedMessage().chat();
        if (update.channelPost() != null) return update.channelPost().chat();
        if (update.editedChannelPost() != null) return update.editedChannelPost().chat();
        if (update.businessMessage() != null) return update.businessMessage().chat();
        if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().chat();
        if (update.deletedBusinessMessages() != null) return update.deletedBusinessMessages().chat();
        if (update.myChatMember() != null) return update.myChatMember().chat();
        if (update.chatMember() != null) return update.chatMember().chat();
        if (update.chatJoinRequest() != null) return update.chatJoinRequest().chat();
        if (update.messageReaction() != null) return update.messageReaction().chat();
        if (update.messageReactionCount() != null) return update.messageReactionCount().chat();
        if (update.chatBoost() != null) return update.chatBoost().chat();
        if (update.removedChatBoost() != null) return update.removedChatBoost().chat();
        if (update.callbackQuery() != null && update.callbackQuery().message() != null)
            return update.callbackQuery().message().chat();
        return null;
    }

    public static User sendFrom(Update update) {
        if (update.message() != null) return update.message().from();
        if (update.editedMessage() != null) return update.editedMessage().from();
        if (update.channelPost() != null) return update.channelPost().from();
        if (update.editedChannelPost() != null) return update.editedChannelPost().from();
        if (update.businessConnection() != null) return update.businessConnection().user();
        if (update.businessMessage() != null) return update.businessMessage().from();
        if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().from();
        if (update.inlineQuery() != null) return update.inlineQuery().from();
        if (update.chosenInlineResult() != null) return update.chosenInlineResult().from();
        if (update.callbackQuery() != null) return update.callbackQuery().from();
        if (update.shippingQuery() != null) return update.shippingQuery().from();
        if (update.preCheckoutQuery() != null) return update.preCheckoutQuery().from();
        if (update.pollAnswer() != null) return update.pollAnswer().user();
        if (update.myChatMember() != null) return update.myChatMember().from();
        if (update.chatMember() != null) return update.chatMember().from();
        if (update.chatJoinRequest() != null) return update.chatJoinRequest().from();
        if (update.messageReaction() != null) return update.messageReaction().user();
        return null;
    }

    public static Message message(Update update) {
        if (update.message() != null) return update.message();
        if (update.editedMessage() != null) return update.editedMessage();
        if (update.channelPost() != null) return update.channelPost();
        if (update.editedChannelPost() != null) return update.editedChannelPost();
        if (update.businessMessage() != null) return update.businessMessage();
        if (update.editedBusinessMessage() != null) return update.editedBusinessMessage();
        if (update.callbackQuery() != null) {
            return update.callbackQuery().message();
        }
        return null;
    }

    public static String callbackData(Update update) {
        if (update.callbackQuery() != null) return update.callbackQuery().data();
        return null;
    }

    public static String messageId(Update update) {
        Message message = message(update);
        if (message != null) return "" + message.messageId();
        return "-";
    }
}