package com.TravellingAgency.TravellingAgency.Service;

import com.TravellingAgency.TravellingAgency.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public User addUser(User user) {
        users.add(user);
        return user;
    }
}