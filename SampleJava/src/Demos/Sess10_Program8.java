/*8.	Write a program for the following scenarios:
a. Add 5 entries of type String into TreeMap and delete the entry if the specified key is present in the TreeMap
b. delete the entry if the specified value is present in the TreeMap*/

package sample;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Sess10_Program8 
{
public static void main(String[] args) 
{
	TreeMap<String,String> hm = new TreeMap<String,String>();
    hm.put("A","Rama");
    hm.put("G", "Sita");
    hm.put("B", "Lakshmana");
    hm.put("F", "Baratha");
    hm.put("D", "Satrugna");
    System.out.println("Type1");
   hm.remove("A");
    Collection<Entry<String,String>> set = hm.entrySet();
    for(Entry<String,String> ent :set)
    {
    	System.out.println(ent);
    }
    
    
    System.out.println("\nType2");
    if(hm.containsValue("Lakshmana"))
    {
		System.out.println("Specified value is present.");

		hm.remove("B");
	}
    for(Entry<String,String> ent :set)
    {
    	System.out.println(ent);
    }
}
}
