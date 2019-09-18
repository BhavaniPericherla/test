/*5.	Write a program for the following scenarios:
a. Create a class (ex: Search) and define two instance methods
b. Create another class (ex: HashMapDemo) and add one entry of type String & Search (i.e., String key and Search object as value) 
and get the value based on key and then call the methods using returned object reference.
*/

package sample;

import java.util.HashMap;
import java.util.Iterator;
//import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Src1
{
	void inst1()
	{
		System.out.println("inst1 method");
	}
	void inst2()
	{
		System.out.println("inst2 method");
	}
}

public class Sess10_Program5 
{
 public static void main(String[] args) 
 {
	HashMap<String,Src1> h1 = new HashMap<String,Src1>();
	h1.put("Number1", new Src1());
	Set<Entry<String, Src1>> ent =h1.entrySet();
	
	Iterator<Entry<String, Src1>> itr = ent.iterator();
	  while(itr.hasNext())
	  {
		  Entry<String, Src1> e=itr.next();
		  System.out.println(e.getKey());
		  Src1 v = e.getValue();
		  v.inst1();
		  v.inst2();
	  }
	  
	
 }
}