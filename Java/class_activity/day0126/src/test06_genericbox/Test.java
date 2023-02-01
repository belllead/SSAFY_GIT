package test06_genericbox;

public class Test {

	public static void main(String[] args) {

		// 제네릭 클래스의 변수를 선언
		// 제네릭 클래스로 객체를 만듦
		// 선언과 객체 생성 시 타입을 지정
		GenericBox<String> strBox = new GenericBox<String>();
		
		strBox.setData("Hello Generic!");
		String s = strBox.getData();
		System.out.println(s);
		
		// new 키워드 다음에 생성자를 호출할 때 <> 안에 타입은 생략 가능
		// 왜냐하면 컴파일러가 문맥에서 유추할 수 있음
		// <> : 다이아몬드
		GenericBox<Integer> intBox = new GenericBox<>();
		intBox.setData(123);
		Integer i = intBox.getData();
		System.out.println(i);
		
		// Integer : 래퍼 클래스(wrapper class)
		// 기본형으로 사용하는 int => 값
		// 래퍼 클래스를 이용하면 객체처럼 사용 가능 => 메소드 사용 가능
		int b = 123;
		// b. (vs.) i.
		
		// 래퍼 클래스
		// byte => Byte
		// short => Short
		// int => Integer
		// long => Long
		// float => Float
		// double => Double
		// char => Character
		// boolean => Boolean
		// void => Void
		
		int i1 = new Integer(123); // 기본형 값으로만 사용
		Integer i2 = new Integer(123); // 객체처럼 사용 가능
//		i1.
//		i2.
		
		// static method
		int num = Integer.parseInt("123123");
		
	}
	
}
