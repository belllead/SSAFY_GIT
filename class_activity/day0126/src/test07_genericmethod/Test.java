package test07_genericmethod;

public class Test {

	public static void main(String[] args) {

		// 제네릭 클래스의 변수를 선언
		// 제네릭 클래스로 객체를 만듦
		// 선언과 객체 생성 시 타입을 지정
		GenericBox<String> strBox = new GenericBox<String>();
		
		strBox.setData("Hello Generic!");
		String s = strBox.getData();
		System.out.println(s);
		strBox.genericMethod(123); // 제네릭 메소드는 호출할 때 타입이 결정됨
				
		
	}
	
}
