package TimeTable;

import Movie.Movie;

public class TimeTable {
	private Movie movie;
	private Screen screen;
//	private String time;
	private int time;
	
	
	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public TimeTable(Movie movie, Screen screen, int time) {
		this.movie = movie;
		this.screen = screen;
		this.time = time;
		
	}
	
	public void showTimeTable() {
		
		time = time%12;
		
		System.out.println("상영시간 : "+time+"시");
		System.out.println("영화제목 : "+movie.getTitle());
		System.out.println("상 영 관 : "+screen.getName());
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	boolean checkTimeTable(String movie) {
		return this.movie.equals(movie);
	}
	
	
}
