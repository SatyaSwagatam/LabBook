//Create a method which accepts an array of integer elements and return the second smallest element in the array
package com.cg.iter;

import java.util.ArrayList;
import java.util.Collections;

public class Prog5 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int output = getSecondSmallest(arr);

		// print the sorted values List
		System.out.println("Second Smallest Element : " + output);
	}

	private static int getSecondSmallest(int[] arr) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		return list.get(1);

	}

}