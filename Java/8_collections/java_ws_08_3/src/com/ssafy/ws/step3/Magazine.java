package com.ssafy.ws.step3;

/**
 * 잡지 정보를 나타내는 클래스
 */
public class Magazine extends Book {

	private int year;
	private int month;
	
	public Magazine() {}

	public Magazine(String isbn, String title, String author, String publisher, int price, String desc, int year,
			int month) {
		super(isbn, title, author, publisher, price, desc);
		this.year = year;
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

//	@Override
//	public String toString() {
//		return "Magazine [year=" + year + ", month=" + month + "]";
//	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(super.toString());
		sb.deleteCharAt(sb.toString().length()-1);
		sb.append(", year=");
		sb.append(this.year);
		sb.append(", month=").append(this.month);
		
		return sb.toString();
	}

}
