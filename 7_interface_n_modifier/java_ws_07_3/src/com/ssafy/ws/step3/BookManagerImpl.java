package com.ssafy.ws.step3;

import java.util.Arrays;

/**
 * 도서리스트를 배열로 유지하며 관리하는 클래스
 */
public class BookManagerImpl implements IBookManager {
	
	private static final int MAX_SIZE = 100;
	private Book[] books = new Book[100];
	private int size = 0;
	
	private static IBookManager instance = new BookManagerImpl();
	private BookManagerImpl() {}
	public static IBookManager getInstance() {
		return instance;
	}
	
	@Override
	public void add(Book book) {
		if (size < MAX_SIZE) {
			books[size++] = book;
		} else 
			System.out.println("no more capacity");
	}
	
	@Override
	public void remove(String isbn) {
		for (int i=0; i<this.size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				for (int j=i; j+1<this.size; j++) {
					books[j] = books[j+1];			
				}
				books[this.size-1] = null;
				size--;
			}
		}
	}
	
	@Override
	public Book[] getList() {
		return Arrays.copyOfRange(books, 0, this.size);
	}
	
	@Override
	public Book searchByIsbn(String isbn) {
		for (int i=0; i<this.size; i++) {
			if (books[i].getIsbn().equals(isbn))
				return books[i];
		}
		return null;
	}
	
	@Override
	public Book[] searchByTitle(String title) {
		int cnt = 0;

		for (int i = 0; i < this.size; i++) {
			// 주어진 이름을 포함하는 사용자인지 검사
			if (books[i].getTitle().contains(title)) {
				cnt++;
			}
		}

		if (cnt == 0)
			return null;

		Book[] res = new Book[cnt];

		for (int i = 0, index = 0; i < this.size; i++) {
			// 주어진 이름을 포함하는 사용자인지 검사
			if (books[i].getTitle().contains(title)) {
				res[index++] = books[i];
			}
		}
		return res;
	}
	
	@Override
	public Magazine[] getMagazines() {
		int cnt = 0;
		
		for(int i=0; i<this.size; i++) {
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if(books[i] instanceof Magazine) {
				cnt++;
			}
		}
		
		if (cnt == 0)
			return null;
		
		Magazine[] res = new Magazine[cnt];
		
		for(int i=0, index = 0; i<this.size; i++) {
			if(books[i] instanceof Magazine) {
				res[index++] = (Magazine)books[i];
			}
		}
		return res;
	}
	
	@Override
	public Book[] getBooks() {
		int cnt = 0;
		
		for(int i=0; i<this.size; i++) {
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if(!(books[i] instanceof Magazine)) {
				cnt++;
			}
		}
		
		if (cnt == 0)
			return null;
		
		Book[] res = new Book[cnt];
		
		for(int i=0, index = 0; i<this.size; i++) {
			if(!(books[i] instanceof Magazine)) {
				res[index++] = books[i];
			}
		}
		return res;
	}
	
	@Override
	public int getTotalPrice() {
		int sum = 0;
		for (int i=0; i<this.size; i++) {
			sum += books[i].getPrice();
		} 
		return sum;
	}
	
	@Override
	public double getPriceAvg() {
		double sum = 0;
		for (int i=0; i<this.size; i++) {
			sum += books[i].getPrice();
		} 
		return sum / this.size;
	}
	
}
