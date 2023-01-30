package com.ssafy.ws.step4;

import java.util.List;

/**
 * 맛집리스트를 관리하기 위한 클래스를 위한 명세역할의 인터페이스
 */
public interface IRestaurantManager {

	abstract void addRestaurant(Restaurant restaurant);
	
	abstract void removeRestaurant(int resId);
	
	abstract List<Restaurant> getRestaurantList();
	
	abstract Restaurant searchByresId(int resId) throws RestaurantNotFoundException;
	
	abstract List<KoreanRestaurant> getkoreanRestaurants();
	
	abstract List<Restaurant> getNonKoreanRestaurants();
	
	abstract IReviewManager getReviewManager(int resId);

}
