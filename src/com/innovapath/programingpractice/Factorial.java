/*
 * A program to calculate factorial of a given number. 
 * factorial with one logic that uses recursion and another logic without recursion.
 */
package com.innovapath.programingpractice;

public class Factorial {
	
	
	//Without Recurssion
	public static int factNoRecur(int num)
	{
		if(num<=1)
			return 1;
		int fact=1;
		while(num!=1){
			fact=fact*num;
			num--;
		}
		return fact;		
	}
	
	//With Recurssion
	public static int factRecur(int num){
		if(num<=1)
			return 1;
		else
			return num*factRecur(num-1);
	}

}
