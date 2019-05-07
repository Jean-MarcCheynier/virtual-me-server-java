package jmcheynier.apps.portfolio.websocket;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;

import jmcheynier.apps.portfolio.models.Message2;

public class MessageDecoder implements Decoder.Text<Message2> {

    private static Gson gson = new Gson();

    @Override
    public Message2 decode(String s) throws DecodeException {
        Message2 message = gson.fromJson(s, Message2.class);
        return message;
    }

    @Override
    public boolean willDecode(String s) {
        return (s != null);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
    }

    @Override
    public void destroy() {
        // Close resources
    }
}