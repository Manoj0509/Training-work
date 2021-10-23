package exceptionhandling;

import java.util.Scanner;

public class Emplyoee {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			  System.out.print("Enter the salary :: ");
			  int sal = s.nextInt();
			  
			  try {
			   if(sal <30000) 
			    throw new EmplyoeeException("Salary must be greater than 30k");
			   else
			    System.out.println("Good salary");
			  }
			  catch (EmplyoeeException a) {
			   System.out.println(a);
			  }
			 }

}
