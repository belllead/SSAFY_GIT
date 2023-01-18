package com.ssafy.ws.step3;

/**
 * 모래시계 모양의 숫자 출력하는 클래스
 */
public class DigitTest2 {

	public static void main(String[] args) {

		for (int i=1; i<=17; i++) {
			if (i<=5) {
				System.out.printf("%d  ", i);
				if (i==5) System.out.print("\n   ");
			} else if (i<=8) {
				System.out.printf("%d  ", i);
				if (i==8) System.out.print("\n      ");
			} else if (i==9) {
				System.out.printf("%d ", i);
				System.out.print("\n   ");
			} else if (i<=12) {
				System.out.printf("%d ", i);
				if (i==12) System.out.print("\n");
			} else {
				System.out.printf("%d ", i);
			}	
		}
		 
	}
}
