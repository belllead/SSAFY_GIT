package com.ssafy.hw.step4;

public class Refrigerator extends Product {

	private String category;
	private int liter;
	private boolean freezer;
	private int year;
	
	public Refrigerator() {}

	public Refrigerator(String pCode, String pName, int price, int quantity, String brand, String desc, String category,
			int liter, boolean freezer, int year) {
		super(pCode, pName, price, quantity, brand, desc);
		this.category = category;
		this.liter = liter;
		this.freezer = freezer;
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	public boolean isFreezer() {
		return freezer;
	}

	public void setFreezer(boolean freezer) {
		this.freezer = freezer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.deleteCharAt(super.toString().length()-1);
		sb.append(", category=" + category);
		sb.append(", liter=" + liter);
		sb.append(", freezer=" + freezer);
		sb.append(", year=" + year + "]");
		
		return sb.toString();
	}
	
}
