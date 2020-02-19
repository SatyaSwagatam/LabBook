//Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order
package com.cg.iter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prog8 {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8 };
		int arr2[] = modifyArray(arr);
		System.out.println("Array-");
		System.out.println(Arrays.toString(arr));
		System.out.println("After removing duplicate elements-");
		// print the sorted values List
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
			System.out.print(" ");
		}
	}

	private static int[] modifyArray(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> mySet = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			mySet.add(arr[i]);
		}
		int i = 0;
		int arr2[] = new int[mySet.size()];
		Iterator<Integer> iter = mySet.iterator();
		while (iter.hasNext()) {

			arr2[i] = (int) iter.next();

			i = i + 1;
		}
		return arr2;
	}

}