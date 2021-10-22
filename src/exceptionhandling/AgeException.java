package exceptionhandling;

	import java.util.Scanner;
	 
	class AgeException extends Exception {
	 
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	private static Scanner s;


	public AgeException(String str) {
	  System.out.println(str);
	 }
	
	 
	 public static void main(String[] args) {
	  s = new Scanner(System.in);
	  System.out.print("Enter ur age :: ");
	  int age = s.nextInt();
	  
	  try {
	   if(age < 15) 
	    throw new AgeException("Invalid age");
	   else
	    System.out.println("Valid age");
	  }
	  catch (AgeException a) {
	   System.out.println(a);
	  }
	 }
	}

