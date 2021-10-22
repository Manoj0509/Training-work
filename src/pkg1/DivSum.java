package pkg1;

import java.util.Scanner;

public class DivSum {
	// Java program to print all the numbers
	// divisible by 3 and 5 for a given number

		private static Scanner sc;

		int calculateSum(int N)
		{	
			// iterate from 0 to N
			for (int num = 0; num < N; num++)
			{	
				// Short-circuit operator is used
				if (num % 3 == 0 ||num%5==0)
					System.out.print(num + " ");
				 
	
				
				
				
			}
			return N;
		}
		
		// Driver code
		public static void main(String []args)
		{
			// input goes here
			int sum1=0;
		
			System.out.println("enter the value of n");
			sc = new Scanner(System.in);
			int N=sc.nextInt();
			
			// Calling function
			DivSum ob =new DivSum();
			ob.calculateSum(N);
			for (int num = 0; num < N; num++) {
				if (num % 3 == 0 ||num %5 == 0)
					sum1=num+sum1;
				
					
				
			}
			System.out.println(sum1);
				
				
				
				
					
		}
	}



