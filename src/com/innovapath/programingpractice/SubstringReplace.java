/*
 *  A program to find a substring in a given string and then replace it with another string.
 */


package com.innovapath.programingpractice;

public class SubstringReplace {

	
	public static String substringReplace(String str, String subStr, String newStr) throws NullPointerException {
		
		if(str.contains(subStr))
				{
		return str.replace(subStr, newStr);
				}
		else
			return "Substring not found";
	}
}
