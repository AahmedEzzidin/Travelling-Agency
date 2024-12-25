package com.TravellingAgency.TravellingAgency.Service;

import com.TravellingAgency.TravellingAgency.Model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private final List<Event> events = new ArrayList<>();

    public List<Event> getAllEvents() {
        return events;
    }

    public Event addEvent(Event event) {
        events.add(event);
        return event;
    }
}
