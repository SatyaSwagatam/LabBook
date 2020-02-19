//Program that can accept an array of String objects and sort in alphabetical order. 
//The elements in the left half should be completely in upper-case and the elements in the right half should be completely in lower case. 
//Return the resulting array.
package com.cg.iter;

import java.util.Arrays;
import java.util.Scanner;

public class Prog2 {
	public static String[] Sorting(String[] a, int total) {
		String c[] = new String[total];
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int y = total / 2;
		if (total % 2 == 0) {

			for (int i = 0; i < y; i++) {
				c[i] = a[i].toUpperCase();
			}
			for (int i = y; i < total; i++) {
				c[i] = a[i].toLowerCase();
			}
		} else {
			for (int i = 0; i < (y) + 1; i++) {
				c[i] = a[i].toUpperCase();
			}
			for (int i = (y) + 1; i < total; i++) {
				c[i] = a[i].toLowerCase();
			}
		}
		return c;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array-");
		int n = sc.nextInt();
		String b[] = new String[n];
		System.out.println("Enter string-");
		for (int i = 0; i < n; i++) {
			b[i] = sc.next();
		}
		System.out.println(Arrays.toString(Sorting(b, n)));
	}
}