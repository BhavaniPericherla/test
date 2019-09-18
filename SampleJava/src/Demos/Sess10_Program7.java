/*7.Write a program to Add 5 entries of type String into TreeMap and then print all the keys & values using Iterator 
and for each.*/

package sample;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Sess10_Program7 
{
public static void main(String[] args) {
	TreeMap<String,String> hm = new TreeMap<String,String>();
    hm.put("A","Rama");
    hm.put("G", "Sita");
    hm.put("B", "Lakshmana");
    hm.put("F", "Baratha");
    hm.put("D", "Satrugna");
    
    //Type1
    System.out.println("Type1:To print all the keys using for each loop");
    Collection<Entry<String,String>> set = hm.entrySet();
    for(Entry<String,String> ent :set)
    {
    	System.out.println(ent);
    }
    
    //Type2
    System.out.println("\nType2:To print all the keys by using Iterator Cursor");
    Iterator<Entry<String,String>> itr= set.iterator();
    while(itr.hasNext())
    {
    	Map.Entry<String, String> ent =itr.next();
    	System.out.println(ent);
    }
}
}
