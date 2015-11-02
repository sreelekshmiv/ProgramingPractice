/*
 * A program to reverse a string
 */
package com.innovapath.programingpractice;

public class ReverseString {
	
	public static String reverseString(String str) throws NullPointerException
	{
		char[] ch=new char[str.length()];
		int j=0;
		for(int i=str.length()-1;i>=0;i--){
			ch[j++]=str.charAt(i);
		}
		return String.valueOf(ch);
	}
}
