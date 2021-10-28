

import java.io.InputStream;
import java.util.*;

public class Image {
// Function to reverse a string in Java using StringBuilder
	public static String revImg(String s) {
		return new StringBuilder(s).reverse().toString();
	}

public static void main(String[] args){
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	
String s= sc.next(); // Note that string is immutable in Java
s= revImg(s);
System.out.println("Reverse Image : "+s);
}

private static void Scanner(InputStream in) {
	// TODO Auto-generated method stub
	
}
}