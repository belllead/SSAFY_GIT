package test03_default;

// class는 public 아니면 default
public class Person {

	String name; // 접근제한자를 생략하면, 접근제한자가 default
	int age;
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		// 자기 자신이므로 접근 가능
		p1.age = 14;
		
	}
	
}
