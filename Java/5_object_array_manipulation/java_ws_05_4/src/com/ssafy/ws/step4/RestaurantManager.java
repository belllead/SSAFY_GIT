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
	
	public boolean addRestaurant(Restaurant restaurant) {
		if (restaurantSize < MAX_RESTAURANT_SIZE) {
			restaurants[restaurantSize++] = restaurant;
			return true;
		} else return false;
	}
	
	public boolean addReview(Review review) {
		if (reviewSize < MAX_REVIEW_SIZE) {
			reviews[reviewSize++] = review;
			return true;
		} else return false;
	}
	
	public boolean updateRestaurant(Restaurant restaurant) {
		for (Restaurant r : restaurants) {
			if (r.getName().equals(restaurant.name)) {
				r = restaurant;
				return true;
			}
		} 
		return false;
	}
	
	public boolean removeRestaurant(int resId) {
		for (int i=0; i<this.restaurantSize; i++) {
			if (restaurants[i].getResId() == resId) {
				for (int j=i; j+1 < this.restaurantSize; j++) {
					restaurants[j] = restaurants[j+1];
				} 
				restaurants[restaurantSize-1] = null;
				restaurantSize--;
				return true;
			}  
		} return false;
	}
	
	public boolean removeReview(int resId) {
		int cnt = 0;
		for (int i=0; i<this.reviewSize; i++) {
			if (reviews[i].getResId() == resId) {
				cnt++;	
			}
		}
		
		for (int k=0; k<cnt; k++) {
			for (int i=0; i<this.reviewSize; i++) {
				if (reviews[i].getResId() == resId) {
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
	
	public Restaurant searchByresId(int resId) {
		for (int i=0; i<this.restaurantSize; i++) {
			if (restaurants[i].getResId() == resId)
				return restaurants[i];
		}
		return null;
	}
	
	public Restaurant[] getRestaurantList() {
		return Arrays.copyOfRange(restaurants, 0, this.restaurantSize);
	}
	
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
	
	public Restaurant getRestaurant(int resId) {
		for (int i=0; i<this.restaurantSize; i++) {
			if (restaurants[i].getResId() == resId)
				return restaurants[i];
		}
		return null;
	}
	
}
