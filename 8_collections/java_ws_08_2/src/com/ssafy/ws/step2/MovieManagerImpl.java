package com.ssafy.ws.step2;

import java.util.ArrayList;
import java.util.List;

public class MovieManagerImpl implements IMovieManager {

	private List<Movie> movieList = new ArrayList<Movie>();

	// singleton
	private static IMovieManager instance = new MovieManagerImpl();
	private MovieManagerImpl() {}
	public static IMovieManager getInstance() {
		return instance;
	}
	
	@Override
	public void add(Movie m) {
		movieList.add(m);
	}
	
	@Override
	public Movie[] getList() {
		Movie[] rst = new Movie[movieList.size()];
		
		for (int i=0; i<movieList.size(); i++) {
			rst[i] = movieList.get(i);
		}
		return rst;
	}
	
	@Override
	public Movie[] getMovies() {
		List<Movie> tempList = new ArrayList<>();
		
		for (int i=0; i<movieList.size(); i++) {
			if (!(movieList.get(i) instanceof SeriesMovie)) {
				tempList.add(movieList.get(i));
			}
		}
		
		Movie[] result = new Movie[tempList.size()];
		
		for (int i=0; i<tempList.size(); i++) {
			result[i] = movieList.get(i);
			}
		
		return result;		 
	}
	
	@Override
	public SeriesMovie[] getSeriesMovies() {
		List<SeriesMovie> tempList = new ArrayList<>();
		
		for (Movie m : movieList) {
			if (m instanceof SeriesMovie)
				tempList.add((SeriesMovie) m);
		}
		
		SeriesMovie[] result = new SeriesMovie[tempList.size()];
		
		for (int i=0; i<tempList.size(); i++) {
			result[i] = tempList.get(i);
			}
		
		return result;		 
	}
	
	@Override
	public Movie[] searchByTitle(String title) {
		List<Movie> tempList = new ArrayList<>();
		
		for (Movie m : movieList) {
			if (m.getTitle().contains(title))
				tempList.add(m);
		}
		
		Movie[] rst = new Movie[tempList.size()];
		
		for (int i=0; i<tempList.size(); i++) {
			rst[i] = tempList.get(i);
		}
		return rst;
	}
	
	@Override
	public double getRunningTimeAvg() {
		double sum = 0;
		
		for (Movie m : movieList) {
			sum += m.getRunningTime();
		}
		return sum / movieList.size();}

	

}
