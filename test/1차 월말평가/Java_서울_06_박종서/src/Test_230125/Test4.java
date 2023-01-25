package Test_230125;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		// 상품금액, 투입금액, 거스름돈 변수 선언
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int pay = 10000;
		int change = pay-price;
		
		System.out.println("투입금액: " + pay + "원");
		System.out.println("상품금액: " + price + "원");
		System.out.println("거스름돈: " + change + "원");
		System.out.println("----------------------");
		
		// 1000원권, 500원권, 100원권, 10원권 변수 할당
		int thou = 0;
		int five = 0;
		int hund = 0;
		int ten = 0;
		
		// 큰 금액권부터 거스름돈 차감
		// 1000원 이상일 때
		while (change / 1000 > 0) {
			thou++;
			change -= 1000;
		}
	
		// 500원 이상일 때
		while (change / 500 > 0) {
			five++;
			change -= 500;
		}
	
		// 100원 이상일 때
		while (change / 100 > 0) {
			hund++;
			change -= 100;
		}
		
		// 10원 이상일 때
		while (change / 10 > 0) {
			ten++;
			change -= 10;
		}
								
		System.out.println("1000원:" + thou);
		System.out.println("500원:" + five);
		System.out.println("100원:" + hund);
		System.out.println("10원:" + ten);
		
	}
	
}
