package com.work.service;

import java.util.List;

import com.work.exception.ProductException;
import com.work.model.Review;
import com.work.model.User;
import com.work.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req, User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
}
