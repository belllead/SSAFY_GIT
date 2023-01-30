package test01;

public class Test4 {

	public static void main(String[] args) {
		
		// try ~ catch ~ catch
		try {
			int num = Integer.parseInt("ssafy");
			
			// 다중 예외처리를 할 때는 순서가 중요!
			// 자식 예외를 먼저 검사하고, 나중에 큰 예외를 검사
			
		} catch (Exception e) { // 모든 예외를 처리할 수 있는 블록
			// 다형성이 적용
			System.out.println("all exception");
//		} catch (ArithmeticException e) {
//			System.out.println("no int");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index over"); 
		}
		
	}
	
}
