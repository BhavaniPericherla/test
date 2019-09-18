/*3.Write a program to add all objects from one HashMap to other HashMap using 2 possible ways and then print all the keys & values 
of second HashMap in console using Iterator.*/

package sample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.Map;

public class Sess10_Program3
{
	public static void main(String[] args) {
		HashMap<String,String> hm1 = new HashMap<String,String>();
	    hm1.put("S","Kumari");
	    hm1.put("P","Bhavani");
	    hm1.put("J","Ramu");
	    hm1.put("T","Raju");
	    hm1.put("R","Raju");
	    hm1.put("V","Vidhya");
	    hm1.put("K","Krishna");
	   
	    //Type1 : Using putAll Method
	   HashMap<String,String> hm2 = new HashMap<String,String>();
	    hm2.putAll(hm1);
	    Collection<Entry<String, String>> set= hm2.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();

		while(itr.hasNext())
		{
			Entry<String, String> ent= itr.next();

			System.out.println(ent);
		}
		
		
		/*
		//Type2 : Using putIfAbsent method
		HashMap<String,String> hm3 = new HashMap<String,String>();
	    hm1.forEach(hm3::putIfAbsent);
	   
	    Set<Entry<String,String>> entries=hm3.entrySet();
		for(Entry<String,String> entry:entries)
		System.out.println(entry);*/
	
	}
	
}