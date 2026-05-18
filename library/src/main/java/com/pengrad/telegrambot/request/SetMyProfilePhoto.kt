package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.model.inputprofilephoto.InputProfilePhoto
import com.pengrad.telegrambot.response.BaseResponse
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class SetMyProfilePhoto(
    photo: InputProfilePhoto
) : KBaseRequest<SetMyProfilePhoto, BaseResponse>(BaseResponse::class) {

    val photo: InputProfilePhoto by requestParameter(photo)

}
