/*
 * program to find the common number in any given two arrays.
 */

//Author: Sreelekshmi

package com.innovapath.programingpractice;

import java.util.ArrayList;


public class CommonNumber {

	// Used an ArrayList for storing the common numbers, other inbuilt functions
	// are not included in this method, even arraylist contains() method
	public static ArrayList<Integer> findCommon(int[] arr1, int[] arr2) {
		ArrayList<Integer> hmCommon = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					if (hmCommon.isEmpty()) {
						hmCommon.add(arr1[i]);
					} else // used an implementation to find whether the number
							// already found as common, didn't use arraylist
							// contains method
					{
						boolean contain = false;
						for (Integer k : hmCommon) {
							if (arr1[i] == k) {
								contain = true;
							}
						}
						if (!contain) {
							hmCommon.add(arr1[i]);
						}
					}
				}
			}
		}
		return hmCommon;
	}

	

}
