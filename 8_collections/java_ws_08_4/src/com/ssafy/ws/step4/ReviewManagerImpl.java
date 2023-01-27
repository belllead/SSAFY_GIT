package com.ssafy.ws.step4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 리뷰리스트를 배열을 리스트로 변경
 */
public class ReviewManagerImpl implements IReviewManager{

	private List<Review> reviews = new ArrayList<>();
		
	@Override
	public void addReview(Review review) {
		if (reviews.size() < 1000) {
			reviews.add(review);
		} else
			System.out.println("no more capacity");		
	}

	@Override
	public void removeReview(int reviewId) {
		for (Review r : reviews) {
			if (r.getReviewId() == reviewId) {
				reviews.remove(r);	
			}
		} 
	}

	@Override
	public List<Review> getReviewList() {
		return reviews;		
	}

	@Override
	public Review searchByreviewId(int reviewId) {
		for (Review r : reviews) {
			if (r.getReviewId() == reviewId)
				return r;
		}
		return null;
	}

	@Override
	public List<Review> getRestaurantReview(int resId) {
		List<Review> tempList = new ArrayList<>();
		
		for (Review r : reviews) {
			if (r.getResId() == resId)
				tempList.add(r);
		}		
		return tempList;		
	}

}
