package com.TravellingAgency.TravellingAgency.Model;

public class Hotel {
    private String name;
    private String location;
    private float rate;

    public Hotel(String name, String location, float rate) {
        this.name = name;
        this.location = location;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public float getRate() {
        return rate;
    }
}
