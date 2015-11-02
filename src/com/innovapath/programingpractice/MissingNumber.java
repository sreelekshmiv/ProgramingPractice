/*
 *  A program to find the missing number in a series of sorted numbers stored in an array.
 */
package com.innovapath.programingpractice;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	public static List<Integer> findMissingNumber(int[] ar) {
	
		List<Integer> missArray=new ArrayList<Integer>();
		
		int j = 0;
		for (int i = 1; i <= ar[ar.length - 1]; i++) {
			if (j < ar.length && i == ar[j])
				j++;
			else {
				// Missing numbers
				//System.out.print(i + " ");
				missArray.add(i);
			}
		}
		return missArray;
		
	}

	
	public static void main(String args[])
	{
		System.out.println(MissingNumber.findMissingNumber(new int[]{1,2,3}));
	}
}
