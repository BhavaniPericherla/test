/*10.Write programs to sort the user-defined class objects based on String value in descending order in 2 possible
ways using Comparator interface and print them in console.*/

package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Session10_Program10 
{
	public static void main(String[] args)
	{
		ArrayList<Emp> al = new ArrayList<Emp>();   
		al.add(new Emp(333,"AAA"));   
		al.add(new Emp(222,"QQQ"));   
		al.add(new Emp(111,"CCC"));   
		al.add(new Emp(444,"DDD"));      
		System.out.println("sorting by ename");   
		/*Type1:*/
		//Comparator c1 = Collections.reverseOrder(new EnameComp()); 
		//Collections.sort(al, c1); 
		//Type2:
		Collections.sort(al,new EnameComp()); 
		 Collections.reverse(al);
		 
		Iterator<Emp> itr1 = al.iterator(); 

		
		  while (itr1.hasNext())   
		  { 
			  Emp e = itr1.next();    
			  System.out.println(e.eid+"---"+e.ename);   
		   }	

	}
}

class EidComp implements Comparator   
{ 
	public int compare(Object o1,Object o2)  
	{  
		Emp e1 = (Emp)o1;    
		Emp e2 = (Emp)o2;    
		if (e1.eid==e2.eid)    
		{ 
			return 0; 
		}    
		else if (e1.eid>e2.eid)    
		{ 
			return 1; 
		}    
		else    
		{ 
			return -1; 
		}  
	 } 
} 


class EnameComp  implements Comparator  
{ 
	public int compare(Object o1,Object o2)  
	{ 
		Emp e1 = (Emp)o1;   
		Emp e2 = (Emp)o2;   
		return (e1.ename).compareTo(e2.ename);  
	} 
} 

class Emp 
{
	int eid;  
	String ename;  
	Emp(int eid,String ename)  
	{ 
	this.eid=eid;
	this.ename=ename;  
	} 
}
	

