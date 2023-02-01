package com.ssafy.hw.step4;

import java.util.Scanner;

public class DayCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int num = 0;
		
		switch (month) {
		case 12:
			num += 30;
		case 11:
			num += 31;
		case 10:
			num += 30;
		case 9:
			num += 31;
		case 8:
			num += 31;
		case 7:
			num += 30;
		case 6:
			num += 31;
		case 5:
			num += 30;
		case 4:
			num += 31;
		case 3:
			num += 28;
		case 2:
			num += 31;
		case 1:
			break;
		}
		System.out.println(month + "월 "+ day + "일은 " + (num + day) + "번째 날입니다.");
//		31
//		28
//		31
//		30
//		31
//		30
//		31
//		31
//		30
//		31
//		30
//		31
	
	}

}
