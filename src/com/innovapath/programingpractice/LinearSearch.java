/*
 * A program to perform a linear search on any given array.
 *
 */

//Author:Sreelekshmi
package com.innovapath.programingpractice;

public class LinearSearch {
	
	public static boolean linearSearch(int[] input, int value){
		boolean found=false;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]==value)
			{
				found=true;
			}
		}
		return found;
	}

}
