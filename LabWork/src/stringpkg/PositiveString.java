package stringpkg;

import java.util.Scanner;

public class PositiveString {
	// Java implementation of above approach
	

	// Function that checks whether
	// the string is in alphabetical
	// order or not
		static boolean isAlphabaticOrder(String s) {
			int n = s.length();

			for (int i = 1; i < n; i++) {

				// if element at index 'i' is less
				// than the element at index 'i-1'
				// then the string is not sorted
				if (s.charAt(i) < s.charAt(i - 1)) {
					return false;
				}
			}

			return true;
		}

	// Driver code
		static public void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a string");
			String s= sc.nextLine();   
			// check whether the string is
			// in alphabetical order or not
			if (isAlphabaticOrder(s)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
	//This code is contributed by PrinciRaj1992



