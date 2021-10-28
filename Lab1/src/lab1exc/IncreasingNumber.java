package lab1exc;
import java.util.*;

public class IncreasingNumber {


	

		


		boolean checkNumber(int number) 
		{
			String s = Integer.toString(number);
			char ch;
			int f = 0;
			for (int i = 0; i < s.length() - 1; i++) {
				ch = s.charAt(i);
				if (ch > s.charAt(i + 1))// If any digit is more than next digit
											// then we have to stop checking
				{
					f = 1;
					break;
				}
			}
			if (f == 1)
				return false;
			else
				return true;
		}
			void isInc(int number) {
				if (checkNumber(number) == true) {
				System.out.println("it is a increasing number");
				System.out.println(true);
				}
				
				else 
					System.out.println("it is a not increasing number");
					System.out.println(false);
					
				
					
					
		}

		
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			IncreasingNumber obj = new IncreasingNumber();
			System.out.print("Enter a number : ");
			int number =  sc.nextInt();
			obj.isInc(number);
		}
	}


