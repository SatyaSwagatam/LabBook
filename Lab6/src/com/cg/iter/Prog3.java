//Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .
package com.cg.iter;

import java.util.*;

public class Prog3 {
// Function to reverse a string in Java using StringBuilder
	public static String getImage(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string-");
		s = sc.nextLine();
		String temp = s;
		s = getImage(s);
		String s2 = temp + '|' + s;
		System.out.println("Output : " + s2);
	}
}