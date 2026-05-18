package com.pengrad.telegrambot.model

data class VideoQuality(
    @get:JvmName("fileId") val fileId: String,
    @get:JvmName("fileUniqueId") val fileUniqueId: String,
    @get:JvmName("width") val width: Int,
    @get:JvmName("height") val height: Int,
    @get:JvmName("codec") val codec: String,
    @get:JvmName("fileSize") val fileSize: Long? = null
)
