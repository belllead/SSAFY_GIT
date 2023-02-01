package test01;

public class Test5 {

	public static void main(String[] args) {
		
		// try ~ catch ~ catch
		try {
			int num = Integer.parseInt("ssafy");
			
			// 해당하는 catch 블록을 만나지 못한다면
			// 예외는 처리되지 않는다.
		} catch (ArithmeticException e) {
			System.out.println("no int");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index over");
		} 
		
	}
	
}
