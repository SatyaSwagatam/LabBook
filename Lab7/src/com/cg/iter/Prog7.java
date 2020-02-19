//Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
package com.cg.iter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prog7 {

	public static void main(String[] args) {
		int arr[] = { 29, 7, 2, 86, 5, 9, 150, 71 };
		System.out.println("Array-");
		System.out.println(Arrays.toString(arr));
		ArrayList<Integer> list = getSorted(arr);
		System.out.println("Sorted array-");
		// print the sorted values ListS
		System.out.println(list);
	}

	private static ArrayList<Integer> getSorted(int[] arr) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			String s = (String.valueOf(arr[i]));
			String reverse = "";
			int length = s.length();
			for (int j = length - 1; j >= 0; j--) {
				reverse = reverse + s.charAt(j);

			}
			arr[i] = Integer.valueOf(reverse);
			list.add(arr[i]);
		}
		Collections.sort(list);
		return list;

	}

}