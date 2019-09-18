package sample;

public class Movie
{
	

String MovieTicket;

String MovieName;

public Movie(String MovieTicket,String MovieName)
{
	this.MovieTicket=MovieTicket;
	this.MovieName=MovieName;
}

public String getMovieTicket() 
{
	return MovieTicket;
}

public void setMovieTicket(String MovieTicket) {

	this.MovieTicket = MovieTicket;

}
public String getMovieName() 
{
	return MovieName;
}

public void setMovieName(String MovieName) 
{
	this.MovieName = MovieName;
}
}