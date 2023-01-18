package com.ssafy.hw.step4;

import java.util.Scanner;

public class SpiderWeb {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] tree = new int[N][N];
		
		// 장애물 배정
		for (int row=0; row<N; row++) {
			for (int col=0; col<N; col++) {
				tree[row][col] = sc.nextInt();
			}
		}
				
		// 장애물 배열 확인
//		for (int row=0; row<N; row++) {
//			for (int col=0; col<N; col++) {
//				System.out.print(tree[row][col]);
//			}
//			System.out.println();
//		}
		
		// 거미줄 치기
		int webCnt = 0;
		int max = 0;
		int maxRow = 0;
		int maxCol = 0;
		
		for (int row=0; row<N; row++) {
			for (int col=0; col<N; col++) {
				
				if (tree[row][col] == 0) webCnt++;
				
				for (int i=1; i<N; i++) {	
					// 상
					if (row-i >= 0) {
						if (tree[row-i][col] == 0) { 
							webCnt++;
						} else if (tree[row-i][col] == 1)
							if (row-i-1 >= 0)
								if (tree[row-i-1][col] == 1) 
									break;
					}
				}
				
				for (int i=1; i<N; i++) {
					// 하
					if (row+i<N) {
						if (tree[row+i][col] == 0) { 
							webCnt++;
						} else if (tree[row+i][col] == 1)
							if (row+i+1 < N)
								if (tree[row+i+1][col] == 1) 
									break;
					}
				}
				for (int i=1; i<N; i++) {
					// 좌
					if (col-i>=0) {
						if (tree[row][col-i] == 0) { 
							webCnt++;
						} else if (tree[row][col-i] == 1)
							if (col-i-1 >= 0)
								if (tree[row][col-i-1] == 1) 
									break;
					}
				}
				for (int i=1; i<N; i++) {
					// 우
					if (col+i<N) {
						if (tree[row][col+i] == 0) { 
							webCnt++;
						} else if (tree[row][col+i] == 1)
							if (col+i+1 < N)
								if (tree[row][col+i+1] == 1) 
									break;
					}
				}
				for (int i=1; i<N; i++) {
					// 좌상
					if (row-i >= 0 && col-i>=0) {
						if (tree[row-i][col-i] == 0) { 
							webCnt++;
						} else if (tree[row-i][col-i] == 1)
							if (row-i-1 >= 0 && col-i-1 >= 0)
								if (tree[row-i-1][col-i-1] == 1) 
									break;
					}
				}
				for (int i=1; i<N; i++) {
					// 우상
					if (row-i >= 0 && col+i<N) {
						if (tree[row-i][col+i] == 0) { 
							webCnt++;
						} else if (tree[row-i][col+i] == 1)
							if (row-i-1 >= 0 && col+i+1 < N)
								if (tree[row-i-1][col+i+1] == 1) 
									break;
					}
				}
				for (int i=1; i<N; i++) {
					// 좌하
					if (col-i>=0 && row+i<N) {
						if (tree[row+i][col-i] == 0) { 
							webCnt++;
						} else if (tree[row+i][col-i] == 1)
							if (row+i+1 < N && col-i-1 >= 0)
								if (tree[row+i+1][col-i-1] == 1) 
									break;
					}
				}
				for (int i=1; i<N; i++) {
					// 우하
					if (row+i<N && col+i<N) {
						if (tree[row+i][col+i] == 0) { 
							webCnt++;
						} else if (tree[row+i][col+i] == 1)
							if (row+i+1 < N && col+i+1 < N)
								if (tree[row+i+1][col+i+1] == 1) 
									break;
					}
				}
					
//				System.out.print(" "+webCnt+" ");
				if (max < webCnt) {
					max = webCnt;
					maxRow = row;
					maxCol = col;
				}
				webCnt = 0;				
			}
		}
		
		System.out.println(max);
		System.out.println(maxRow+","+maxCol);
		
	}

}
