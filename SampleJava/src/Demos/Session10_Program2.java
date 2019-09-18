/*2. Write a program to add all String objects from one HashSet to other HashSet without using 
addAll() and then print the objects of second HashSet in console.*/


package sample;
import java.util.HashSet;

public class Session10_Program2 
{

	public static void main(String[] args) 
	{
		
		HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        //System.out.println("First Hash set"+hs);
        HashSet<String> hs1 = new HashSet<String>(hs);
        System.out.println("Second Hash set"+hs1);
	}

}
