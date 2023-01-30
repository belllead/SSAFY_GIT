package test01;

public class Test2 {

	public static void main(String[] args) {
		
		// try ~ catch문 사용하기
		int[] nums = {10};

		// catch() 안에 오는 예외 클래스는
		// 그 예외 클래스이거나, 그 클래스의 자식 클래스인 경우
		// 에만 기능함
		try {
			System.out.println(nums[1]);
			// 발생한 예외 : ArrayIndexOutOfBoundsException

//		} catch (Exception e) { // => 어떤 예외든 처리 가능
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch가 잡을 수 있는 예외 객체
			// ArrayIndexOutOfBoundsException이거나, 이 클래스의 자식 객체만
			System.out.println("배열의 크기가 넘어갔을 때 대처 코드");
			System.out.println("에러 메시지: " + e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("done");
		
		
	}
	
}
