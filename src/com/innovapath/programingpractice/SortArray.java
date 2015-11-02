/*
 *  A program to sort an array
 */
package com.innovapath.programingpractice;

public class SortArray {

	// Bubble sort
	public static int[] sortArray(int[] input) {
		int temp = 0;
		for (int i = 1; i <= input.length; i++) {
			for (int j = 0; j < input.length-1; j++) {
				if (input[j] > input[j + 1]) {
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
	
		return input;
	}

	
}
