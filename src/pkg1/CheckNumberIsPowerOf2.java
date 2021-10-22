package pkg1;

import java.util.Scanner;

public class CheckNumberIsPowerOf2 {
	 
	 
	 private static boolean powerOf2(int number){
	  if(number<=0){
	   return false;
	  }
	   
	  while(number > 1){
	   if(number % 2 != 0){
	    return false;
	   }
	   number = number / 2;
	  }
	  return true;
	 }
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 CheckNumberIsPowerOf2 obj = new CheckNumberIsPowerOf2();
			System.out.print("Enter a number : ");
			int number =  sc.nextInt();
			obj.powerOf2(number);
	  
	 
	 }
}
