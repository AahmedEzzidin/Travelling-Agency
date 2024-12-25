package com.TravellingAgency.TravellingAgency.Model;

public class Booking {
    private int id;
    private String type; // Hotel or Event
    private int userId;
    private int itemId; // Hotel or Event ID

    public Booking(int id, String type, int userId, int itemId) {
        this.id = id;
        this.type = type;
        this.userId = userId;
        this.itemId = itemId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId =itemId;
}
}
