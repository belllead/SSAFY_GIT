package com.ssafy.ws.step4;

import java.util.Scanner;

/**
 * 체크메이트 판별하기
 */ 
public class Checkmate {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int testNum = sc.nextInt();
		int[] anss = new int[testNum];
		
		for (int test=0; test<testNum; test++) {
			
			int N = sc.nextInt();
			
//			int[][] board = new int[N][N];
			
			int k_x = sc.nextInt() - 1;
			int k_y = sc.nextInt() - 1;
			int q_x = sc.nextInt() - 1;
			int q_y = sc.nextInt() - 1;
			
			int ans = 0;
			
			for (int i=0; i<N; i++) {
				if (q_x-i == k_x && q_y == k_y) {
					ans = 1;
				} else if  (q_x+i == k_x && q_y == k_y) {
					ans = 1;
				} else if  (q_y-i == k_y && q_x == k_x) {
					ans = 1;
				} else if  (q_y+i == k_y && q_x == k_x) {
					ans = 1;
				} else if  (q_x-i == k_x && q_y-i == k_y) {
					ans = 1;
				} else if  (q_x+i == k_x && q_y-i == k_y) {
					ans = 1;
				} else if  (q_x-i == k_x && q_y+i == k_y) {
					ans = 1;
				} else if  (q_x+i == k_x && q_y+i == k_y) {
					ans = 1;
				}				
			}
						
			anss[test] = ans;
			ans = 0;
//		q_x - i, q_y
//		q_x + i, q_y
//		q_x, q_y - i
//		q_x, q_y + i
//		q_x - i, q_y + i
//		q_x - i, q_y - i
//		q_x + i, q_y - i
//		q_x + i, q_y + i
		
		}
		
		for (int testCase=0; testCase<testNum; testCase++) {
			System.out.printf("#%d " + anss[testCase], testCase+1);
			System.out.println();
		}
		
	}
}