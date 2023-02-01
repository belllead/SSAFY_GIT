package com.ssafy.ws.step3;
/**
 * 도서 정보를 나타내는 클래스
 */
public class Book {

	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	
	public Book() {}
	
	public Book(String isbn, String title, String author, String publisher,	int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;		
	}
	
	public String toString() {
		String price_str = Integer.toString(price);
		return isbn + " | " + title + " | " + author + " | " + publisher + " | " + price_str + " | " + desc; 
	}

}

