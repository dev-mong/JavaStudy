package ver01;

public class Movie {
	private String title;
	private String director;
	private int runtime;
	
	Movie (String title, String director, int runtime){
		this.title = title;
		this.director = director;
		this.runtime = runtime;
				
	}
	
	void showMovieInfo() {
		System.out.println("영화 제목 : "+ this.title);
		System.out.println("영화 감독 : "+ this.director);
		System.out.println("런  타  임 : "+ this.runtime);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
}