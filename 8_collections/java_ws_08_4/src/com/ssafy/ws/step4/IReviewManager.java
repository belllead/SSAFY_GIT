package com.ssafy.ws.step4;

import java.util.List;

/**
 * 리뷰리스트를 관리하기 위한 클래스를 위한 명세역할의 인터페이스
 */
public interface IReviewManager {

	abstract void addReview(Review review);
	
	abstract void removeReview(int reviewId);
	
	abstract List<Review> getReviewList();
	
	abstract Review searchByreviewId(int reviewId);
	
	abstract List<Review> getRestaurantReview(int resId);

}
