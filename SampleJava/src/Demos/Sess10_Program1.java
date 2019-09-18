/*1.	Write a program to Add 7 entries of type String into HashMap and then print all the keys in 3 possible ways.*/
package sample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sess10_Program1 
{
	public static void main(String[] args) {
	
	HashMap<String,String> hm = new HashMap<String,String>();
    hm.put("S","Kumari");
    hm.put("P","Bhavani");
    hm.put("J","Ramu");
    hm.put("T","Raju");
    hm.put("R","Raju");
    hm.put("V","Vidhya");
    hm.put("K","Krishna");
    
    //Type 1
	System.out.println("Type1:To print all the keys using for each loop");
	Set<String> st = hm.keySet();
	for(String s:st)
	{
		System.out.println(s);
	}
	//Type 2
	System.out.println("Type2:To print all the keys by using Java 8");
	hm.keySet().stream().forEach((value)->System.out.println(value)); 
	
	//Type 3
	System.out.println("Type3:To print all the keys by using Iterator Cursor");
	Set<Entry<String, String>> set= hm.entrySet();

	Iterator<Entry<String, String>> itr=set.iterator();

	while(itr.hasNext()){

		Map.Entry<String, String> ent= itr.next();

		System.out.println(ent.getKey());

	}
	
	
	}
}
