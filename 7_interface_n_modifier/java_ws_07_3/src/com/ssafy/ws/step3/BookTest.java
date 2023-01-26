package com.ssafy.ws.step3;


/**
 * BookManager 클래스를 이용하여 도서 객체 추가,삭제,조회하는 클래스
 */
public class BookTest {
	
	public static void main(String[] args) {
		
		Book b1 = new Book("21424", "Java Pro", "Kim Hana", "jaen.kr", 15000, "Java basic grammar");
		Book b2 = new Book("21425", "Java Pro2", "Kim Hana", "jaen.kr", 25000, "Java Applications");
		Book b3 = new Book("35355", "Analysis Design", "Sonamoo", "jaen.kr", 30000, "SW Modeling");
		Magazine mb1 = new Magazine("45678", "Monthly Algorithm", "John Doe", "jaen.kr", 10000, "Jan Algorithm", 2021, 1);
		
		IBookManager bm = BookManagerImpl.getInstance();
		IBookManager bm1 = BookManagerImpl.getInstance();
		System.out.println(bm == bm1);
		
		
		bm.add(b1);
		bm.add(b2);
		bm.add(b3);
		bm.add(mb1);
		bm.remove("21425");
		
		System.out.println("************************도서 전체 목록************************");
		for (Book b : bm.getList())
			System.out.println(b);
		System.out.println("************************일반 도서 목록************************");
		for (Book bb : bm.getBooks())
			System.out.println(bb);
		System.out.println("************************잡지 목록************************");
		for (Book mb : bm.getMagazines())
			System.out.println(mb);
		System.out.println("************************도서 제목 포함검색:Java************************");
		for (Book s : bm.searchByTitle("Java"))
			System.out.println(s);
//		System.out.println(bm.searchByIsbn("45678"));
		
		System.out.println("도서 가격 총합 : " + bm.getTotalPrice());
		System.out.println("도서 가격 평균 : " + bm.getPriceAvg());
		
	}
	
}
