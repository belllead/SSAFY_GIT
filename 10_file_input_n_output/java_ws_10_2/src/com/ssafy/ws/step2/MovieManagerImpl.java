package com.ssafy.ws.step2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 도서리스트를 컬렉션으로 유지하며 관리하는 클래스
 */
public class MovieManagerImpl implements IMovieManager {

	private List<Movie> movieList = new ArrayList<Movie>();

	// singleton
	private static IMovieManager instance = new MovieManagerImpl();
	private MovieManagerImpl() {
		loadData();
	}
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
	public Movie[] searchByTitle(String title) throws TitleNotFoundException {
		List<Movie> tempList = new ArrayList<>();
		
		for (Movie m : movieList) {
			if (m.getTitle().contains(title))
				tempList.add(m);
		}
		
		if (tempList.size() == 0) 
			throw new TitleNotFoundException(title);
		
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
	
	private void loadData() {
		File file = new File("movie.dat");
		if (file.exists()) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
				movieList = (List<Movie>) ois.readObject();
			} catch (Exception e) {
				System.out.println("파일 불러오기 실패");
				e.printStackTrace();
			}
		}
	}
	
	public void saveData() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie.dat"))) {
			oos.writeObject(movieList);
		} catch (Exception e) {
			System.out.println("파일 저장 실패");
			e.printStackTrace();
		}
	}

}
