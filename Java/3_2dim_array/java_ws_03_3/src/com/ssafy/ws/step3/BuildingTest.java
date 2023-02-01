package com.ssafy.ws.step3;

import java.util.Scanner;

/**
 * B구획의 빌딩 최고 높이 구하기
 */ 
public class BuildingTest {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int test_num = sc.nextInt();

		// 답안지 배열
		String[] test_result = new String[test_num];
		
		// 테스트 케이스 루프 시작
		for (int test=0; test<test_num; test++) {
			
			int N = sc.nextInt();
			String[][] land = new String[N][N];
			
			// 땅 입력 
			for (int row=0; row<N; row++) {
				String inspect = sc.next();
				for (int col=0; col<N; col++) {
					String t = inspect.substring(col, col+1);
					land[row][col] = t;
				}
			}
		
			// 땅 출력
//			for (int row=0; row<N; row++) {
//				for (int col=0; col<N; col++) {
//					System.out.print(land[row][col]);
//				} 
//				System.out.println();
//			}
			
			int max_floor = 0;
	
			// 공원 인접 구역 판별
			boolean auth = true;	
					
			int[] dr = {0, -1, 1, 0, 0, -1, 1, -1, 1};
			int[] dc = {0, 0, 0, -1, 1, -1, -1, 1, 1};
			for (int row=0; row<N; row++) {
				for (int col=0; col<N; col++) {
	
					auth = true;
	
					for (int d=0; d<9; d++) {
						int nr = row + dr[d];
						int nc = col + dc[d];
						if (nr>=0 && nr<N && nc>=0 && nc<N)	
							if (land[nr][nc].equals("G")) 
								auth = false;
					
					} 
//					System.out.println(auth);
					
					// 빌딩 층수 판별	
					int floor_cnt = 0;
					
					if (auth) {
						// 공원에 인접하지 않을 때
						int build_row = row;
						int build_col = col;
						
						for (int i=0; i<N; i++) {
							if (land[build_row][i].equals("B")) floor_cnt++;
							if (land[i][build_col].equals("B")) floor_cnt++;
						}
						floor_cnt -= 1;
//						System.out.println(floor_cnt);
						max_floor = Math.max((floor_cnt), max_floor);
					} else {
						// 공원에 인접할 때
						floor_cnt = 2;
//						System.out.println(floor_cnt);
						max_floor = Math.max(floor_cnt, max_floor);
					}
					
					
				}
			}		
			
			test_result[test] =  "#" + (test+1) + " " + max_floor;
		}
		
		for (String ans : test_result)
			System.out.println(ans);
		
	}
}