//Program that prompts the user for an integer and then prints out all the prime numbers up to that Integer
package com.cg.iter;

import java.util.Scanner;

class Prog3 {
	public static void main(String[] args) {
		int n;
		int p;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = s.nextInt();
		System.out.println("Prime numbers upto " + n + " are-");
		for (int i = 2; i < n; i++) {
			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					p = 1;
			}
			if (p == 0)

				System.out.println(i);
		}
	}
}