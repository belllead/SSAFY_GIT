package com.ssafy.hw.step4;

import java.util.Arrays;

/**
 * 상품리스트를 배열로 유지하며 관리하는 클래스
 */
public class ProductManager {

	private static final int MAX_PRODUCT_SIZE = 100;
	private static final int MAX_REVIEW_SIZE = 1000;
	private Product[] products = new Product[MAX_PRODUCT_SIZE];
	private Review[] reviews = new Review[MAX_REVIEW_SIZE];
	private int pCount = 0;
	private int rCount = 0;
	
	public boolean addProduct(Product product) {
		if (pCount < MAX_PRODUCT_SIZE) {
			products[pCount++] = product;
			return true;
		} else return false;
	}
	
	public boolean addReview(Review review) {
		if (rCount < MAX_REVIEW_SIZE) {
			reviews[rCount++] = review;
			return true;
		} else return false;
	}
	
	public boolean updateProduct(Product product) {
		for (Product p : products) {
			if (p.getpName().equals(product.getpName())) {
				p = product;
				return true;
			}
		} 
		return false;
	}
	
	public boolean removeProduct(String pCode) {
		for (int i=0; i<this.pCount; i++) {
			if (products[i].getpCode() == pCode) {
				for (int j=i; j+1 < this.pCount; j++) {
					products[j] = products[j+1];
				} 
				products[pCount-1] = null;
				pCount--;
				return true;
			}  
		} return false;
	}
	
	public int sell(String pCode, int cnt) {
		for (int i=0; i<this.pCount; i++) {
			if (products[i].getpCode() == pCode) {
				products[i].setQuantity(products[i].getQuantity() - cnt);
				System.out.printf("%s가 %d개 팔렸습니다.", products[i].getpName(), cnt);
				return products[i].getQuantity();
			}
		} 
		System.out.print("해당 상품은 재고가 없습니다.");
		return -1;
	}
	
	public boolean removeReview(int reviewId) {
		int cnt = 0;
		for (int i=0; i<this.rCount; i++) {
			if (reviews[i].getReviewId() == reviewId) {
				cnt++;	
			}
		}
		
		for (int k=0; k<cnt; k++) {
			for (int i=0; i<this.rCount; i++) {
				if (reviews[i].getReviewId() == reviewId) {
					for (int j=i; j+1 < this.rCount; j++) {
						reviews[j] = reviews[j+1];
					} 
					reviews[rCount-1] = null;
					rCount--;
				} 
			} 
		} 
		
		if (cnt != 0) return true;
		else return false;
	}
	
	public Product searchByCode(String pCode) {
		for (int i=0; i<this.pCount; i++) {
			if (products[i].getpCode() == pCode)
				return products[i];
		}
		return null;
	}
		
	public Review[] getProductReview(String pCode) {
		int cnt = 0;
		
		for (int i=0; i<this.rCount; i++) {
			if (reviews[i].getpCode() == pCode) cnt++;
		}
		
		Review[] rst = new Review[cnt];
		
		for (int i=0, idx=0; i<this.rCount; i++) {
			if (reviews[i].getpCode() == pCode) {
				rst[idx++] = reviews[i];
			}
		}
		
		return rst;		
	}
	
	public Product[] getProductList() {
		return Arrays.copyOfRange(products, 0, this.pCount);
	}
		
		



}
