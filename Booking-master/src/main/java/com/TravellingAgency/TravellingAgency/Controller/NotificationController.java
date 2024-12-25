package com.TravellingAgency.TravellingAgency.Controller;

import com.TravellingAgency.TravellingAgency.Model.Notification;
import com.TravellingAgency.TravellingAgency.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public List<Notification> getNotifications() {
        return notificationService.getAllNotifications();
    }

    @PostMapping
    public Notification sendNotification(@RequestBody Notification notification) {
        return notificationService.addNotification(notification);
    }
}