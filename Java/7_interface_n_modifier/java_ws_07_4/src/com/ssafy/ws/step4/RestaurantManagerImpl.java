package com.ssafy.ws.step4;

import java.util.Arrays;

/**
 * 맛집리스트를 배열로 유지하며 관리하는 클래스
 */
public class RestaurantManagerImpl implements IRestaurantManager{

	private static final int MAX_RESTAURANT_SIZE = 100;
	private Restaurant[] restaurants = new Restaurant[MAX_RESTAURANT_SIZE];
	private int restaurantSize = 0;
	
	private RestaurantManagerImpl() {}
	private static IRestaurantManager instance = new RestaurantManagerImpl();
	public static IRestaurantManager getInstance() {
		return instance;
	}
	
	@Override
	public void addRestaurant(Restaurant restaurant) {
		if (restaurantSize < MAX_RESTAURANT_SIZE) {
			restaurants[restaurantSize++] = restaurant;	
		} else 
			System.out.println("no more capacity");		
	}

	@Override
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

	@Override
	public Restaurant[] getRestaurantList() {
		return Arrays.copyOfRange(restaurants, 0, this.restaurantSize);
	}

	@Override
	public Restaurant searchByresId(int resId) {
		for (int i=0; i<this.restaurantSize; i++) {
			if (restaurants[i].getResId() == resId)
				return restaurants[i];
		}
		return null;
	}

	@Override
	public KoreanRestaurant[] getkoreanRestaurants() {
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

	@Override
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

}
