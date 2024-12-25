package com.TravellingAgency.TravellingAgency.Service;

import com.TravellingAgency.TravellingAgency.Model.Notification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotificationService {
    private final List<Notification> notifications = new ArrayList<>();

    public List<Notification> getAllNotifications() {
        return notifications;
    }

    public Notification addNotification(Notification notification) {
        notifications.add(notification);
        return notification;
    }
}