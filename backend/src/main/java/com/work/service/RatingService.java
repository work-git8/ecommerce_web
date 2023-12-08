package com.work.service;

import java.util.List;

import com.work.exception.ProductException;
import com.work.model.Rating;
import com.work.model.User;
import com.work.request.RatingRequest;

public interface RatingService {

	public Rating createRating(RatingRequest req, User user)throws ProductException;
	
	public List<Rating> getProductRating(Long productId);
}
