package test07_polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Person[] persons = new Person[3];
		persons[0] = new Person("jongseo", 21);
		persons[1] = new Person("yunje", 24);
		persons[2] = new Student("jina", 22, "java");
		// 부모 클래스로 참조할 수 있지만,
		// 부모 클래스의 관점에서 보기 때문에,
		// 접근 가능한 범위가 달라진다.
		
		for (Person p : persons) {
			System.out.println(p.toString());
		}
		
		Person st = new Student("ddd", 124, "gfasdg");
//		st.
		
	}
	
}
