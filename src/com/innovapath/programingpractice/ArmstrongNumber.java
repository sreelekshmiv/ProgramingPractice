/*A program to check an armstrong number
 *  
 */

//Author: sreelekshmi
package com.innovapath.programingpractice;

public class ArmstrongNumber {
	
	//Return true if armstrong, false otherwise
	public static boolean isArmstrong(int num){
		
		int sum=0;
		int input=num;
		while(num!=0){
			int temp=num%10;
			sum=(int) (sum+Math.pow(temp, 3));
			num=num/10;
		}
		if(sum==input)
			return true;
		else
			return false;
	}

}

