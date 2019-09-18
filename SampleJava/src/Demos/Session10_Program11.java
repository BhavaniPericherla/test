/*11. Write programs to sort the user-defined class objects based on two String attributes in ascending order 
using Comparator interface and print them in console.
(i.e., order by first String, second string asc).*/


package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Session10_Program11 
{
	public static void main(String[] args) {

		ArrayList<StudentDetails> 
		al=new ArrayList<StudentDetails>();

		al.add(new StudentDetails("CAA","P","ABC@gmail.com"));
		al.add(new StudentDetails("CAA","T","AAA@gmail.com"));
		al.add(new StudentDetails("VVV","Raj","DDD@gmail.com"));
		al.add(new StudentDetails("RRR","Sai","YYY@gmail.com"));
		al.add(new StudentDetails("KKK","P","CCC@gmail.com"));
		//To sort mulitple objects based on FirstName, Email
        Collections.sort(al,Comparator.comparing(StudentDetails::getFirstName).thenComparing(StudentDetails::getEmail));
		for(StudentDetails a:al){
			System.out.println(a.firstName+"--"+a.lastName+"--"+a.email);
		}

	}


}


/*class StudentDetails {

	String firstName,lastName,email;

	public StudentDetails(String firstName, String lastName, String email)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;

	}

	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	

}*/