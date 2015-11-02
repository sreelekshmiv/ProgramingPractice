/*A program that print fibonacci series of N elements
 This program contains two methods that find fibonacci series in two different ways
 i) Without using recurssion
ii) Using recurssion*/

//Author: Sreelekshmi

package com.innovapath.programingpractice;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	// Without recurrsion
	public static List<Integer> fiboNorecurrsion(int n) {

		List<Integer> fiboList = new ArrayList<Integer>();

		int previous = 0;
		int current = 1;

		// if n is negative or zero , returns 0
		if (n <= 0)
			fiboList.add(0);

		else {
			// loops through until reaches n number of elements
			for (int i = 0; i < n; i++) {
				fiboList.add(previous);
				int sum = previous;
				previous = current;
				current = sum + previous;
			}

		}
		return fiboList;
	}
	
	
	//With Recurrsion
	public static int fiboRecurssion(int n)
	{
		if(n<=0)		
			return 0;
		if(n==1)
			return 1;
		else
			return fiboRecurssion(n-1)+fiboRecurssion(n-2);
	}
	

	public static void main(String args[]){
		
System.out.println(Fibonacci.fiboRecurssion(-2));
	}
}
