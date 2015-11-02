/*
 * input series as a1,a2,a3....an,b1,b2,b3...bn and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
 */
package com.innovapath.programingpractice;

public class InputSeries {
	
public static String[] inputSeries(String[] arr, int len) throws NullPointerException{ 
		  int n = len/2;
		  for (int i = 1; i < n; i++) { // my step no.
		    for (int j = 0; j < i; j++) { // no. of swaps
		      swap(arr, n-i+2*j, n-i+2*j+1);
		    }
		  }
		  return arr;
		}

private static void swap(String[] arr, int i, int j) {
	String temp;
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp; 
	
}



}
