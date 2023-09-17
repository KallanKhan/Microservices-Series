package com.mypractice.hotel.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypractice.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
