package test07_singleton;

public class PersonTest {

	public static void main(String[] args) {
		
//		Person p1 = new Person(); // 싱글턴에서는 객체를 추가로 생성할 수 없음
		Person p1 = Person.getInstance();
		
//		p1.name = "박종서"; // private 멤버변수에 접근 불가!

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = Person.getInstance();

		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
	}
	
}
