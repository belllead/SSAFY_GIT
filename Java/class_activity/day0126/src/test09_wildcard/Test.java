package test09_wildcard;

public class Test {

	public static void main(String[] args) {

		GenericBox<Student> studentBox = new GenericBox<>();
		GenericBox<Person> personBox = new GenericBox<>();
		GenericBox<Object> objectBox = new GenericBox<>();
		
		// ? : 어떤 타입이든
		GenericBox<?> allBox = objectBox;
		allBox = personBox;
		allBox = studentBox;
		
		// ? extends T : T 또는 T의 자손만
		GenericBox<? extends Person> personAndChild = personBox;
		personAndChild = studentBox;
//		personAndChild = objectBox; // 넣을 수 없음
		
		// ? super T : T 또는 T의 조상만
		GenericBox<? super Person> personAndParent = personBox;
//		personAndParent = studentBox; // 넣을 수 없음
		personAndParent = objectBox;
		
	}
	
}
