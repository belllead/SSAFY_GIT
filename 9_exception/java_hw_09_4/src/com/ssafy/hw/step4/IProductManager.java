package com.ssafy.hw.step4;

import java.util.List;

/**
 * 상품리스트를 관리하기 위한 클래스를 위한 명세역할의 인터페이스
 *
 */
public interface IProductManager {

	abstract boolean addProduct(Product product);
	
	abstract boolean updateProduct(Product product);
		
	boolean removeProduct(String pCode);
	
	int sell(String pCode, int cnt) throws QuantityException;
	
	Product[] getProductList();
	
	Product searchByCode(String pCode) throws ProductCodeNotFoundException;
	
	boolean addReview(Review review);
	
	boolean removeReview(Review review);
	
	List<Review> getProductReview(String pCode) throws ReviewNotFoundException;	
	
	Product[] searchByName(String name) throws NameNotFoundException;
			
	long getTotalPrice();
	
	Product[] getProducts();
	
	Refrigerator[] getRefrigerators();
		
	Refrigerator[] getRefrigeratorFreezer(boolean freezer);
	
}
