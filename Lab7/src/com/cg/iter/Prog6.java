//Create a method which accepts the id and the age of people as a Map and decide if they are eligible for vote
package com.cg.iter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Prog6 {

	public static void main(String[] args) {

		Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		hMap.put(1263, 38);
		hMap.put(2163, 15);
		hMap.put(2263, 50);
		hMap.put(3163, 8);
		System.out.println("Eligible List : " + votersList(hMap));
	}

	private static List<Integer> votersList(Map<Integer, Integer> hMap) {
		int ages;
		List<Integer> eligible = new ArrayList<Integer>();
		Set set = hMap.entrySet(); // Get a set of the entries
		Iterator i = set.iterator(); // Get an iterator
		while (i.hasNext()) { // Display elements
			Map.Entry me = (Map.Entry) i.next();
			ages = (int) me.getValue();
			if (ages > 18) {
				eligible.add((Integer) me.getKey());

			}
		}
		return eligible;
	}

}
