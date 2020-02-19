//Program check if a number is an increasing number
package com.cg.iter;

import java.util.Scanner;

public class Prog3 {
	public static boolean checkNumber(int input) {
		// Deal with negative inputs...
		if (input < 0)
			input = -input;

		int lastSeen = 10; // always greater than any digit
		int current;

		while (input > 0) {
			current = input % 10;
			if (lastSeen < current)
				return false;
			lastSeen = current;
			input /= 10;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number-");
		int input = sc.nextInt();
		System.out.println("Increasing number = " + checkNumber(input));
	}

}