package com.ssafy.ws.step2;

import java.util.Scanner;

public class AppleTree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] land = new int[N][N];
		
		// 땅 입력 
		for (int row=0; row<N; row++) {
			String nutr = sc.next();
			for (int col=0; col<N; col++) {
				String t = nutr.substring(col, col+1);
				int num = Integer.parseInt(t);
				land[row][col] = num;
			}
		}
	
		// 땅 출력
//		for (int row=0; row<N; row++) {
//			for (int col=0; col<N; col++) {
//				System.out.print(land[row][col]);
//			} 
//			System.out.println();
//		}
		
		// 인접한 땅 양분 더하기 + 그 중 최대값 찾기
		int sum = 0;
		int max_sum = 0;
		
		int[] dr = {0, -1, 1, 0, 0};
		int[] dc = {0, 0, 0, -1, 1};
		for (int r=0; r<N; r++) {
			for (int c=0; c<N; c++) {
				for (int d=0; d<5; d++) {
					int nr = r + dr[d];
					int nc = c + dc[d];
					if (nr>=0 && nr<N && nc>=0 && nc<N)	
						sum += land[nr][nc];
//					System.out.println(sum);
				}
				if (sum > max_sum) 
					max_sum = sum;
					sum = 0;
			}
		}
		
		System.out.println(max_sum);
				
	}
	
}