package test05_public;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		// 다른 클래스(PersonTest)에 있지만
		// 같은 패키지이므로 protected에 접근 가능
		p1.age = 15;
		
	}
	
}
