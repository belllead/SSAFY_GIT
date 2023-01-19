package test06_getter_setter;

public class Person {

	// 접근자와 설정자
	// 먼저 멤버 변수를 private으로 선언한다.
	private String name;
	private int age;
	private boolean hungry;
	
	
	// 위 멤버변수에 접근할 수 있는 통로를
	// public한 메서드로 만들어줌
	// - 값을 변경 => 설정자(setter) : set + 멤버변수 이름
	// - 값을 조화 => 접근자(getter) : get + 멤버변수 이름

	// 마우스 우클릭 => source => generate getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("no no not born yet");
			return;
		}
		if (age > 200) {
			System.out.println("you lived that long?");
			return;
		}
		this.age = age;
	}
	public boolean isHungry() {
		return hungry;
	}
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
		
		
	}
	
}
