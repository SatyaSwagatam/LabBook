//Program that uses both recursive and non-recursive functions to print the nth value of the fibonacci sequence
package com.cg.iter;

import java.util.Scanner;

class Prog2 {
	public static void main(String args[]) {
		System.out.println("Enter the number n to print the fibonacci series -");
		Scanner ob = new Scanner(System.in);
		short a = ob.nextShort();
		Series ob1 = new Series();
		long b = ob1.input(a);
		System.out.println("The " + a + "th number of the fibonacci series is " + b);
	}
}

class Series {

	int a = 1;
	int b = 1;
	int c = 0;
	int count;

	int input(int a) {
		count = a;
		count = fabo(count);
		return count;
	}

	int fabo(int count) {
		if (count != 2) {
			c = a + b;
			a = b;
			b = c;
			fabo(--count);
		}
		return c;
	}
}