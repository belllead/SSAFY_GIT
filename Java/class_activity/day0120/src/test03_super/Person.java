package test03_super;

public class Person {

	String name;
	int age;
	
	// 파라미터가 있는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("eat food");
	}
	
}