/*10.Write a program to Add 5 entries of type String into Hashtable 
and then print all the keys & values using Iterator, Enumeration and for each.*/

package sample;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Sess10_Program10 
{
  public static void main(String[] args) 
  {
		Hashtable<String,String> hm1 = new Hashtable<String,String>();
	    hm1.put("S","Kumari");
	    hm1.put("P","Bhavani");
	    hm1.put("J","Ram5233u");
	    hm1.put("T","Raju");
	    hm1.put("R","Raju");
	    
	    
	   // Type1: print all the keys & values using Iterator
	    System.out.println("Type1: print all the keys & values using Iterator");
		Set<Entry<String, String>> set= hm1.entrySet();
	    Iterator<Entry<String, String>> itr=set.iterator();
	    while(itr.hasNext())
	    {
	    	Map.Entry<String, String> ent = itr.next();
	    	System.out.println(ent);
	    }
	    
	    
	    
	   // Type2: print all the keys & values using Enumeration
	    System.out.println("Type2: print all the keys & values using Enumeration");
	    Enumeration<String> keys = hm1.keys();
	    while(keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println(key+"="+hm1.get(key));
        }
	    
	   // Type3: print all the keys & values using for each
	    System.out.println("Type3: print all the keys & values using for each");
	    Set<Entry<String, String>> set1= hm1.entrySet();
	    for(Entry<String, String> e:set1)
	    {
	    	System.out.println(e);
	    }
  }


}
