package test01;

public class Test1 {

	public static void main(String[] args) {
		
		// java.lang.ArrayIndexOutOfBoundsException
		int[] nums = {10}; // 인덱스가 0밖에 없음
//		nums[0];
//		System.out.println(nums[1]);
//		System.out.println(nums[-1]); // 오버플로우가 발생할 때 음수가 들어가는 경우 왕왕 발생 => int보다 long형 사용 권장
		
		// java.lang.ArithmeticException
//		int num = 5 / 0;
		
//		int num = Integer.parseInt("123");
//		// java.lang.NumberFormatException
//		int num1 = Integer.parseInt("ssafy");
		
		// 예외는 언제 발생? throw 키워드를 사용해서,
		// new 예외생성자() => 예외 객체
		// 예외 객체를 던질 때 발생
		// 예외사 발생? 내부적으로는 예외 객체가 생성돼서 던져진 것임		
//		throw new ArrayIndexOutOfBoundsException(); 
//		throw new ArithmeticException();
//		throw new NumberFormatException();
		
//		throw new Exception(); => checked Exception이라 빨간 줄
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외를 처리합니다.");
		}
		System.out.println("done");
		
	}
	 
}
