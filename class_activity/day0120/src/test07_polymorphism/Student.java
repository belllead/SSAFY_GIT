package test07_polymorphism;

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

	@Override
	public boolean equals(Object obj) {
		return name.equals(((Student)obj).name); // String의 equals 메소드를 사용한 것
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return "Student [name=" + super.name + ", age=" + super.age + ", major=" + this.major + "]";
	}


	
	
	
}
