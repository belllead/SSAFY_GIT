package com.ssafy.hw.step4;

/**
 * 상품 객체를 생성하고 출력하는 클래스 
 *
 */
public class ProductTest {
	
	public static void main(String[] args) {

		Product pr1 = new Refrigerator("R00001", "S냉장고", 1000000, 20, "삼성", "삼성에서 출시한 스마트냉장고입니다.", "냉장고", 1000, true, 2021);
		Product pr2 = new Refrigerator("R00002", "L냉장고", 100000, 10, "엘지", "엘지 저가형 냉장고.", "냉장고", 300, false, 2022);
		Product pr3 = new Refrigerator("R00003", "T냉장고", 3000000, 200, "탐탐", "탐탐에서 출시한 AI 냉장고입니다.", "냉장고", 1200, true, 2022);
		Product pr4 = new Refrigerator("R00004", "K냉장고", 500000, 50, "코라", "코라에서 출시한 보급형 냉장고입니다.", "냉장고", 700, false, 2021);
		Product pr5 = new Refrigerator("R00005", "A냉장고", 1000000, 10, "에이스", "에이스에서 출시한 스마트냉장고입니다.", "냉장고", 800, true, 2022);

		Product pr6 = new Product("P00001", "우주폰S", 500000, 100, "삼성", "삼성에서 출시한 우주폰S입니다.");

//		Review rev1 = new Review(1, "P00001", "yang", "성능이 아주 좋습니당~!");
		
		IProductManager pm = ProductManagerImpl.getInstance();
		pm.addProduct(pr1);
		pm.addProduct(pr2);
		pm.addProduct(pr3);
		pm.addProduct(pr4);
		pm.addProduct(pr5);
		pm.addProduct(pr6);		
//		pm.addReview(rev1);
		
//		pm.sell("P00001", 19);
//		System.out.println();
//		pm.sell("P00002", 19);
//		System.out.println();

//		for (Product p : pm.getProductList())
//			System.out.println(p);
		
		System.out.println("********************냉장고 목록********************");
		for (Product p : pm.getRefrigerators())
			System.out.println(p);
		System.out.println("********************냉동고 있는 목록********************");
		for (Product p : pm.getRefrigeratorFreezer(true))
			System.out.println(p);
		System.out.println("********************이름 검색: S********************");
		for (Product p : pm.searchByName("S"))
			System.out.println(p);
		System.out.println("********************재고 총 가격********************");
		System.out.println(pm.getTotalPrice());
				
	}
	
}
