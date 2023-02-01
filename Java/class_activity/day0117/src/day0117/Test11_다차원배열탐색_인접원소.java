package day0117;

public class Test11_다차원배열탐색_인접원소 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		// 위 arr 2차원배열에서 숫자가 6일 때, 그 상하좌우 인접원소의 합은? 2+5+10+7
		
		int t = 6;
		int sum = 0;
		
//		for (int r=0; r<4; r++) {
//			for (int c=0; c<4; c++) {
//				if (arr[r][c] == t) {
//					if (r==0) {
//						if (c==0) sum += arr[r+1][c] + arr[r][c+1];
//						if (c==3) sum += arr[r+1][c] + arr[r][c-1];
//					} else if (r==3) {
//						if (c==0) sum += arr[r-1][c] + arr[r][c+1];
//						if (c==3) sum += arr[r-1][c] + arr[r][c-1];
//					} else sum += arr[r-1][c] + arr[r+1][c] + arr[r][c-1] + arr[r][c+1];
//				}
//			}
//		}
//		System.out.println(sum);
		
//		int[] dr = {-1, 1, 0, 0};
//		int[] dc = {0, 0, -1, 1};
//		for (int r=0; r<4; r++) {
//			for (int c=0; c<4; c++) {
//				// (r, c) : (0, 0) ~ (3, 3)
//					if (arr[r][c] == t) {
//					for (int d=0; d<4; d++) {
//						int nr = r + dr[d];
//						int nc = c + dc[d];
//						if (nr>=0 && nr<4 && nc>=0 && nc<4)	
//							sum += arr[nr][nc];
//					}
//				}
//			}
//		}
//		System.out.println(sum);
		
		int[] dr = {-1, 1, 0, 0, -1, 1, -1, 1};
		int[] dc = {0, 0, -1, 1, -1, -1, 1, 1};
		for (int r=0; r<4; r++) {
			for (int c=0; c<4; c++) {
				// (r, c) : (0, 0) ~ (3, 3)
					if (arr[r][c] == t) {
					for (int d=0; d<dr.length; d++) {
						int nr = r + dr[d];
						int nc = c + dc[d];
						if (nr>=0 && nr<4 && nc>=0 && nc<4)	
							sum += arr[nr][nc];
					}
				}
			}
		}
		System.out.println(sum);
		
	}
	
}
