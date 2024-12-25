package com.TravellingAgency.TravellingAgency.Controller;

import com.TravellingAgency.TravellingAgency.Model.Hotel;
import com.TravellingAgency.TravellingAgency.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public List<Hotel> getHotels() {
        return hotelService.getAllHotels();
    }

    @PostMapping
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }
}
