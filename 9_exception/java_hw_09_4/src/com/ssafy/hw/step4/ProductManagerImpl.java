package com.ssafy.hw.step4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 상품리스트를 배열로 유지하며 관리하는 클래스
 */
public class ProductManagerImpl implements IProductManager {

	private List<Product> products = new ArrayList<>();
	private Map<String, List<Review>> reviews = new HashMap<String, List<Review>>();
	private static int reviewNo = 1000;
	
	private static IProductManager instance = new ProductManagerImpl();
	private ProductManagerImpl() {};
	public static IProductManager getInstance() {
		return instance;
	}
	
	@Override
	public boolean addProduct(Product product) {
		if (products.size() < 100) {
			products.add(product);
			return true;
		} else return false;
	}
	
	@Override
	public boolean updateProduct(Product product) {
		for (Product p : products) {
			if (p.getpName().equals(product.getpName())) {
				p = product;
				return true;
			}
		} 
		return false;
	}
	
	@Override
	public boolean removeProduct(String pCode) {
		for (Product p : products) {
			if (p.getpCode() == pCode) {
				products.remove(p);
				return true;
			}  
		} return false;
	}
	
	@Override
	public int sell(String pCode, int cnt) throws QuantityException {
		for (Product p : products) {
			if (p.getpCode() == pCode) {
				if (p.getQuantity() - cnt < 0)
					throw new QuantityException();
				else {
					p.setQuantity(p.getQuantity() - cnt);
					System.out.printf("%s가 %d개 팔렸습니다.", p.getpName(), cnt);
					return p.getQuantity();
				}
			}
		} 
		System.out.print("해당 상품은 재고가 없습니다.");
		return -1;
	}
	
	public Product[] getProductList() {
		Product[] rst = new Product[products.size()];
		return products.toArray(rst);
	}
	
	@Override
	public Product searchByCode(String pCode) throws ProductCodeNotFoundException {
		int cnt = 0;
		for (Product p : products) {
			if (p.getpCode() == pCode) {
				cnt++;
				return p;
			}
		}
		if (cnt == 0) throw new ProductCodeNotFoundException(pCode);
		return null;
	}
	
	public boolean addReview(Review review) {
		if (!(reviews.containsKey(review.getpCode()))) {
			List<Review> nr = new ArrayList<>();
			nr.add(review);
			reviews.put(review.getpCode(), nr);
			return true;
		} else {
			if (reviews.get(review.getpCode()).size() < reviewNo) {
				reviews.get(review.getpCode()).add(review);
				return true;
			} else return false;			
		}		
	}
	
	@Override
	public boolean removeReview(Review review) {
		if (reviews.containsKey(review.getpCode())) {
			reviews.get(review.getpCode()).remove(review);
			return true;
		} else return false;
	}
	
	@Override
	public List<Review> getProductReview(String pCode) throws ReviewNotFoundException {
		if (reviews.containsKey(pCode)) {
			return reviews.get(pCode);
		} else { 
			throw new ReviewNotFoundException(pCode);
		}
	}
	
	@Override
	public Product[] searchByName(String name) throws NameNotFoundException {
		List<Product> tempList = new ArrayList<>();
				
		for (Product p : products) {
			if (p.getpName().contains(name))
				tempList.add(p);
		}
		
		if (tempList.size() == 0) throw new NameNotFoundException(name);
		
		Product[] rst = new Product[tempList.size()];
		
		return tempList.toArray(rst);
	}
	
	@Override
	public long getTotalPrice() {
		long sum = 0;
		
		for (Product p : products) {
			sum += p.getPrice() * p.getQuantity();
		}
		
		return sum;
	}
	
	@Override
	public Product[] getProducts() {
		List<Product> tempList = new ArrayList<>();
		
		for (Product p : products) {
			if (!(p instanceof Refrigerator))
				tempList.add(p);
		}
		
		Product[] rst = new Product[tempList.size()];
		
		return tempList.toArray(rst);		
	}
	
	@Override
	public Refrigerator[] getRefrigerators() {
		List<Refrigerator> tempList = new ArrayList<>();
		
		for (Product p : products) {
			if (p instanceof Refrigerator)
				tempList.add((Refrigerator) p);
		}
		
		Refrigerator[] rst = new Refrigerator[tempList.size()];
		
		return tempList.toArray(rst);	
	}
		
	@Override
	public Refrigerator[] getRefrigeratorFreezer(boolean freezer) {
		List<Refrigerator> tempList = new ArrayList<>();
		
		for (Product p : products) {
			if (p instanceof Refrigerator) {
				if (((Refrigerator) p).isFreezer() == freezer) {
					tempList.add((Refrigerator) p);
				}
			}	
		}
	
		Refrigerator[] rst = new Refrigerator[tempList.size()];
		
		return tempList.toArray(rst);		
	}

}
