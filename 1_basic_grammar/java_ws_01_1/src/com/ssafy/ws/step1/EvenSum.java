package com.ssafy.ws.step1;

import java.util.Scanner;

public class EvenSum {
	public static void main(String[] args) {
		
		System.out.print("숫자 입력: ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int ans = 0;
		
		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0) {
				ans += i;
			}
		}
		System.out.printf("1부터 %d까지 수 중 짝수의 합 = " + ans, limit);
		
	}
}
