package com.ssafy.ws.step3;

import java.util.Arrays;

public class BookManager {

	private static final int MAX_SIZE = 100;
	private Book[] books = new Book[100];
	private int size = 0;
	
	public void add(Book book) {
		if (size < MAX_SIZE) {
			books[size++] = book;
		} else 
			System.out.println("no more capacity");
	}
	
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
	
	public Book[] getList() {
		return Arrays.copyOfRange(books, 0, this.size);
	}
	
	public Book searchByIsbn(String isbn) {
		for (int i=0; i<this.size; i++) {
			if (books[i].getIsbn().equals(isbn))
				return books[i];
		}
		return null;
	}
	
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
	
	public int getTotalPrice() {
		int sum = 0;
		for (int i=0; i<this.size; i++) {
			sum += books[i].getPrice();
		} 
		return sum;
	}
	
	public double getPriceAvg() {
		double sum = 0;
		for (int i=0; i<this.size; i++) {
			sum += books[i].getPrice();
		} 
		return sum / this.size;
	}
	
}
