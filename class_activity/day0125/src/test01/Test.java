package test01;

public class Test {

	public static void main(String[] args) {
		
		// 추상클래스로 객체를 만들 수 있을까?
//		Animal a = new Animal();
		
		// 다형성
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
		// 부모 클래스 타입의 변수이지만
		// 메소드의 호출은 실제 생성된 객체가 갖고 있는 메소드가 실행됨
		a1.speak();
		a2.speak();
		a3.speak();
		
		// 추상 클래스를 쓰는 이유
		// 1. 객체가 생성되지 못하도록 막기(그게 합리적일 때)
		// 2. 자식 클래스에서 메소드의 재정의(오버라이드)를 강제하기 위함
		// 3. 다형성을 이용하기 위해
		// 4. 상속을 통한 코드 중복 제거
		
	}
	
}
