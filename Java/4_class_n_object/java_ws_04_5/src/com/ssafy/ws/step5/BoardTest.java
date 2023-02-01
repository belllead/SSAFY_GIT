package com.ssafy.ws.step5;

import java.util.Date;

public class BoardTest {
	public static void main(String[] args) {
		
		User u1 = new User(0, "ssafy", "ss1234", "John", "Johnny", "ssafy@ssafy.com");
		User u2 = new User(1, "hong", "hong123", "Michael", "MC", "hong@ssafy.com");
		User u3 = new User(2, "samsic", "samsic234", "Sam", "Sammy", "kim@ssafy.com");
		User u4 = new User(3, "happy", "happy234", "Lee", "Leedle", "lee@ssafy.com");
		
		
		Date now = new Date();
		
		Article a1 = new Article(0, "공지사항", "게시글 내용", 0, 0, now);
		Article a2 = new Article(0, "코딩테스트란", "게시글 내용", 0, 0, now);
		Article a3 = new Article(0, "취뽀는 나에게", "게시글 내용", 0, 0, now);
		Article a4 = new Article(0, "완전정복", "게시글 내용", 0, 0, now);
		
		
		Comment c1 = new Comment(0, 1, 5, "잘 보았습니다", now);
		Comment c2 = new Comment(1, 1, 4, "좋은 글 입니다~~", now);
		
		
		System.out.println("User 출력");
		System.out.println("--------------------------------------");
		System.out.println(u1.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());
		System.out.println(u4.toString());
		
		System.out.println("\n게시글");
		System.out.println("--------------------------------------");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());

		
		
		System.out.println("\n게시글 댓글 출력");
		System.out.println("--------------------------------------");
		System.out.println(c1.toString());
		System.out.println(c2.toString());

		
		
	}
}
