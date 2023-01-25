package Test_230125;

public class Test2 {

	public static void main(String[] args) {
		
		// 주어진 배열 생성
		int[] arr = {2, 8, 6, 4, 3, 7, 9};
				
		// 최대값, 최소값, 중간값 변수 선언
		int max = -1;
		int min = 101;	
		int med = 0;

		// 최대값, 최소값 찾기
		for (int a : arr) {
			if (a > max) max = a;
			if (a < min) min = a;
		}
		
		// 배열의 요소 크기 순위 배열 새로 생성
		int[] rankArr = new int[arr.length];
		
		// 순위 변수 선언
		int cnt = 1;
		
		// 크기가 클수록 높은 순위 배정
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (arr[i] < arr[j]) cnt++;
			}
			rankArr[i] = cnt;
			cnt = 1;
		}
		
		// 크기 순위 배열에서 중간 순위 찾기
		int sum = 0;
		for (int i=0; i<rankArr.length; i++) {
			sum += rankArr[i];
		}
		int avg = sum / rankArr.length;
		
		// 중간 순위 요소의 인덱스로 본래 배열의 중간값 찾기
		for (int i=0; i<arr.length; i++) {
			if (rankArr[i] == avg)
				med = arr[i];
		}
			
		System.out.print("최대값: " + max + ", ");
		System.out.print("최소값: " + min + ", ");
		System.out.print("중간값: " + med);
		System.out.println("의 합은 " + (max+min+med));
		
	}
	
}
