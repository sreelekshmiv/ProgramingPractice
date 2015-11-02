/*
 *  To search for a key in the created map and then returns its value
 */
package com.innovapath.programingpractice;

import java.util.HashMap;

public class HashMapSearch {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();

	public HashMapSearch(HashMap hm) {
		this.hm = hm;
	}

	public void addvalues(int key, String value) {
		hm.put(key, value);
	}

	public boolean searchValue(int key) {
		if (hm.containsKey(key))
			return true;
		else
			return false;
	}

	public String getValueHash(int key) {
		if (searchValue(key)) {
			return hm.get(key);
		} else
			return "";
	}
	
	
}
