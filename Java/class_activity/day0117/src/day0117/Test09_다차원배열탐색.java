package day0117;

public class Test09_다차원배열탐색 {

	public static void main(String[] args) {
		
		int[][] grid = {
				{2, 3, 1, 4, 7},
				{8, 13, 3, 33, 1},
				{7, 4, 5, 80, 12},
				{17, 9, 11, 5, 4},
				{4, 5, 91, 27, 7}
		};
		
		// 위 2차원 배열에서 3의 배수의 개수는?
		// 3의 배수의 합은?
		
		int count = 0;
		int sum = 0;
//		전통적인 2중 for문
//		for (int r=0; r<5; r++) {
//			for (int c=0; c<5; c++) {
//				if (grid[r][c] % 3 == 0) {
//					count++;
//					sum += grid[r][c];
//				}
//			}
//		}
		
		// for-each문
		// int[] : int[][]
		for (int[] row : grid) {
			// int : int[]
			for (int num : row) {
				if (num % 3 == 0) {
					count++;
					sum += num;
				}
			}
		}
				
		System.out.printf("개쉬 %d, 총합: %d", count, sum);
		
	}
	
}
