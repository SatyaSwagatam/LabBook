// Program which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
package com.cg.iter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Prog3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array-");
		int n = sc.nextInt();
		Integer intArray[] = new Integer[n];
		System.out.println("Enter " + n + " elements-");
		for (int i = 0; i < n; i++) {
			intArray[i] = sc.nextInt();
		}

		String strArray[] = new String[n];

		for (int i = 0; i < n; i++)
			strArray[i] = String.valueOf(intArray[i]);

		System.out.println("Original array: " + Arrays.toString(strArray));

		System.out.println("Sorted Array: " + getSorted(strArray));
	}

	private static List<String> getSorted(String[] strArray) {
		List<String> list = Arrays.asList(strArray);
		Collections.reverse(list);
		System.out.println("Reverse Array: " + list);
		Collections.sort(list);
		return list;
	}
}