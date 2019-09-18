/*6. Write a program to add first 10 integers in HashSet using for loop and Delete all the
integers except even numbers from the HashSet and then print the HashSet having even numbers 
in console.*/

package sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Session10_Program6 
{
	public static void main(String[] args) 
	{
		int[] a = { 1, 2, 3, 4, 9, 0, 5, 7, 6, 8};
	    Set<Integer> set = new HashSet<>();
	    for (int value : a) 
	    {
	        set.add(value);
	    }
	    System.out.println("Even Numbers");
	    for (Iterator<Integer> it = set.iterator(); it.hasNext();) 
	    {
	        Integer element = it.next();
	        if (element % 2 == 0) 
	        {
	        	it.next();
	            it.remove();
	        }
	    }
	       System.out.println(set);
	}
}
