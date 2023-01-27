package com.ssafy.ws.step4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 맛집리스트를 배열을 리스트로 변경
 */
public class RestaurantManagerImpl implements IRestaurantManager{

	private List<Restaurant> restaurants = new ArrayList<>();
	private Map<Integer, IReviewManager> rvm = new HashMap<>();
	
	private static IRestaurantManager instance = new RestaurantManagerImpl();
	private RestaurantManagerImpl() {}
	public static IRestaurantManager getInstance() {
		return instance;
	}
	
	@Override
	public void addRestaurant(Restaurant restaurant) {
		if (restaurants.size() < 100) {
			restaurants.add(restaurant);
		} else 
			System.out.println("no more capacity");		
	}

	@Override
	public void removeRestaurant(int resId) {
		for (Restaurant r : restaurants) {
			if (r.getResId() == resId) {
				restaurants.remove(r);
			}  
		}		
	}

	@Override
	public List<Restaurant> getRestaurantList() {
		return restaurants;
	}

	@Override
	public Restaurant searchByresId(int resId) {
		for (Restaurant r : restaurants) {
			if (r.getResId() == resId)
				return r;
		}
		return null;
	}

	@Override
	public List<KoreanRestaurant> getkoreanRestaurants() {
		List<KoreanRestaurant> kRestList = new ArrayList<>();
		
		for (Restaurant kr : restaurants) {
			if (kr instanceof KoreanRestaurant) {
				kRestList.add((KoreanRestaurant) kr);
			}
		}
		
		return kRestList;
	}

	@Override
	public List<Restaurant> getNonKoreanRestaurants() {
		List<Restaurant> nonkRestList = new ArrayList<>();
		
		for (Restaurant nkr : restaurants) {
			if (!(nkr instanceof KoreanRestaurant)) {
				nonkRestList.add(nkr);
			}
		}
		
		return nonkRestList;
	}
	
	@Override
	public IReviewManager getReviewManager(int resId) {
		rvm.put(resId, new ReviewManagerImpl());
		
		return rvm.get(resId);
	}
	
}
