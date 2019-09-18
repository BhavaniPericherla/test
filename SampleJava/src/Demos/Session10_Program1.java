/*1. Write a program to add 5 string objects into HashSet 
and then print the objects using Iterator and Spliterator cursors.*/

package sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class Session10_Program1 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Day5");
		hs.add("Day4");
		hs.add("Day3");
		hs.add("Day1");
		hs.add("Day2");
		// using Iterator 
		
		Iterator<String> itr =hs.iterator();
		System.out.println("Print the string using iterator()");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		// using Spliterator
		System.out.println("Print the string using apiterator()");
		Spliterator<String> spitr = hs.spliterator();
		spitr.forEachRemaining(System.out::println);
	
		//spitr.forEachRemaining( (n) -> System.out.println("Student Name: " + n));
		
	}

}