/*4. Write a program to add 5 string objects into Set reference and then print the objects in
 ascending order using 'cursors' & 'for each loop'.*/

package sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Session10_Program4 
{
public static void main(String[] args) 
{
	  Set<String> order = new HashSet<>();
	  order.add("AAA");
      order.add("CCC");
      order.add("FFF");
      order.add("BBB");
      order.add("RRR");
      order.add("KKK");
      order.add("DDD");
      System.out.println("Before Sorting : Random order\n");
      Iterator<String> strIterator = order.iterator();
      while(strIterator.hasNext())
      {
          System.out.println(strIterator.next());
      }
// Iterating using Iterator
      // convert to TreeSet
      TreeSet<String> ts = new TreeSet<String>(order);
      System.out.println("After Sorting using iterator:");
      Iterator<String> ascSorting = ts.iterator();
      while(ascSorting.hasNext()) 
      {
          System.out.println(ascSorting.next());
      }
//for each loop
      TreeSet<String> ts1 = new TreeSet<String>(order);
      System.out.println("After Sorting using for each loop:");
      for(String hs1: ts1) {
          System.out.println(hs1);
          }
  }
}