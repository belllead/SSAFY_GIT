package day0116;

public class Test06_단항연산자 {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("1: " + ++a);
		System.out.println("2: " + a++);
		System.out.println("3: " + a);
		System.out.println("4: " + -a);
		System.out.println("5: " + a);
		System.out.println("6: " + ~a);
		System.out.println("7: " + a);
		a = ~a;
		System.out.println("8: " + a);
		a = ~a;
		System.out.println("9: " + a);
		System.out.println("10: " + (float)a);
	}
}
