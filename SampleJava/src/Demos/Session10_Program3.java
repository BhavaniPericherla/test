/*3. Write a program to add 6 string objects into HashSet reference and then print the objects using Iterator 
and Spliterator cursors in the same insertion order.*/

package sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class Session10_Program3 
{
public static void main(String[] args) 
{
	HashSet<String> hs = new HashSet<String>();
    //add elements to HashSet	
	 String p1 = new String("Person4");
     String p2 = new String("Person6");
     String p3 = new String("Person5");
     String p4 = new String("Person1");
     String p5 = new String("Person2");
     String p6 = new String("Person3");
     hs.add(p1);
     hs.add(p2);
     hs.add(p3);
     hs.add(p4);
     hs.add(p5);
     hs.add(p6);
// Using Iterator cursor
     
// Type1:Iterate over a HashSet using Java 8 forEach and lambda expression.
    /* System.out.println("=== Iterate over a HashSet using Java 8 forEach and lambda ===");
     programmingLanguages.forEach(programmingLanguage -> {
         System.out.println(programmingLanguage);
     });*/
     
// Type2:Iterate over a HashSet using iterator().
     System.out.println("*** Iterate over a HashSet using iterator() ***");
     Iterator<String> iths = hs.iterator();
     while (iths.hasNext()) {
         String programmingLanguage = iths.next();
         System.out.println(programmingLanguage);
     }
     
// Type 3:Iterate over a HashSet using iterator() and Java 8 forEachRemaining() method.
 /*    System.out.println("=== Iterate over a HashSet using iterator() and Java 8 forEachRemaining() method ===");
     iths = hs.iterator();
     iths.forEachRemaining(hs -> {
         System.out.println(hs);
     });*/
     
//Type 4 : Iterate over a HashSet using simple for-each loop.
/*     System.out.println("=== Iterate over a HashSet using simple for-each loop ===");
     for(String hs1: hs) {
         System.out.println(hs1);
         }*/
     
// using Spliterator
     Spliterator<String> sphs = hs.spliterator(); 
     // forEachRemaining method of Spliterator 
     sphs.forEachRemaining((n) -> System.out.println(n)); 
     
     }
}

