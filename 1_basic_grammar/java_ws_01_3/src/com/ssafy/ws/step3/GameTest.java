package com.ssafy.ws.step3;

import java.util.Scanner;

/**
 * 가위,바위,보 게임을 하는 클래스
 */
public class GameTest {

	public static void main(String[] args) {

		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.\n");
		System.out.println(" 1. 5판 3선승\n 2. 3판 2선승\n 3. 단판\n");
		System.out.print("게임번호를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int win_num = sc.nextInt();
				
		int game = 0;

		switch (win_num) {
		case 1:
			game = 3;
			System.out.println("\n5판3선승 게임입니다.");
			break;
		case 2:
			game = 2;
			System.out.println("\n3판2선승 게임입니다.");
			break;
		case 3:
			game = 1;
			System.out.println("\n단판 게임입니다.");
		}
		
		int my_win = 0;
		int com_win = 0;
		
		while (my_win < game && com_win < game) {
			System.out.print("가위바위보 중 하나를 입력하세요: ");
			
			int com_hand = (int) (Math.random()*3) + 1;
			
			Scanner sc2 = new Scanner(System.in);
			String my_hand = sc2.next();
					
			switch (my_hand) {
			case "가위":
				if (com_hand == 1) {
					System.out.printf("비겼습니다. %d승 %d패\n", my_win, com_win);
				} else if (com_hand == 2) {
					System.out.println("졌습니다!!");
					com_win++;
					System.out.printf("%d승 %d패\n", my_win, com_win);
				} else if (com_hand == 3 ){
					System.out.println("이겼습니다!!!");
					my_win++;
					System.out.printf("%d승 %d패\n", my_win, com_win);
				}
				break;
			case "바위":
				if (com_hand == 2) {
					System.out.printf("비겼습니다. %d승 %d패\n", my_win, com_win);
				} else if (com_hand == 3) {
					System.out.println("졌습니다!!");
					com_win++;
					System.out.printf("%d승 %d패\n", my_win, com_win);
				} else if (com_hand == 1 ){
					System.out.println("이겼습니다!!!");
					my_win++;
					System.out.printf("%d승 %d패\n", my_win, com_win);
				}
				break;
			case "보":
				if (com_hand == 3) {
					System.out.printf("비겼습니다. %d승 %d패\n", my_win, com_win);
				} else if (com_hand == 1) {
					System.out.println("졌습니다!!");
					com_win++;
					System.out.printf("%d승 %d패\n", my_win, com_win);
				} else if (com_hand == 2 ){
					System.out.println("이겼습니다!!!");
					my_win++;
					System.out.printf("%d승 %d패\n", my_win, com_win);
				}
				break;
			}
		}
		if (my_win == game) System.out.println("### 당신이 이겼습니다! :)");
		if (com_win == game) System.out.println("### 컴퓨터가 이겼습니다! :(");

//				
//	
//		
//		
//		
//	
//		int num = Math.abs(my_hand-com_hand);
//		
//		while (my_win<game || com_win<game)
//		if (num == 1) {
//			if (my_hand > com_hand) {
//				my_win++;
//				System.out.println("이겼습니다!!!");
//			} else {
//				com_win++;
//				System.out.println("졌습니다!!!");
//			}
//		} else if (num == 2) {
//			if (my_hand < com_hand) {
//				my_win++;
//				System.out.println("이겼습니다!!!");
//			} else {
//				com_win++;
//				System.out.println("졌습니다!!!");
//			}
//		} else {
//			System.out.println("비겼습니다.");
//		}
//		
//		
		
		
	}
}
