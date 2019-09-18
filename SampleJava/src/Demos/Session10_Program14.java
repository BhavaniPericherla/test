/*14.Write programs to sort the user-defined class objects based on two String attributes in ascending order using 
comparing method of Comparator interface and print them in console.
(i.e., order by first String, second string asc).*/

package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Session10_Program14
{ 
    String Name; 
    int Age;  
    public Session10_Program14(String Name, Integer Age) 
    { 
        this.Name = Name; 
        this.Age = Age; 
    }   
    public String getName() 
    { 
        return Name; 
    } 
  
    public void setName(String Name) 
    { 
        this.Name = Name; 
    } 
  
    public Integer getAge() 
    { 
        return Age; 
    } 
  
    public void setAge(Integer Age) 
    { 
        this.Age = Age; 
    } 

    @Override
    public String toString() 
    { 
        return "Customer{" + "Name=" + Name + ", Age=" + Age + '}'; 
    } 
  
    
    
    
 static class CustomerSortingComparator implements Comparator<Session10_Program14> 
    { 
        @Override
        public int compare(Session10_Program14 customer1, Session10_Program14 customer2) 
        { 
  
            int NameCompare = customer1.getName().compareTo(customer2.getName()); 
            int AgeCompare = customer1.getAge().compareTo(customer2.getAge()); 
  
            // 2-level comparison using if-else block 
            if (NameCompare == 0) 
            { 
                return ((AgeCompare == 0) ? NameCompare : AgeCompare); 
            } else 
            { 
                return NameCompare; 
            } 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        List<Session10_Program14> al = new ArrayList<>(); 
        Session10_Program14 obj1 = new Session10_Program14("Ajay", 27); 
        Session10_Program14 obj2 = new Session10_Program14("Sneha", 23); 
        Session10_Program14 obj3 = new Session10_Program14("Simran", 37); 
        Session10_Program14 obj4 = new Session10_Program14("Ajay", 22); 
        Session10_Program14 obj5 = new Session10_Program14("Ajay", 29); 
        Session10_Program14 obj6 = new Session10_Program14("Sneha", 22); 
  
        // add customer objects to ArrayList 
        al.add(obj1); 
        al.add(obj2); 
        al.add(obj3); 
        al.add(obj4); 
        al.add(obj5); 
        al.add(obj6); 
  
        // before Sorting arraylist: iterate using Iterator 
        Iterator<Session10_Program14> custIterator = al.iterator(); 
  
        System.out.println("Before Sorting:\n"); 
        while (custIterator.hasNext()) { 
            System.out.println(custIterator.next()); 
        } 
  
        // sorting using Collections.sort(al, comparator); 
        Collections.sort(al, new CustomerSortingComparator()); 
  
        // after Sorting arraylist: iterate using enhanced for-loop 
        System.out.println("\n\nAfter Sorting:Assending order\n"); 
        for (Session10_Program14 customer : al) 
        { 
            System.out.println(customer); 
        } 
    } 
} 