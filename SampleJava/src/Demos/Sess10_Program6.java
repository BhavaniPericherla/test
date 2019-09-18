/*6.Write a program to Add 5 entries of type String into LinkedHashMap and then print all the
keys & values using for each and Iterator.*/

package sample;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.Set;
import java.util.Map.Entry;

public class Sess10_Program6 
{
public static void main(String[] args) 
{
	LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>();
    hm.put("A","Kumari");
    hm.put("G", "Bhavani");
    hm.put("B", "Ramu");
    hm.put("F", "Raju");
    hm.put("D", "Raju");
    
    //Type 1
   	System.out.println("Type1:To print all the keys using for each loop");
   	Collection<Entry<String, String>> set= hm.entrySet();
   	
   	for(Entry<String, String> s:set)
   	{
   		System.out.println(s);
   	}
  
   	//Type 2
   	System.out.println("Type2:To print all the keys by using Iterator Cursor");
   	Iterator<Entry<String, String>> itr=set.iterator();
   	while(itr.hasNext())
   	{
   		Map.Entry<String, String> ent= itr.next();
   		System.out.println(ent);
   	}
   	

}
}
