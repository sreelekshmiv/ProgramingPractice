/*
A program to find the largest number in a given array.
 */
package com.innovapath.programingpractice;

public class LargestNumber {
	
	public static int findLargest(int[] input)
	{
		int max=input[0];
		for(int i=1;i<input.length;i++){
			if(input[i]>max){
				max=input[i];
			}
		}
		return max;
	}

}
