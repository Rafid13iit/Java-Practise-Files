package Main;

public class Movie {
	String title, studio, rating;
	
	public Movie (String title, String studio, String rating){
	
		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}
		
	public Movie (String title, String studio){
	
		this.title = title;
		this.studio = studio;
		this.rating = "PG";
	}
	
	
}