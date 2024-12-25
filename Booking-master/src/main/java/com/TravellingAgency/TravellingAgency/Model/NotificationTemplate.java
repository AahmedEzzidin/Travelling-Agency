package com.TravellingAgency.TravellingAgency.Model;

public class NotificationTemplate {
    private int id;
    private String content;
    private String type; // Email or SMS

    public NotificationTemplate(int id, String content, String type) {
        this.id = id;
        this.content = content;
        this.type = type;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}