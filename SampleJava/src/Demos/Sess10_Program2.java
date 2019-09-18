package sample;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*2.Write a program to Add 7 entries of type String into HashMap and then print all the values in 3 possible ways.*/

public class Sess10_Program2 
{
	public static void main(String[] args) 
	{
		HashMap<String,String> hm = new HashMap<String,String>();
	    hm.put("S","Kumari");
	    hm.put("P", "Bhavani");
	    hm.put("J", "Ramu");
	    hm.put("T", "Raju");
	    hm.put("R", "Raju");
	    hm.put("V", "Vidhya");
	    hm.put("K", "Krishna");

		// Type 1:
		System.out.println("Type1: To get all the values in Java 8");
		 hm.values().stream().forEach((value)->System.out.println(value));
		 
		// Type 2:
	    System.out.println("Type2: To get all the values using Collection and for each loop");
		Collection<String> c1=hm.values();
		for(String str:c1)
		System.out.println(str);
		
		//Type 3:
		System.out.println("Type3:To print all the keys by using Iterator Cursor");
		Collection<String> set= hm.values();
		Iterator<String> itr=set.iterator();

		while(itr.hasNext())
		{
			String ent= itr.next();

			System.out.println(ent);
		}
		
	   /*System.out.println("To get all the values and keys using Collection and for each loop");
		Set<Entry<String,String>> entries=hm.entrySet();
		for(Entry<String,String> entry:entries)
		System.out.println(entry);*/
	
	
	}
}
