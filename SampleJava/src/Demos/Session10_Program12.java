/*12. Write programs to sort the user-defined class objects based on first String attribute in ascending order & second String 
attribute in descending order using Comparator
interface and print them in console.*/

package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Session10_Program12 
{
	public static void main(String[] args) {

		ArrayList<Movie> al=new ArrayList<Movie>();

		al.add(new Movie("Ticket001","KidsMovie"));

		al.add(new Movie("Ticket005","KidsCartoon"));

		al.add(new Movie("Ticket002","Cartoon"));

		al.add(new Movie("Ticket003","ABC"));

		al.add(new Movie("Ticket003","AAA"));
      
		//Collections.sort(al, new MovieName());
		Collections.sort(al, new MovieTicket());

		for(Movie b:al){

			System.out.println(b.getMovieTicket()+"---"+b.getMovieName());

		}
}
}



// This program includes Movie,MovieName, MovieTicket class internally