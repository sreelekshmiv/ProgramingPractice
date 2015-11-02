/*
 * A program to locate and swap only 2 elements which are not sorted in a given sorted array. 
 * For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per sorted order.
 */

//Author:Sreelekshmi
package com.innovapath.programingpractice;

public class LocateSwap {
	
	
	public static int[] locateAndSwap(int[] arr)
	{
		//index to store the element to swap
		int index1=0;
		int index2=0;
		
		for(int i=0;i<arr.length;i++){       
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j])
				{
					index1=i;
					index2=j;
					i=arr.length;
					j=arr.length;
					break;
				}
				
			}
		}
		
	
		//Swap two elements that are unsorted
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
		return arr;
	}
	
	

}
