package com.ssafy.ws.step3;

/**
 * BookManager 클래스를 이용하여 도서 객체 추가,삭제,조회하는 클래스
 */
public class BookTest {

	public static void main(String[] args) {

		Book b1 = new Book("001", "Lord of the Rings", "Tolkien", "Legend.Co", 14000, "classic fantasy");
		Book b2 = new Book("002", "Hunger Games", "Don Remember", "Teens.Co", 11000, "best seller");
		Book b3 = new Book("003", "Friends", "Loss Geller", "ComedyPlace", 15000, "hilarious");
		Book b4 = new Book("004", "My Friend", "John Doe", "ComedyPlace", 25000, "heartbreaking");

		
		System.out.println(b1.getAuthor());
		System.out.println(b2.getDesc());
		
		BookManager bm = new BookManager();
		
		bm.add(b1);
		bm.add(b2);
		bm.add(b3);
		bm.add(b4);
		
		System.out.println("***********************도서목록***********************");
		for (Book b : bm.getList())
			System.out.println(b);
		System.out.println();
		
		System.out.println("***********************도서조회:002***********************");
		System.out.println(bm.searchByIsbn("002"));
		System.out.println();
		
		System.out.println("***********************도서삭제:002***********************");
		bm.remove("002");
		for (Book b : bm.getList())
			System.out.println(b);
		System.out.println();
		
		System.out.println("***********************도서추가 후 목록***********************");		
		Book b5 = new Book("005", "My Friend", "John Doe", "ComedyPlace", 25000, "heartbreaking");
		bm.add(b5);
		for (Book b : bm.getList())
			System.out.println(b);
		
		

	}
}
