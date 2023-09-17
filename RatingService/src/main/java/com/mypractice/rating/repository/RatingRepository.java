package com.mypractice.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypractice.rating.entities.Rating;

import lombok.var;

public interface RatingRepository extends JpaRepository<Rating, String> {

	  //custom finder methods
    List<Rating> findByUserId(var userId);
    List<Rating> findByHotelId(var hotelId);
}
