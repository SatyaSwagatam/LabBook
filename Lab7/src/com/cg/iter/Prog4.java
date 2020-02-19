//Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal
package com.cg.iter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Prog4 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		hMap.put(1641, 92);
		hMap.put(1741, 85);
		hMap.put(1841, 76);
		hMap.put(1941, 50);
		System.out.println(getStudents(hMap));
	}

	private static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hMap) {
		int marks;
		HashMap<Integer, String> output = new HashMap<Integer, String>();
		Set set = hMap.entrySet(); // Get a set of the entries
		Iterator i = set.iterator(); // Get an iterator
		while (i.hasNext()) { // Display elements
			Map.Entry me = (Map.Entry) i.next();
			marks = (int) me.getValue();
			if (marks >= 90)
				output.put((Integer) me.getKey(), "Gold");
			else if (marks >= 80)
				output.put((Integer) me.getKey(), "Silver");
			else if (marks >= 70)
				output.put((Integer) me.getKey(), "Bronze");
			else
				output.put((Integer) me.getKey(), "No Medal");
		}
		return output;
	}

}
