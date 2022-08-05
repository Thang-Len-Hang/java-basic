
public class Movie {
	
	private String title;
	private MovieType movieType;
	public Movie(String title, MovieType movieType) {
		super();
		this.title = title;
		this.movieType = movieType;
	}
	public String getTitle() {
		return title;
	}
	public MovieType getMovieType() {
		return movieType;
	}
	
}
