package com.TravellingAgency.TravellingAgency.Service;

import com.TravellingAgency.TravellingAgency.Model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    private final List<Hotel> hotels = new ArrayList<>();

    public List<Hotel> getAllHotels() {
        return hotels;
    }

    public Hotel addHotel(Hotel hotel) {
        hotels.add(hotel);
        return hotel;
    }
}
