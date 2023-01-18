package test06;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("박종서", 27);
		Person p2 = new Person("송윤제", 24);
		Person p3 = new Person("유지나", 22);
		Person p4 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p4.name);
		
	}
	
}
