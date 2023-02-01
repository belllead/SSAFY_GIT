package test04_overriding;

public class Student extends Person {

	String major;
	
	// 파라미터가 있는 생성자를 만들어줘야 한다.	
	public Student(String name, int age, String major) {
		super(name, age); // 부모클래스의 생성자를 호출
		this.major = major;
	}

	public void study() {
		System.out.println("study major");
	}
	
	// annotation을 붙이는 것을 권장
	// 붙이지 않아도 오버라이드 되지만...
	@Override
	public void eat() {
		System.out.println("eat knowledge");
	}
}
