package com.ssafy.ws.step2;

import java.util.Scanner;

public class Season2 {

	public static void main(String[] args) {

		int limit = 0;
		while (limit < 3) {
			System.out.print("월 입력: ");
			Scanner sc = new Scanner(System.in);
			int month = sc.nextInt();
			
			switch (month) {
			case 3:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 4:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 5:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 6:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 7:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 8:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9:
				System.out.println(month + "월은 가을입니다.");
				break;
			case 10:
				System.out.println(month + "월은 가을입니다.");
				break;
			case 11:
				System.out.println(month + "월은 가을입니다.");
				break;
			case 12:
				System.out.println(month + "월은 겨울입니다.");
				break;
			case 1:
				System.out.println(month + "월은 겨울입니다.");
				break;
			case 2:
				System.out.println(month + "월은 겨울입니다.");
				break;
			}
			limit++;
		}

	}

}
