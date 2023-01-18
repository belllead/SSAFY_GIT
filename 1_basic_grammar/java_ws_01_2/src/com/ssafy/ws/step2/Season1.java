package com.ssafy.ws.step2;

import java.util.Scanner;

public class Season1 {

	public static void main(String[] args) {
		
		for (int i=0; i<3; i++) {
			System.out.print("월 입력: ");
			Scanner sc = new Scanner(System.in);
			int month = sc.nextInt();
			
			if (3<=month && month<=5) {
				System.out.println(month + "월은 봄입니다.");
			} else if (6<=month && month<=8) {
				System.out.println(month + "월은 여름입니다.");
			} else if (9<=month && month<=11) {
				System.out.println(month + "월은 가을입니다.");
			} else {
				System.out.println(month + "월은 겨울입니다.");
			}
		}
		
	}

}
