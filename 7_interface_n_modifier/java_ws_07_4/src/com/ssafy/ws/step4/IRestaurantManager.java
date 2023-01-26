package com.ssafy.ws.step4;

/**
 * 맛집리스트를 관리하기 위한 클래스를 위한 명세역할의 인터페이스
 */
public interface IRestaurantManager {

	abstract void addRestaurant(Restaurant restaurant);
	
	abstract void removeRestaurant(int resId);
	
	abstract Restaurant[] getRestaurantList();
	
	abstract Restaurant searchByresId(int resId);
	
	abstract KoreanRestaurant[] getkoreanRestaurants();
	
	abstract Restaurant[] getNonKoreanRestaurants();

}
