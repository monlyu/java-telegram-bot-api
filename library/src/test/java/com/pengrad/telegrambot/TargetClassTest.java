package com.pengrad.telegrambot;

import com.pengrad.telegrambot.model.request.*;
import com.pengrad.telegrambot.request.*;
import com.pengrad.telegrambot.request.UniversalRequest;
import com.pengrad.telegrambot.response.BaseResponse;
import okhttp3.OkHttpClient;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TargetClassTest {

    private static final String BOT_TOKEN = "8328125347:AAF-aVHVKxdRps1s-2_WLbiMVSLahywUX-g";
    private static final String username_id = "7854124062";

    @Test
    public void testUpdates() throws IOException {

        Path resourcePath = Paths.get("src/test/resources");
        File audioFile = resourcePath.resolve("image.jpg").toFile();

        SendPhoto photo = new SendPhoto(username_id, audioFile);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.addRow(new InlineKeyboardButton("百度").url("https://www.pengrad.com"));
        photo.replyMarkup(keyboard);
        String json = photo.toJson();
        System.out.println(json);

        UniversalRequest universalRequest = UniversalRequest.makeFromJson(json);
        System.out.println(universalRequest);
        sendRequest(universalRequest);
    }

    @Test
    public void testPaidMedia() throws IOException {

        Path resourcePath = Paths.get("src/test/resources");
        File audioFile = resourcePath.resolve("beep.mp3").toFile();

        SendAudio audio = new SendAudio("@username", audioFile);
        String json = audio.toJson();
        System.out.println(json);

        UniversalRequest universalRequest = UniversalRequest.makeFromJson(json);
        System.out.println(universalRequest);
        String log = universalRequest.logParams();
        System.out.println(log);

        byte[] files = Files.readAllBytes(audioFile.toPath());

        SetWebhook setWebhook = new SetWebhook();
        setWebhook.certificate(files);
        setWebhook.url("https://www.google.com");
        String webhooks = setWebhook.toJson();
        System.out.println(webhooks);

        UniversalRequest universalRequest2 = UniversalRequest.makeFromJson(webhooks);
        System.out.println(universalRequest2);

        log = universalRequest2.logParams();
        System.out.println(log);

    }

    @Test
    public void testVideoAttch() throws IOException {
        Path resourcePath = Paths.get("src/test/resources");
        File videoFile = resourcePath.resolve("tabs.mp4").toFile();
        SendVideo sendVideo = new SendVideo("@username", videoFile);

        File thumb = resourcePath.resolve("image.jpg").toFile();
        sendVideo.thumbnail(thumb);

        File cover = resourcePath.resolve("image.png").toFile();
        byte[] covers = Files.readAllBytes(cover.toPath());
        sendVideo.coverBytes(covers);

        String json = sendVideo.toJson();
        System.out.println(json);

        BaseRequest universalRequest2 = UniversalRequest.makeFromJson(json);
        System.out.println(universalRequest2);
    }

    @Test
    public void testSendPaidMedia() {

        Path resourcePath = Paths.get("src/test/resources");
        File iamge = resourcePath.resolve("image.jpg").toFile();
        InputPaidMediaPhoto photo = new InputPaidMediaPhoto(iamge);

        File videoFile = resourcePath.resolve("tabs.mp4").toFile();
        InputPaidMediaVideo video = new InputPaidMediaVideo(videoFile);
        video.thumbnail(iamge);

        SendPaidMedia paidMedia = new SendPaidMedia(username_id, 10, video, photo);
        paidMedia.replyMarkup(new InlineKeyboardMarkup(new InlineKeyboardButton("联系客服")
                .url("https://t.me/mmxtwit")));
        String json = paidMedia.toJson();
        System.out.println(json);

        UniversalRequest universalRequest2 = UniversalRequest.makeFromJson(json);
        System.out.println(universalRequest2);
        sendRequest(universalRequest2);

        String log = universalRequest2.logParams();
        System.out.println(log);
    }


    public void sendRequest(BaseRequest request) {
        // 设置您的代理
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 10808));
        // 创建一个配置了代理的 OkHttpClient
        OkHttpClient client = new OkHttpClient.Builder()
                .proxy(proxy)
                .build();
        // 使用自定义的 client 构建 TelegramBot
        TelegramBot bot = new TelegramBot.Builder(BOT_TOKEN)
                .okHttpClient(client)
                .build();
        BaseResponse response = bot.execute(request);
        System.out.println(response);
    }

}
