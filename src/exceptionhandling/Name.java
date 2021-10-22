package exceptionhandling;

import java.util.Scanner;

public class Name {
	private static final long serialVersionUID = 1L;
	private static Scanner s;

	public static void main(String args[])
	{
	s = new Scanner(System.in);
	System.out.println("Enter the first Name ");
	String fname=s.next();
	//System.out.println("Enter the Last Name ");
	//String Lname=s.next();
	try
	{
	if(fname.isEmpty() ) //Lname.isEmpty())
	
		 throw new InvalidNameException("Invalid NAME");
	   else
	    System.out.println("VALID NAME");
	  }
	  catch (InvalidNameException a) {
	   System.out.println(a);
	  }
	}
}
	


