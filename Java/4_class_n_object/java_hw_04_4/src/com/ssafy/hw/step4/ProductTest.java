package com.ssafy.hw.step4;

/**
 * 상품 객체를 생성하고 출력하는 클래스 
 *
 */
public class ProductTest {
	
	public static void main(String[] args) {
		
		Product pr1 = new Product();
		pr1.pCode = "R00001";
		pr1.pName = "S냉장고";
		pr1.price = 10000000;
		pr1.quantity = 20;
		pr1.brand = "삼성";
		pr1.desc = "삼성에서 출시한 스마트냉장고입니다.";
		
		Product pr2 = new Product("P----1", "우주폰S", 500000, 100, "삼성", "삼성에서 출시한 우주폰S입니다.");
		
		Review rev1 = new Review(1, "P00001", "yang", "성능이 아주 좋습니당~!");
		
		System.out.println("*************************제품목록*************************");
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println("*************************리뷰내용*************************");
		System.out.println(rev1);
		
	}
	
}
