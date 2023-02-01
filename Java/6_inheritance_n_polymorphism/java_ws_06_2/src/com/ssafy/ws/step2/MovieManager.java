package com.ssafy.ws.step2;

import java.util.Arrays;

/**
 * 영화리스트를 배열로 관리하는 클래스
 * @author 
 *
 */
public class MovieManager {

	private final int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0;
	
	public void add(Movie movie) {
		if (size < MAX_SIZE) {
				movieList[size++] = movie;
		} else {
			System.out.println("no more capacity");
		}
	}
	
	public Movie searchByTitle(String title) {
		for (int i=0; i<this.size; i++) {
			if (movieList[i].getTitle().contains(title))
				return movieList[i];
		}
		return null;
	}
	
	public Movie[] getMovies() {
		return Arrays.copyOfRange(movieList, 0, this.size);
	}
	
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
	
	public int getRunningTimeAvg() {
		int sum = 0;
		
		for (int i=0; i<this.size; i++) {
			sum += movieList[i].getRunningTime();
		}
		return sum / this.size;
	}

}
