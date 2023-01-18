package test01;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person(); // 객체 생성: new 키워드 + 생성자 호출
		p1.name = "박종서";
		p1.age = 27;
		p1.eat();
		
		Person p2 = new Person();
		p2.name = "송윤제";
		p2.age = 28;
		p2.eat();
	}
	
}
