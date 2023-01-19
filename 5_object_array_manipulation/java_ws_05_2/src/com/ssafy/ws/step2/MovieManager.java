package com.ssafy.ws.step2;

import java.util.Arrays;

/**
 * 영화리스트를 배열로 관리하는 클래스
 * 
 * @author
 *
 */
public class MovieManager {

	private final int MAX_SIZE = 100; // final : 더이상 고칠 수 없는 상수
	
	private Movie[] movieList = new Movie[MAX_SIZE];
	
	private int size = 0; // 현재 영화의 수, 인덱스로 활용
	
	// singleton
	// 1. private으로 자기 자신의 인스턴스 만들기
	// 2. 생성자를 private으로 막기
	// 3. 유일한 인스턴스에 접근 가능한 getter 만들기
	
	private static MovieManager instance = new MovieManager();
	
	private MovieManager() {}
	
	public static MovieManager getInstance() {
		return instance;
	}
	
	public void add(Movie movie) {
		if (size < MAX_SIZE) {
			movieList[size] = movie;
			size++;
		} else {
			System.out.println("no more capacity");
		}
	}
	
	public Movie[] getList() {
		// 길이가 100인 배열을 반환하는 것이 아니라, 현재 영화개수만큼만 반환
		return Arrays.copyOfRange(this.movieList, 0, this.size);
	}
	
	public Movie searchByTitle(String title) {
		for (int i=0; i<size; i++) {
			if (movieList[i].getTitle().equals(title)) {
				return movieList[i];
			}
		}
		return null;
		
	}

}
