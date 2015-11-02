/*
 *  A program to sort a map by value.
 */
package com.innovapath.programingpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



//converts the Map into a List, sorts the List by Comparator and put the sorted list back to a Map
public class SortMapByValue {
	
	public static Map<String, Integer> sortByComparator(Map<String, Integer> tosort) {

		// Convert Map to List
		List<Map.Entry<String, Integer>> list = 
			new LinkedList<Map.Entry<String, Integer>>(tosort.entrySet());

		// Sort list with comparator to compare Map values
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
                                           Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// Convert sorted map to a Map
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext();) {
			Map.Entry<String, Integer> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	
	
}
