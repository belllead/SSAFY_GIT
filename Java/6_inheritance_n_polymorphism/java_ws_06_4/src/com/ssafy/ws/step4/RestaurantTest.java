package com.ssafy.ws.step4;

/**
 * 맛집 객체를 생성하고 정보를 출력하는 클래스
 */
public class RestaurantTest {
	
	public static void main(String[] args) {
		
		Restaurant rest1 = new Restaurant(401, "도마29", "대구", "연어초밥", 3);
		Restaurant rest2 = new Restaurant(101, "을밀대", "서울", "냉면", 4);
		Restaurant krest1 = new KoreanRestaurant(102, "도곡지", "서울", "도미솥밥", 8, "02-711-0431", "15:00 ~ 17:00");
		
		Review rev1 = new Review(1, 101, "김싸피", "너무 맛있네요.");
		Review rev2 = new Review(2, 401, "나싸피", "연어초밥은 여기가 최고!");
		Review rev3 = new Review(3, 401, "박싸피", "연어초밥 맛없어요");
		
		RestaurantManager rm = new RestaurantManager();
		rm.addRestaurant(rest1);
		rm.addRestaurant(rest2);
		rm.addRestaurant(krest1);
		rm.addReview(rev1);
		rm.addReview(rev2);
		rm.addReview(rev3);
		
//		rm.removeRestaurant(101);
//		System.out.println(rm.getRestaurant(401));
//		rm.removeReview(401);
//		System.out.println(rm.removeReview(301));
		
		for (Restaurant r : rm.getRestaurantList())
			System.out.println(r);
		System.out.println();
		for (Restaurant r : rm.getKoreanRestaurantList())
			System.out.println(r);
		System.out.println();
		for (Restaurant r : rm.getNonKoreanRestaurants())
			System.out.println(r);
		System.out.println();
				
	}
	
}
