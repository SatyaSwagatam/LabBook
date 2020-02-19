//Program to find the sum of the cubes of the digits of an n digit number
package com.cg.iter;

import java.util.Scanner;

class Prog1 {

	/* Returns the sum of series */
	public static int sumOfSeries(int n) {
		int sum = 0;
		for (int x = 1; x <= n; x++)
			sum += x * x * x;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number-");
		int n = sc.nextInt();
		System.out.println("Sum of the cubes of the digits of the given number is-");
		System.out.println(sumOfSeries(n));

	}
}
