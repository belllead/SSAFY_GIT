package com.ssafy.ws.step2;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {

		// #1
		int[] arr = {1, 2, 3, 4, 5};
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		// #2
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String[] food = new String[num];
		for (int j=0; j<num; j++) {
			sc = new Scanner(System.in);
			String food_name = sc.next();
			food[j] = food_name;
		}
		for (int i=0; i<food.length; i++) {
			System.out.println(food[i]);
		}
	
	}
	
}
