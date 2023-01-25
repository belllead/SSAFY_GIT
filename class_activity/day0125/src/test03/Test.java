package test03;

public class Test {

	public static void main(String[] args) {
		// 자식 클래스에서 추상클래스에 없는 메소드를 추가해보자
		// eat()
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
		a1.eat();
		// 안 되는 것을 해결하는 방법
		// 부모 클래스에 추상 메소드 혹은 일반 메소드를 정의해놔야
		// 부모 클래스 타입으로 참조했을 때 메소드 사용 가능
		
		// 조상 클래스에서 일반 메소드로 만드는 것 vs. 추상 메소드
		// 일반 메소드 => 상속
		// 추상 메소드 => 상속
		
		// 강제성의 차이가 있음
		
		// 부모 클래스에서 일반 메소드를 사용하는 경우
		// => 자식 클래스에서 재정의 안 하고 넘어갈 수 있음
		
		// 부모 클래스에서 일반 메소드, 추상 메소드 둘 다 안 만들고
		// 자식 클래스에서 독립적으로 만들어서 사용하는 경우
		// => 다형성 활용 불가
		
	}
	
}
