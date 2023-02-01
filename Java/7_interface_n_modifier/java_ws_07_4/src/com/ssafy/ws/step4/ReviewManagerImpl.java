package com.ssafy.ws.step4;

import java.util.Arrays;

public class ReviewManagerImpl implements IReviewManager {

	private static final int MAX_REVIEW_SIZE = 1000;
	private Review[] reviews = new Review[MAX_REVIEW_SIZE];
	private int reviewSize = 0;
	
	private ReviewManagerImpl() {}
	private static IReviewManager instance = new ReviewManagerImpl();
	public static IReviewManager getInstance() {
		return instance;
	}
	
	@Override
	public void addReview(Review review) {
		if (reviewSize < MAX_REVIEW_SIZE) {
			reviews[reviewSize++] = review;
		} else
			System.out.println("no more capacity");		
	}

	@Override
	public void removeReview(int reviewId) {
		int cnt = 0;
		for (int i=0; i<this.reviewSize; i++) {
			if (reviews[i].getResId() == reviewId) {
				cnt++;	
			}
		}
		
		for (int k=0; k<cnt; k++) {
			for (int i=0; i<this.reviewSize; i++) {
				if (reviews[i].getResId() == reviewId) {
					for (int j=i; j+1 < this.reviewSize; j++) {
						reviews[j] = reviews[j+1];
					} 
					reviews[reviewSize-1] = null;
					reviewSize--;
				} 
			} 
		} 
	}

	@Override
	public Review[] getReviewList() {
		return Arrays.copyOfRange(reviews, 0, this.reviewSize);		
	}

	@Override
	public Review searchByreviewId(int reviewId) {
		for (int i=0; i<this.reviewSize; i++) {
			if (reviews[i].getResId() == reviewId)
				return reviews[i];
		}
		return null;
	}

	@Override
	public Review[] getRestaurantReview(int resId) {
		int cnt = 0;
		
		for (int i=0; i<this.reviewSize; i++) {
			if (reviews[i].getResId() == resId) cnt++;
		}
		
		Review[] rst = new Review[cnt];
		
		for (int i=0, idx=0; i<this.reviewSize; i++) {
			if (reviews[i].getResId() == resId) {
				rst[idx++] = reviews[i];
			}
		}
		
		return rst;		
	}

	
	
}
