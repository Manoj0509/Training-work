package pkg1;

import java.util.Scanner;

public class Difference {
private static Scanner sc;
public static int calculateDifference(int n){
		      //sum of squares of n natural numbers
		      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
		      //sum of n natural numbers
		      int sumN = (n * (n + 1)) / 2;
		      //square of sum of n natural numbers
		      int squareSumN = sumN * sumN;
		      //difference
		      return Math.abs(sumSquareN - squareSumN);
		   }
		   public static void main(String args[]){
			   System.out.println("enter the value of n");
				sc = new Scanner(System.in);
				int n=sc.nextInt();
		      System.out.println("Number: " + n);
		      System.out.println("Difference: " + calculateDifference(n));
		   }
		}

//n = 3
//Squares of first three numbers= 3x3 + 2x2 + 1x1= 9 + 4 + 1= 14

//Squares of sum of first three numbers
//(3 + 2 + 1)x(3 + 2 + 1)
//6x6
//36

//Difference
//= 36 - 14
//= 22
