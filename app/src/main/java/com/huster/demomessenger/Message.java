package com.huster.demomessenger;

import java.util.ArrayList;
import java.util.List;

public class Message {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Message(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    private String name;
    private String msg;

    public static List<Message> getFakeData() {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("OK 1", "1"));
        messages.add(new Message("OK 2", "1"));
        messages.add(new Message("OK 3", "1"));
        messages.add(new Message("OK 4", "1"));
        messages.add(new Message("OK 5", "1"));
        messages.add(new Message("OK 6", "1"));
        messages.add(new Message("OK 1", "1"));
        messages.add(new Message("OK 2", "1"));
        messages.add(new Message("OK 3", "1"));
        messages.add(new Message("OK 4", "1"));
        messages.add(new Message("OK 5", "1"));
        messages.add(new Message("OK 6", "1"));
        messages.add(new Message("OK 1", "1"));
        messages.add(new Message("OK 2", "1"));
        messages.add(new Message("OK 3", "1"));
        messages.add(new Message("OK 4", "1"));
        messages.add(new Message("OK 5", "1"));
        messages.add(new Message("OK 6", "1"));
        messages.add(new Message("OK 1", "1"));
        messages.add(new Message("OK 2", "1"));
        messages.add(new Message("OK 3", "1"));
        messages.add(new Message("OK 4", "1"));
        messages.add(new Message("OK 5", "1"));
        messages.add(new Message("OK 6", "1"));
        messages.add(new Message("OK 1", "1"));
        messages.add(new Message("OK 2", "1"));
        messages.add(new Message("OK 3", "1"));
        messages.add(new Message("OK 4", "1"));
        messages.add(new Message("OK 5", "1"));
        messages.add(new Message("OK 6", "1"));
        messages.add(new Message("OK 1", "1"));
        messages.add(new Message("OK 2", "1"));
        messages.add(new Message("OK 3", "1"));
        messages.add(new Message("OK 4", "1"));
        messages.add(new Message("OK 5", "1"));
        messages.add(new Message("OK 6", "1"));
        messages.add(new Message("OK 1", "1"));
        messages.add(new Message("OK 2", "1"));
        messages.add(new Message("OK 3", "1"));
        messages.add(new Message("OK 4", "1"));
        messages.add(new Message("OK 5", "1"));
        messages.add(new Message("OK 6", "1"));
        return messages;
    }
}
