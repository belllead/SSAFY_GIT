package com.ssafy.ws.step2;

import java.util.Arrays;

/**
 * 도서리스트를 배열로 유지하며 관리하는 클래스
 */
public class MovieManagerImpl implements IMovieManager {

	private final int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0;

	// singleton
	private static IMovieManager instance = new MovieManagerImpl();
	private MovieManagerImpl() {}
	public static IMovieManager getInstance() {
		return instance;
	}
	
	
	
	@Override
	public void add(Movie movie) {
		if (size < MAX_SIZE) {
				movieList[size++] = movie;
		} else {
			System.out.println("no more capacity");
		}
	}
	
	
	@Override
	public Movie[] searchByTitle(String title) {
		int cnt = 0;
		for (int i=0; i<this.size; i++) {
			if (movieList[i].getTitle().contains(title))
				cnt++;
		}
		
		Movie[] rst = new Movie[cnt];
		
		for (int i=0, idx=0; i<this.size; i++) {
			if (movieList[i].getTitle().contains(title))
				rst[idx++] = movieList[i];
		}
		return rst;
	}
	
	@Override
	public Movie[] getMovies() {
		return Arrays.copyOfRange(movieList, 0, this.size);
	}
	
	@Override
	public SeriesMovie[] getSeriesMovies() {
		int cnt = 0;
		
		for (int i=0; i<this.size; i++) {
			if (movieList[i] instanceof SeriesMovie) {
				cnt++;
			}
		}
		
		SeriesMovie[] result = new SeriesMovie[cnt];
		int idx = 0;

		for (int i=0; i<this.size; i++) {
			if (movieList[i] instanceof SeriesMovie) {
				result[idx++] = (SeriesMovie) movieList[i];
			}
		}
		return result;		 
	}
	
	@Override
	public double getRunningTimeAvg() {
		double sum = 0;
		
		for (int i=0; i<this.size; i++) {
			sum += movieList[i].getRunningTime();
		}
		return sum / this.size;}

	@Override
	public Movie[] getList() {
		return Arrays.copyOfRange(movieList, 0, this.size);
	}
	
}
