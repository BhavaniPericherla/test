/*13. Write programs to sort the user-defined class objects based on String value in ascending & descending order using comparing 
method of Comparator interface and print them in console.*/

package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Session10_Program13
{ 
    String Name; 
    int Age;  
    public Session10_Program13(String Name) 
    { 
        this.Name = Name;  
    }   
    public String getName() 
    { 
        return Name; 
    } 
  
    public void setName(String Name) 
    { 
        this.Name = Name; 
    } 
  
    @Override
    public String toString() 
    { 
        return "Name=" + Name; 
    } 
 
 static class CustomerSortingComparator implements Comparator<Session10_Program13> 
    { 
        @Override
        public int compare(Session10_Program13 customer1, Session10_Program13 customer2) 
        { 
  
            int NameCompare = customer1.getName().compareTo(customer2.getName());
			return NameCompare; 

        } 
    } 
  
    public static void main(String[] args) 
    { 
        List<Session10_Program13> al = new ArrayList<>(); 
        Session10_Program13 obj1 = new Session10_Program13("Ajay"); 
        Session10_Program13 obj2 = new Session10_Program13("Sneha"); 
        Session10_Program13 obj3 = new Session10_Program13("Simran"); 
        Session10_Program13 obj4 = new Session10_Program13("ram"); 
        Session10_Program13 obj5 = new Session10_Program13("happy"); 
        Session10_Program13 obj6 = new Session10_Program13("smile"); 
  
        // add customer objects to ArrayList 
        al.add(obj1); 
        al.add(obj2); 
        al.add(obj3); 
        al.add(obj4); 
        al.add(obj5); 
        al.add(obj6); 
  
        // before Sorting arraylist: iterate using Iterator 
        Iterator<Session10_Program13> custIterator = al.iterator(); 
  
        System.out.println("Before Sorting:\n"); 
        while (custIterator.hasNext()) { 
            System.out.println(custIterator.next()); 
        } 
  
        // sorting using Collections.sort(al, comparator); 
        Collections.sort(al, new CustomerSortingComparator()); 
  
        // after Sorting arraylist: iterate using enhanced for-loop 
        System.out.println("\n\nAfter Sorting:Assending order\n"); 
        for (Session10_Program13 customer : al) 
        { 
            System.out.println(customer); 
        } 
        Comparator c1 = Collections.reverseOrder(new CustomerSortingComparator()); 
		Collections.sort(al, c1);     
		System.out.println("\n\nAfter Sorting:Decending order\n"); 
        for (Session10_Program13 customer : al) 
        { 
            System.out.println(customer); 
        } 
		
    } 
} 