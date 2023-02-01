package com.ssafy.ws.step3;

import java.util.Arrays;

/**
 * 도서리스트를 배열로 유지하며 관리하는 클래스
 */
public class BookManager {

	private final int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
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
				for (int j=i; j+1<this.size; j++)
				books[j] = books[j+1];				
			}
		} 
		books[this.size-1] = null;
		size--;
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
	
}
