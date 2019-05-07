package jmcheynier.apps.portfolio.websocket;


import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;

import jmcheynier.apps.portfolio.models.Message2;

public class MessageEncoder implements Encoder.Text<Message2> {

    private static Gson gson = new Gson();

    @Override
    public String encode(Message2 message) throws EncodeException {
        String json = gson.toJson(message);
        return json;
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