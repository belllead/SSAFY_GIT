package com.ssafy.ws.step4;

import java.util.Arrays;

/**
 * 맛집, 리뷰 객체의 리스트를 배열로 유지하며 관리하는 클래스
 */
public class RestaurantManager {

	private static final int MAX_RESTAURANT_SIZE = 100;
	private static final int MAX_REVIEW_SIZE = 1000;
	private Restaurant[] restaurants = new Restaurant[MAX_RESTAURANT_SIZE];
	private Review[] reviews = new Review[MAX_REVIEW_SIZE];
	private int restaurantSize = 0;
	private int reviewSize = 0;
	
	public KoreanRestaurant[] getKoreanRestaurantList() {
		int cnt = 0;
		
		for (int i=0; i<restaurantSize; i++) {
			if (restaurants[i] instanceof KoreanRestaurant) {
				cnt++;
			}
		}
		
		KoreanRestaurant[] rst = new KoreanRestaurant[cnt];
		
		for (int i=0, idx=0; i<restaurantSize; i++) {
			if (restaurants[i] instanceof KoreanRestaurant) {
				rst[idx++] = (KoreanRestaurant) restaurants[i]; 
			}
		}
		return rst;
	}

	public Restaurant[] getNonKoreanRestaurants() {
		int cnt = 0;
		
		for (int i=0; i<restaurantSize; i++) {
			if (!(restaurants[i] instanceof KoreanRestaurant)) {
				cnt++;
			}
		}
		
		Restaurant[] rst = new Restaurant[cnt];
		
		for (int i=0, idx=0; i<restaurantSize; i++) {
			if (!(restaurants[i] instanceof KoreanRestaurant)) {
				rst[idx++] = restaurants[i]; 
			}
		}
		return rst;
	}
	
	public void addRestaurant(Restaurant restaurant) {
		if (restaurantSize < MAX_RESTAURANT_SIZE) {
			restaurants[restaurantSize++] = restaurant;	
		} else 
			System.out.println("no more capacity");
	}
	
	public void addReview(Review review) {
		if (reviewSize < MAX_REVIEW_SIZE) {
			reviews[reviewSize++] = review;
		} else
			System.out.println("no more capacity");
	}
	
	public void removeRestaurant(int resId) {
		for (int i=0; i<this.restaurantSize; i++) {
			if (restaurants[i].getResId() == resId) {
				for (int j=i; j+1 < this.restaurantSize; j++) {
					restaurants[j] = restaurants[j+1];
				} 
				restaurants[restaurantSize-1] = null;
				restaurantSize--;
			}  
		}
	}
	
	public boolean removeComment(int reviewId) {
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
		
		if (cnt != 0) return true;
		else return false;
	}
		
	public Restaurant[] getRestaurantList() {
		return Arrays.copyOfRange(restaurants, 0, this.restaurantSize);
	}
	
	public Review[] getReviewList() {
		return Arrays.copyOfRange(reviews, 0, this.reviewSize);		
	}
	
	public Restaurant getRestaurant(int resId) {
		for (int i=0; i<this.restaurantSize; i++) {
			if (restaurants[i].getResId() == resId)
				return restaurants[i];
		}
		return null;
	}
	
	public Review getReview(int reviewId) {
		for (int i=0; i<this.reviewSize; i++) {
			if (reviews[i].getReviewId() == reviewId)
				return reviews[i];
		}
		return null;
	}
	
}
