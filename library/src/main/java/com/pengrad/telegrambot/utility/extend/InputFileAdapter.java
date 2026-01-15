package com.pengrad.telegrambot.utility.extend;


import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.pengrad.telegrambot.model.request.InputFile;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Map;

public class InputFileAdapter extends TypeAdapter<InputFile> {

    private static final String TYPE = "type";
    private static final String DATA = "data";
    private static final String FILE_NAME = "file_name";
    private static final String CONTENT_TYPE = "content_type";
    private static final String TYPE_FILE = "file";
    private static final String TYPE_BYTES = "bytes";

    public static InputFile backToFile(Map<String, Object> valueMap) {
        String type = (String) valueMap.remove(TYPE);
        String fileName = (String) valueMap.remove(FILE_NAME);
        String contentType = (String) valueMap.remove(CONTENT_TYPE);
        String data = (String) valueMap.remove(DATA);
        if (type.equals(TYPE_FILE)) {
            return new InputFile(new File(data), fileName, contentType);
        } else if (type.equals(TYPE_BYTES)) {
            return new InputFile(Base64.getDecoder().decode(data), fileName, contentType);
        }
        return null;
    }

    @Override
    public void write(JsonWriter out, InputFile value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        out.beginObject();
        out.name(FILE_NAME).value(value.getFileName());
        out.name(CONTENT_TYPE).value(value.getContentType());
        if (value.getFile() != null) {
            out.name(TYPE).value(TYPE_FILE);
            out.name(DATA).value(value.getFile().getAbsolutePath());
        } else if (value.getBytes() != null) {
            out.name(TYPE).value(TYPE_BYTES);
            out.name(DATA).value(Base64.getEncoder().encodeToString(value.getBytes()));
        }
        out.name("isInputFile").value(true);
        out.endObject();
    }

    @Override
    public InputFile read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        in.beginObject();
        String type = null;
        String data = null;
        String fileName = null;
        String contentType = null;
        while (in.hasNext()) {
            switch (in.nextName()) {
                case TYPE:
                    type = in.nextString();
                    break;
                case DATA:
                    data = in.nextString();
                    break;
                case FILE_NAME:
                    fileName = in.nextString();
                    break;
                case CONTENT_TYPE:
                    contentType = in.nextString();
                    break;
            }
        }
        in.endObject();

        if (type == null || data == null) {
            return null;
        }

        if (type.equals(TYPE_FILE)) {
            return new InputFile(new File(data), fileName, contentType);
        } else if (type.equals(TYPE_BYTES)) {
            return new InputFile(Base64.getDecoder().decode(data), fileName, contentType);
        }

        return null;
    }
}
