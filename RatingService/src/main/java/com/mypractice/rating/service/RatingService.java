package com.mypractice.rating.service;

import java.util.List;

import com.mypractice.rating.entities.Rating;

import lombok.var;

public interface RatingService {

    //create
    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(var userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(var hotelId);

}	