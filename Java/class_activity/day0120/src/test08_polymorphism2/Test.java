package test08_polymorphism2;

public class Test {

	public static void main(String[] args) {
		
		Student st = new Student("jongseo", 23, "java");
		
		Person p = st;
		
		Student st3 = (Student) p;
		st3.study();
		
		Person p2 = new Person("johnson", 24);
		
		Student st2 = (Student) p2;
//		st2.study(); // 에러
		
	}
	
}
