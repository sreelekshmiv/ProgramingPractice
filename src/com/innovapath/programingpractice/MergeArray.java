/*
 * A program to merge 2 arrays.
 */

//Author:Sreelekshmi
package com.innovapath.programingpractice;

public class MergeArray {

	public static int[] mergeArray(int[] input1, int[] input2) {

		// Used SortArray method to sort array
		input1 = SortArray.sortArray(input1);
		input2 = SortArray.sortArray(input2);

		int[] result = new int[input1.length + input2.length];
		int i = 0, j = 0, k = 0;

		while (i < input1.length && j < input2.length) {

			if(input1[i]<input2[j])
			{
				result[k++]=input1[i++];
			}
			else
				result[k++]=input2[j++];
		}
		
		while(i<input1.length){
			result[k++]=input1[i++];
		}
		while(j<input2.length){
			result[k++]=input2[j++];
		}
		return result;
	}

	
	}
