package com.pengrad.telegrambot;

import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.UniversalRequest;
import org.junit.Test;

import java.io.IOException;


public class UniversalRequestTest {

    @Test
    public void sendMessage() throws IOException {
        SendMessage sendMessage = new SendMessage(123456789, "Hello");
        String json = sendMessage.toJson();
        System.err.println(json);
        UniversalRequest universalRequest = UniversalRequest.makeFromJson(json);
        System.err.println(universalRequest.getParameters());

    }

}
