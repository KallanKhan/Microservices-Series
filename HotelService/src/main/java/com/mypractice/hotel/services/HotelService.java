package com.mypractice.hotel.services;

import java.util.List;
import java.util.Optional;

import com.mypractice.hotel.entities.Hotel;

import lombok.var;

public interface HotelService {

	  //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    public Optional<Hotel> get(String id);
	
}
