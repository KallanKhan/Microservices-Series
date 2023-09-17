package com.mypractice.rating.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypractice.rating.entities.Rating;
import com.mypractice.rating.repository.RatingRepository;
import com.mypractice.rating.service.RatingService;

import lombok.var;

@Service
public class RatingServiceImpl implements RatingService {


	    @Autowired
	    private RatingRepository repository;

	    @Override
	    public Rating create(Rating rating) {
	    	  String hotelId = UUID.randomUUID().toString();
	    	  rating.setRatingId(hotelId);
	        return repository.save(rating);
	    }

	    @Override
	    public List<Rating> getRatings() {
	        return repository.findAll();
	    }

	    @Override
	    public List<Rating> getRatingByUserId(var userId) {
	        return repository.findByUserId(userId);
	    }

	    @Override
	    public List<Rating> getRatingByHotelId(var hotelId) {
	        return repository.findByHotelId(hotelId);
	    }

}
