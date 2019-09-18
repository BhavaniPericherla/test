package sample;

import java.util.Comparator;

public class MovieTicket implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o2.getMovieTicket().compareTo(o1.getMovieTicket());
	}

}
