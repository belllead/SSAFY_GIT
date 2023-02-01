package com.ssafy.hw.step4;

/**
 * 상품 객체를 생성하고 출력하는 클래스 
 *
 */
public class ProductTest {
	
	public static void main(String[] args) {

		Product pr1 = new Product("R00001", "S냉장고", 10000000, 20, "삼성", "삼성에서 출시한 스마트냉장고입니다.");
		Product pr2 = new Product("P00001", "우주폰S", 500000, 100, "삼성", "삼성에서 출시한 우주폰S입니다.");
		
		Review rev1 = new Review(1, "P00001", "yang", "성능이 아주 좋습니당~!");
		
		ProductManager pm = new ProductManager();
		pm.addProduct(pr1);
		pm.addProduct(pr2);
		pm.addReview(rev1);
		
		pm.sell("P00001", 19);
		System.out.println();
		pm.sell("P00002", 19);
		System.out.println();
		
		for (Product p : pm.getProductList())
			System.out.println(p);
		
		for (Review r : pm.getProductReview("P00001"))
			System.out.println(r);
		
	}
	
}
