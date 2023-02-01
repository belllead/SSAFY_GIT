package com.ssafy.ws.step4;

public interface IReviewManager {

	abstract void addReview(Review review);
	
	abstract void removeReview(int reviewId);
	
	abstract Review[] getReviewList();
	
	abstract Review searchByreviewId(int reviewId);
	
	abstract Review[] getRestaurantReview(int resId);
	
}
