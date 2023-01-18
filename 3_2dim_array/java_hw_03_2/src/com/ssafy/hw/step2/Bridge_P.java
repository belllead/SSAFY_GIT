package com.ssafy.hw.step2;

import java.util.Scanner;

public class Bridge_P {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		// n * n 크기 배열 선언 ( 지도 )
		int[][] map = new int[N][N];
		
		// 지도 정보 입력 받기
		for (int row=0; row<N; row++) {
			for (int col=0; col<N; col++) {
				map[row][col] = sc.nextInt();
			}
		}
		
		// 최대값 저장
		int maxDistance = 0;
		
		for (int row=0; row<N; row++) {
			for (int col=0; col<N; col++) {
				
				// 지금 위치가 섬인지 검사
				if (map[row][col] == 1) {
					
					// 섬이면 현재 위치로부터 사방탐색 하여 가로 또는 세로에 있는 섬과 거리 측정, 최대값 저장
					
					// 동쪽이 1인지 검사
					for (int d = 1; d<N-col; d++) {
						if (map[row][col + d] == 1) {
							maxDistance = Math.max(d , maxDistance);
							break;
						}
					}
					
					// 서쪽이 1인지 검사
					for (int d = 1; d<col; d++) {
						if (map[row][col - d] == 1) {
							maxDistance = Math.max(d, maxDistance);
							break;
						}
					}
					
					// 북쪽이 1인지 검사
					for (int d = 1; d<row; d++) {
						if (map[row - d][col] == 1) {
							maxDistance = Math.max(d , maxDistance);
							break;
						}
					}
					
					// 남쪽이 1인지 검사
					for (int d = 1; d<N-row; d++) {
						if (map[row + d][col] == 1) {
							maxDistance = Math.max(d, maxDistance);
							break;
						}
					}
				}
			}
		}
		
		System.out.println(maxDistance);

	}
}
