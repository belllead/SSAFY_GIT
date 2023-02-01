package day0117;

public class Test10_다차원배열탐색2 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		// 행 우선탐색
		for (int r=0; r<4; r++) {
			for (int c=0; c<4; c++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 열 우선탐색
		for (int c=0; c<4; c++) {
			for (int r=0; r<4; r++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 행-지그재그탐색
		for (int r=0; r<4; r++) {
			if (r % 2 == 0) {
				for (int c=0; c<4; c++) {
				System.out.printf("%4d", arr[r][c]);
				}
			} else {
				for (int c=3; c>=0; c--) {
				System.out.printf("%4d", arr[r][c]);
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for (int r=0; r<4; r++) {
			for (int c=0; c<4; c++) {
				System.out.printf("%4d", arr[r][c + (r % 2)*(3-2*c)]);
			}
			System.out.println();
		}
				
	}
	
}
