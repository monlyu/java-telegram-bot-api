package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.model.rich.InputRichMessage
import com.pengrad.telegrambot.response.BaseResponse
import com.pengrad.telegrambot.utility.kotlin.optionalRequestParameter
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class SendRichMessageDraft(
    chatId: Long,
    draftId: Int,
    richMessage: InputRichMessage
) : KBaseRequest<SendRichMessageDraft, BaseResponse>(BaseResponse::class) {

    val chatId: Long by requestParameter(chatId)
    val draftId: Int by requestParameter(draftId)
    val richMessage: InputRichMessage by requestParameter(richMessage)

    var messageThreadId: Long? by optionalRequestParameter()

    fun messageThreadId(messageThreadId: Long) = applySelf { this.messageThreadId = messageThreadId }
}
