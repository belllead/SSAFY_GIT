package com.ssafy.ws.step3;

import java.util.ArrayList;
import java.util.List;

/**
 * 도서리스트를 컬렉션으로 유지하며 관리하는 클래스
 */
public class BookManagerImpl implements IBookManager {

	private List<Book> books = new ArrayList<>();
		
	private static IBookManager instance = new BookManagerImpl();
	private BookManagerImpl() {}
	public static IBookManager getInstance() {
		return instance;
	}
	
	@Override
	public void add(Book book) {
		if (books.size() < 100) {
			books.add(book);
		} else 
			System.out.println("no more capacity");
	}
	
	@Override
	public void remove(String isbn) {
		for (int i=0; i<books.size(); i++) {
			if (books.get(i).getIsbn().equals(isbn)) {
				books.remove(i);
			}
		}
	}
	
	@Override
	public Book[] getList() {
		List<Book> tempList = new ArrayList<>();
		
		for (Book b : books)
			tempList.add(b);
		
		Book[] rst = new Book[tempList.size()];
		
		return tempList.toArray(rst);		 
	}
	
	@Override
	public Book searchByIsbn(String isbn) {
		for (int i=0; i<books.size(); i++) {
			if (books.get(i).getIsbn().equals(isbn))
				return books.get(i);
		}
		return null;
	}
	
	@Override
	public Book[] searchByTitle(String title) {
		List<Book> tempList = new ArrayList<>();
		
		for (int i = 0; i < books.size(); i++) {
			// 주어진 이름을 포함하는 사용자인지 검사
			if (books.get(i).getTitle().contains(title)) {
				tempList.add(books.get(i));
			}
		}

		if (tempList.size() == 0)
			return null;

		Book[] res = new Book[tempList.size()];
		
		return tempList.toArray(res);
	}
	
	@Override
	public Magazine[] getMagazines() {
		List<Magazine> tempList = new ArrayList<>();
		
		for(int i=0; i<books.size(); i++) {
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if(books.get(i) instanceof Magazine) {
				tempList.add((Magazine) books.get(i));
			}
		}
		
		if (tempList.size() == 0)
			return null;
		
		Magazine[] res = new Magazine[tempList.size()];
					
		return tempList.toArray(res);
	}
	
	@Override
	public Book[] getBooks() {
		List<Book> tempList = new ArrayList<>();
		
		for(int i=0; i<books.size(); i++) {
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if(!(books.get(i) instanceof Magazine)) {
				tempList.add(books.get(i));
			}
		}
		
		if (tempList.size() == 0)
			return null;
		
		Book[] res = new Book[tempList.size()];
					
		return tempList.toArray(res);
	}
	
	@Override
	public int getTotalPrice() {
		int sum = 0;
		for (int i=0; i<books.size(); i++) {
			sum += books.get(i).getPrice();
		} 
		return sum;
	}
	
	@Override
	public double getPriceAvg() {
		double sum = 0;
		for (int i=0; i<books.size(); i++) {
			sum += books.get(i).getPrice();
		} 
		return sum / books.size();
	}

}
