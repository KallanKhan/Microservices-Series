package com.mypractice.hotel.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypractice.hotel.entities.Hotel;
import com.mypractice.hotel.respositories.HotelRepository;
import com.mypractice.hotel.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	  @Autowired
	    private HotelRepository hotelRepository;

	    @Override
	    public Hotel create(Hotel hotel) {
	        String hotelId = UUID.randomUUID().toString();
	        hotel.setId(hotelId);
	        return hotelRepository.save(hotel);
	    }

	    @Override
	    public List<Hotel> getAll() {
	        return hotelRepository.findAll();
	    }

	    @Override
	    public Optional<Hotel> get(String id) {
	        return hotelRepository.findById(id);
	    }
}
