package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.model.rich.InputRichMessage
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class SendRichMessage private constructor(
    chatId: Long? = null,
    channelUsername: String? = null,
    richMessage: InputRichMessage
) : AbstractSendRequest<SendRichMessage>(
    chatId = chatId,
    channelUsername = channelUsername
) {

    constructor(chatId: Long, richMessage: InputRichMessage) : this(
        chatId = chatId,
        channelUsername = null,
        richMessage = richMessage
    )

    constructor(channelUsername: String, richMessage: InputRichMessage) : this(
        chatId = null,
        channelUsername = channelUsername,
        richMessage = richMessage
    )

    val richMessage: InputRichMessage by requestParameter(richMessage)
}
