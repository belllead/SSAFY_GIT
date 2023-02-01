package com.ssafy.ws.step4;

/**
 * 맛집 객체를 생성하고 정보를 출력하는 클래스
 */
public class RestaurantTest {
	
	public static void main(String[] args) {

		Restaurant rest1 = new Restaurant();
		rest1.resId = 401;
		rest1.name = "도마29";
		rest1.address = "대구";
		rest1.signatureMenu = "연어초밥";
		rest1.rate = 3;
		
		Restaurant rest2 = new Restaurant(101, "을밀대", "서울", "냉면", 4);
		
		Review rev1 = new Review();
		rev1.reviewId = 1;
		rev1.resId = 101;
		rev1.writer = "김싸피";
		rev1.content = "너무 맛있네요.";
		
		Review rev2 = new Review(2, 401, "나싸피", "연어초밥은 여기가 최고!");
		
		System.out.println("*************************맛집목록*************************");
		System.out.println(rest1);
		System.out.println(rest2);
		System.out.println("*************************리뷰목록*************************");
		System.out.println(rev1);
		System.out.println(rev2);
		
	}
	
}
