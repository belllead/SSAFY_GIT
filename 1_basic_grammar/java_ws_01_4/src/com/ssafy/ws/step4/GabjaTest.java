package com.ssafy.ws.step4;

import java.util.Scanner;

/**
 * 60 갑자를 서양력으로 변환하는 프로그램
 */

public class GabjaTest {

    public static void main(String[] args) {

    	System.out.print("60갑자를 입력하세요: ");
    	Scanner sc = new Scanner(System.in);
    	String gapja = sc.next();
    	String gan = gapja.substring(0,1);
    	String ji = gapja.substring(1,2);
    	
    	String[] ganArr = {"신", "임", "계", "갑", "을", "병", "정", "무", "기", "경"};
    	String[] jiArr = {"유", "술", "해", "자", "축", "인", "묘", "진", "사", "오", "미", "신"};
    	
    	int gan_index = 0;
    	int ji_index = 0;
    	
    	while (!gapja.equals("종료")) {
	    
    		// 갑자의 나머지를 나타내는 변수 == 십이간지 배열의 인덱스
	    	for (String t1 : ganArr) {
	    		gan_index++;
	    		if (t1.equals(gan)) {
	    			if (gan_index == 10) gan_index = 0;
	    			break;
	    		}
	    		if (gan_index == 10) gan_index++;
	    	}
	   		for (String t2 : jiArr) {
	   			ji_index++;
	   			if (t2.equals(ji)) {
	   				if (ji_index == 12) ji_index = 0;
	   				break;
	   			}
	   			if (ji_index == 12) ji_index++;
			}
	   		
	   		if (gan_index == 11 || ji_index == 13) {
	   			System.out.println("잘못된 입력");
	   		}
	  
	   		// 중간 점검
//	   		System.out.println(gan_index);
//	   		System.out.println(ji_index);
	   		
	    	// 연도 출력
    		if (gan_index % 2 == ji_index % 2) {	
    			for (int year=1800; year<2101; year++) {
		    		if (year % 10 == gan_index && year % 12 == ji_index) {
		    				System.out.print(year + " ");
		    		}
	    		} 
	    	} else System.out.println("잘못된 입력");
	    	
	    	// 초기화
	    	System.out.print("\n60갑자를 입력하세요: ");
	    	sc = new Scanner(System.in);
	    	gapja = sc.next();
	    	gan = gapja.substring(0,1);
	    	ji = gapja.substring(1,2);
	    	gan_index = 0;
	    	ji_index = 0;
	    	
    	}
    	
    }
}
