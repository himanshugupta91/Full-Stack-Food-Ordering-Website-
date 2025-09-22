package com.codeStorm.service;

import java.util.List;

import com.codeStorm.Exception.ReviewException;
import com.codeStorm.model.Review;
import com.codeStorm.model.User;
import com.codeStorm.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
