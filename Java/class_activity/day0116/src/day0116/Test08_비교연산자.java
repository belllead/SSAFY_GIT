package day0116;

public class Test08_비교연산자 {
	public static void main(String[] args) {
//		int a = 10;
//		System.out.println(a > 10);
////		System.out.println(false);
//		System.out.println(a != 10);
//		System.out.println(a >= 10);
//		System.out.println(a == 10);
//		System.out.println(a != 10);
		
		// *중요: 문자열의 비교!! 
		// 반드시 equals 메서드를 사용
		String s1 = "Hi"; // 문자열 pool에 넣고 주소 참조
		String s2 = "Hi"; // 문자열 pool에 있는 거 가져옴
		String s3 = new String("Hi"); // 문자열 pool에 새로 만들어서 새 주소 참조
		// 주소값의 비교
		System.out.println(s1 == s2); // true 주소값이 같다
		System.out.println(s1 == s3); // false 참조값이 같다
		// 주소값이 아닌 실제 문자의 값을 비교
		System.out.println(s1.equals(s2)); // true 문자열 값이 같다.
		System.out.println(s1.equals(s3)); // true 문자열 값이 같다.
	}
}
