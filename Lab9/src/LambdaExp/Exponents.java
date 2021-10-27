package LambdaExp;

import java.util.Scanner;

public class Exponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Exponent e = (x, y) -> { //lambdaexp
			int product = 1;
			for (int i = 1; i <= y; i++)
				product *= x;
			return product;
		};

		System.out.print("Enter the base number : ");
		int x = sc.nextInt();
		int y;
		do {
			System.out.print("Enter the power : ");
			y = sc.nextInt();
			if (y < 0) {
				System.out.println("Enter a positive number only");
			}
		} while (y < 0);

		System.out.printf("\nThe value is %d^%d = %d.", x, y, e.power(x, y));

	}

}