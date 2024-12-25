package com.TravellingAgency.TravellingAgency.Model;

import java.util.Date;

public class Event {
    private int id;
    private String name;
    private String location;
    private Date startDate;
    private Date endDate;
    private int availableTickets;
    private String description;

    public Event(int id, String name, String location, Date startDate, Date endDate, int availableTickets, String description) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.availableTickets = availableTickets;
        this.description = description;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public String getDescription() {
        return description;
    }
}
