package com.ssafy.ws.step4;

import java.util.Arrays;

/**
 * 맛집 정보를 나타내는 클래스
 */
public class Restaurant {

	int resId;
	String name;
	String address;
	String signatureMenu;
	int rate;
	
	public Restaurant() {}
	
	public Restaurant(int resId, String name, String address, String signatureMenu, int rate) {
		this.resId = resId;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}
	
	public String toString() {
		String resIdStr = Integer.toString(resId);
		String rateStr = Integer.toString(rate);
		return "Restaurant [resID=" + resIdStr + ", name=" + name +", address= " + address + ", signatureMenu=" + signatureMenu + ", rate=" + rateStr + "]";
	}
	
}
