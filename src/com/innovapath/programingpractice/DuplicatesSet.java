/*
 *A  program to find duplicates in an array using set.
 */
package com.innovapath.programingpractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesSet {

	//Remove duplicates and return set
	public static Set<Integer> removeDuplicates(int[] num)
	{
		Set<Integer> s=new HashSet<Integer>();
		for(int i:num)
		{
			s.add(i);
		}
		
		return s;
		
	}
	
}
