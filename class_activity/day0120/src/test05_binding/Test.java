package test05_binding;

public class Test {

	public static void main(String[] args) {
		
		Student st = new Student("jongseo", 23, "sociology");
		st.eat(); // 필요하다면 자식 클래스에서 부모의 메서드를 재정의할 수 있다. 
//		st.
		
		// 다형성
		Person st2 = new Student("jongseo", 21, "design");
		st2.eat();
		
	}
	
}
