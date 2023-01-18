package com.ssafy.ws.step3;

/**
 * 도서 객체를 생성하고 정보를 출력하는 클래스
 */
public class BookTest {
	
	public static void main(String[] args) {

		Book bk1 = new Book();
		bk1.isbn = "21424";
		bk1.title = "Java Pro";
		bk1.author = "김하나";
		bk1.publisher = "jaen.kr";
		bk1.price = 30000;
		bk1.desc = "Java 기본 문법";
		
		Book bk2 = new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링");
		
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
	}
	
}
