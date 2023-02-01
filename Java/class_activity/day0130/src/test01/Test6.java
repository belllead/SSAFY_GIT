package test01;

public class Test6 {

	public static void main(String[] args) {
		
		// try ~ catch ~ catch
		try {
//			int num = Integer.parseInt("ssafy");
			int num1 = 4 / 0;
			
			// | 연산자를 이용해서, 하나의 catch 블록에서
			// 다양한 종류의 예외를 동시에 처리가 가능
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("하나의 블록에서 세 가지 예외를 처리합니다.");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index over");
//		} catch (NumberFormatException e) { // 모든 예외를 처리할 수 있는 블록
//			// 다형성이 적용
//			System.out.println("no int");
		}
		
	}
	
}
