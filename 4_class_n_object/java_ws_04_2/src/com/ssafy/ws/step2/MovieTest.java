package com.ssafy.ws.step2;

public class MovieTest {

	public static void main(String[] args) {

		Movie mv1 = new Movie();
		mv1.id = 54;
		mv1.title = "Coding Rock School";
		mv1.director = "Gregory Paulman";
		mv1.genre = "Comedy";
		mv1.runningTime = 111;
		
		Movie mv2 = new Movie(12, "Co Co Land", "Jongseo Park", "Musical/Romance", 120);

		System.out.println("ID : " + mv1.id);
		System.out.println("Title : " + mv1.title);
		System.out.println("Director : " + mv1.director);
		System.out.println("Genre : " + mv1.genre);
		System.out.println("Running Time : " + mv1.runningTime);
		System.out.println("-------------------------------");
		System.out.println("ID : " + mv2.id);
		System.out.println("Title : " + mv2.title);
		System.out.println("Director : " + mv2.director);
		System.out.println("Genre : " + mv2.genre);
		System.out.println("Running Time : " + mv2.runningTime);
	
	}

}
