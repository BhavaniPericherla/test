/*7. Write a program for the following scenarios:
a. Sort the user-defined class objects based on int value in ascending order using Comparable 
interface and print them in console.
b. Sort the user-defined class objects based on String value in ascending order using Comparable 
interface and print them in console.*/

package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Session10_Program7 
{
public static void main(String[] args) 
{
	ArrayList<Emp1> al = new ArrayList<Emp1>();   
	al.add(new Emp1(333,"Bhavani"));   
	al.add(new Emp1(222,"Baby")); 
	al.add(new Emp1(111,"Shanvitha"));   
	Collections.sort(al);

	Iterator itr = al.iterator();   
	  while (itr.hasNext())   
	  { 
	  Emp1 e = (Emp1)itr.next();    
	  System.out.println(e.eid+"---"+e.ename);   
	  }  
}
}

class Emp1 implements Comparable
{
	int eid;  
	String ename;  
	Emp1(int eid,String ename)  
	{ 
	this.eid=eid;
	this.ename=ename;  
	} 
	
	/*a. Sort the user-defined class objects based on int value in ascending order using Comparable 
interface and print them in console. */
/*   @Override
	public int compareTo(Object o) 
	{
		Emp1 e= (Emp1) o;
		if(eid==e.eid)
		   {
			return 0;
		   }		
		else if(eid>e.eid)
			{ 
			return 1;
			}
		else if(eid<e.eid)
			{
			return -1;	
			}
		return eid;
	}*/
	
	
	/*b. Sort the user-defined class objects based on String value in ascending order using Comparable 
	interface and print them in console.*/
	@Override
	public int compareTo(Object o)  
	{ 
		Emp1 e= (Emp1) o;
		return  ename.compareTo(e.ename);  
	}
	
}