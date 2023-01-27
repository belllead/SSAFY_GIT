package com.ssafy.ws.step4;

/**
 * 한식 맛집 정보를 나타내는 클래스
 */
public class KoreanRestaurant extends Restaurant{

	private String number;
	private String breakTime;
	
	public KoreanRestaurant() {}
	
	public KoreanRestaurant(int resId, String name, String address, String signatureMenu, int rate, String number,
			String breakTime) {
		super(resId, name, address, signatureMenu, rate);
		this.number = number;
		this.breakTime = breakTime;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.deleteCharAt(super.toString().length()-1);
		sb.append(", number=" + number);
		sb.append(", breakTime=" + breakTime + "]");
		
		return  sb.toString() ;
	}
		
}
