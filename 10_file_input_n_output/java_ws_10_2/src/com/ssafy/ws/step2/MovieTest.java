package com.ssafy.ws.step2;

public class MovieTest {

	public static void main(String[] args) {

//		Movie mv1 = new Movie(0, "Co Co Land", "Jongseo Park", "Musical", 132);
//		Movie mv2 = new Movie(1, "Savage", "Aespa", "Thriller", 101);
//		SeriesMovie smv1 = new SeriesMovie(2, "Matrix", "WB", "SF", 113, 1, "Cyon");
//		SeriesMovie smv2 = new SeriesMovie(3, "Matrix2", "WB", "SF", 122, 2, "Cyon");
//		
//		System.out.println("1: " + mv1.getTitle());
//		System.out.println("2: " + mv2.getGenre());
//		
//		IMovieManager mm = MovieManagerImpl.getInstance();
//		
//		mm.add(mv1);
//		mm.add(mv2);
//		mm.add(smv1);
//		mm.add(smv2);
//		
//		mm.saveData();
		
		IMovieManager mm = MovieManagerImpl.getInstance();
		
		for (Movie m : mm.getMovies())
			System.out.println("3: " + m);
		for (Movie m : mm.getSeriesMovies())
			System.out.println("4: " + m);
		
		try {
			System.out.println("5: " + mm.searchByTitle("Coco Co Land"));
		} catch (TitleNotFoundException e) {
			e.printStackTrace();
			System.out.println("exception handling");
		}
		
		
		System.out.println("6: " + mm.getRunningTimeAvg());
		
			
	
	}
}
