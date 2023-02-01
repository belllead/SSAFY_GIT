package com.ssafy.ws.step2;

public class SeriesMovie extends Movie {

	private int seriesNum;
	private String episode;
	
	public SeriesMovie() {}

	public SeriesMovie(int id, String title, String director, String genre, int runningTime, int seriesNum, String episode) {
		super(id, title, director, genre, runningTime);
		this.seriesNum = seriesNum;
		this.episode = episode;
		// TODO Auto-generated constructor stub
	}

	public int getSeriesNum() {
		return seriesNum;
	}

	public void setSeriesNum(int seriesNum) {
		this.seriesNum = seriesNum;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}

	@Override
	public String toString() {
//		return "Series" + super.toString().replace(String.valueOf("]"), "") +  ", seriesNum=" + seriesNum + ", episode=" + episode + "]";
		return "Series" + super.toString().substring(0, super.toString().length()-1) +  ", seriesNum=" + seriesNum + ", episode=" + episode + "]";
	};
	
	
	
}
