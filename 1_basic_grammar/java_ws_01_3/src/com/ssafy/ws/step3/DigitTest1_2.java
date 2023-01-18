package com.ssafy.ws.step3;

/**
 * 직각삼각형 모양의 숫자 출력하는 클래스
 */
public class DigitTest1_2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int cnt = 1;
		for (int r=0; r<5; r++) {
			for (int c=r; c<5; c++) {
				arr[r][c] = cnt++;
			}
		}		
	
		for (int r=0; r<5; r++) {
			for (int c=0; c<5; c++) {
				if (arr[r][c] == 0) {
					System.out.printf("%4s", " ");
				} else
					System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
		
	}

}