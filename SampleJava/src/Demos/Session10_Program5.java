/*5. Write a program to add 6 string objects into TreeSet and print first & last objects and 
then delete them from TreeSet and also, print all remaining objects of TreeSet using Iterator.*/

package sample;

import java.util.TreeSet;

public class Session10_Program5 
{
	public static void main(String[] args) {
		
	
	TreeSet<String> ts1 = new TreeSet<String>();
	ts1.add("F");
	ts1.add("E");
	ts1.add("A"); 
    ts1.add("B"); 
    ts1.add("C"); 
    ts1.add("D");
  
    System.out.println(ts1.first());
    System.out.println(ts1.last());
   
    ts1.remove("ts1.first()");
    ts1.remove("ts1.pollLast()");
    System.out.println("Values in Tree set after deleting first and last element\n"+ts1);
    
}
}
