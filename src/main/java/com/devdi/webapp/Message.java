package com.devdi.webapp;

import java.io.Serializable;

/**
 * Created by devdi on 10/5/14.
 */
public class Message implements Serializable{

    private String sender;
    private String text;

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

}
