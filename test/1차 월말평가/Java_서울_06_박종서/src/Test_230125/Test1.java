package Test_230125;

public class Test1 {

	public static void main(String[] args) {
		
		// 2차원 배열 생성
		String[][] arr = new String[5][9];
		
		// 배열에 역삼각형 모양으로 "+" 문자 입력
		for (int r=0; r<5; r++) {
			for (int c=r; c<9-r; c++) {
				arr[r][c] = "+";
			}
		}
		
		// 배열에 값이 없는 부분을 공백으로 출력
		for (int r=0; r<5; r++) {
			for (int c=0; c<9; c++) {
				if (arr[r][c] == null) System.out.printf("%2s", " ");
				else System.out.printf("%2s", arr[r][c]);
			}
			System.out.println();
		}
		
	}
	
}