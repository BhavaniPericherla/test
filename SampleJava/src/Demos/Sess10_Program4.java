/*4. Write a program for the following scenarios:
a. Create a class (ex: Search) and define two instance variables of type int & String respectively and 
initialize the values using constructor
b. Create another class (ex: HashMapDemo) and add two entries of type String & Search (i.e., String key and Search object as value) 
and print all the keys & values of HashMap using Iterator and for each. */

package sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Search
{
	 int a;
	 String S1;
	 public Search(int a,String S1)
	  {
		  this.a=a;
		  this.S1=S1;
	  }
}


public class Sess10_Program4 
{
  public static void main(String[] args) 
  {
	  HashMap<String,Search> h1= new HashMap<String,Search>();
	  h1.put("SerialNo1", new Search(1,"Bhavani"));
	  h1.put("SerialNo2", new Search(2,"Manasa"));
	  Set<Entry<String,Search>> ent=h1.entrySet();
	  
	  //Type1: print all the keys & values of HashMap using Iterator
	  System.out.println("Type1: print all the keys & values of HashMap using Iterator");
	  Iterator<Entry<String, Search>> itr = ent.iterator();
	  while(itr.hasNext())
	  {
		  Map.Entry<String, Search> e=itr.next();
		  
		  System.out.println(e.getKey());
		  Search d = e.getValue();
		  System.out.println(d.a+"   "+d.S1);
	  }
	  
	  
	  //Type2: print all the keys & values of HashMap using for each.
	  System.out.println("Type2: Print all the keys & values of HashMap using for each.");
	  for(Map.Entry<String, Search> m:ent)
	  {
		  System.out.println(m.getKey());
		  System.out.println(m.getValue().a+"    "+m.getValue().S1);
	  }
  }
}
