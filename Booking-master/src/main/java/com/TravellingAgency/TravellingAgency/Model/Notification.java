package com.TravellingAgency.TravellingAgency.Model;

public class Notification {
    private int id;
    private String recipient;
    private String content;
    private String type; // Email or SMS
    private boolean sent;

    public Notification(int id, String recipient, String content, String type, boolean sent) {
        this.id = id;
        this.recipient = recipient;
        this.content = content;
        this.type = type;
        this.sent = sent;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}