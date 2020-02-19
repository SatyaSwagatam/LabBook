//Program to validate the age of a person and display proper message by using user defined exception,age of a person should be above 15.
package com.cg.iter;

import java.util.Scanner;

class AgeException extends Exception {

	public AgeException(String str) {
		System.out.println(str);
	}
}

public class Prog5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the age- ");
		int age = s.nextInt();

		try {
			if (age <= 15)
				throw new AgeException("Invalid age!Age should be above 15!");
			else
				System.out.println("Valid age");
		} catch (AgeException a) {
			System.out.println(a);
		}
	}
}