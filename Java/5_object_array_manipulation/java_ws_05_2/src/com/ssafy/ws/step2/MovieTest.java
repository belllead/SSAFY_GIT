package com.ssafy.ws.step2;

public class MovieTest {

	public static void main(String[] args) {

		Movie m1 = new Movie(234, "Co Co Land", "Jongseo Park", "Musical", 112);
		Movie m2 = new Movie(12, "Savor Spring", "Gijeong Kim", "Comedy", 101);
		
		System.out.println(m1.getId());
		System.out.println(m2.getDirector());
		
		MovieManager mm = MovieManager.getInstance();
		mm.add(m1);
		System.out.println(mm.searchByTitle("Co Co Land"));
		
		mm.add(m2);
		System.out.println(mm.searchByTitle("Savor Spring"));
		
		for (Movie m : mm.getList()) {
			System.out.println(m.toString());
		}
	
	}
	
}
