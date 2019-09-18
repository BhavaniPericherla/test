/*8. Write a program for the following scenarios:
a. Sort the user-defined class objects based on int value in 
descending order using Comparable interface and print them in console.
b. Sort the user-defined class objects based on String value in descending order 
using Comparable interface and print them in console.
*/

package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Session10_Program8  
{
		public static void main(String[] args) 
		{
			ArrayList<Emp2> al = new ArrayList<Emp2>();   
			al.add(new Emp2(333,"AAA"));   
			al.add(new Emp2(555,"YYY")); 
			al.add(new Emp2(111,"CCC"));   
			Collections.sort(al);
			Comparator c1 = Collections.reverseOrder(); 
			Collections.sort(al, c1); 
			Iterator itr = al.iterator();   
			  while (itr.hasNext())   
			  { 
			  Emp2 e = (Emp2)itr.next();    
			  System.out.println(e.eid+"---"+e.ename);   
			  }  
		}
}

	class Emp2 implements Comparable
		{
			int eid;  
			String ename;  
			Emp2(int eid,String ename)  
			{ 
			this.eid=eid;
			this.ename=ename;  
			} 
			/*
			a. Sort the user-defined class objects based on int value in 
               descending order using Comparable interface and print them in console. */
		   @Override
			public int compareTo(Object o) 
			{
				Emp2 e= (Emp2) o;
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
			}
			
			
			/*b. Sort the user-defined class objects based on String value in ascending order using Comparable 
			interface and print them in console.*/
			/*@Override
			public int compareTo(Object o)  
			{ 
				Emp2 e= (Emp2) o;
				return  ename.compareTo(e.ename);  
			}*/
			
		}
