/*a program to check if a given number is prime or not.
 */

//Author: Sreelekshmi

package com.innovapath.programingpractice;

public class PrimeNumber {
	
	public static boolean isPrime(int num){
		
		if(num<=1)
			return false;
		for(int i=2;i<num;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	


}
