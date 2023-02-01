package com.ssafy.hw.step4;

/**
 * 상품리스트를 관리하기 위한 클래스를 위한 명세역할의 인터페이스
 *
 */
public interface IProductManager {

	abstract boolean addProduct(Product product);
	
	abstract boolean updateProduct(Product product);
		
	boolean removeProduct(String pCode);
	
	int sell(String pCode, int cnt);
	
	Product[] getProductList();
	
	Product searchByCode(String pCode);
	
	boolean addReview(Review review);
	
	boolean removeReview(int reviewId);
	
	Review[] getProductReview(String pCode);	
	
	Product[] searchByName(String name);
			
	long getTotalPrice();
	
	Product[] getProducts();
	
	Refrigerator[] getRefrigerators();
		
	Refrigerator[] getRefrigeratorFreezer(boolean freezer);
	
}
