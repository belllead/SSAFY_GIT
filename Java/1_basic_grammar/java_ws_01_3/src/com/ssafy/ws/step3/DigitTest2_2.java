package com.ssafy.ws.step3;

/**
 * 직각삼각형 모양의 숫자 출력하는 클래스
 */
public class DigitTest2_2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int cnt = 1;
		for (int r=0; r<5; r++) {
			for (int c=(2-Math.abs(r-2)); c<=(2+Math.abs(r-2)); c++) {
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

//  0 1 2 3 4
//0			-2 0~4
//1			-1 1~3
//2			0 2~2
//3			1 1~3
//4			2 0~4