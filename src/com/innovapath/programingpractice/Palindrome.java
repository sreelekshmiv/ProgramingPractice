/*
 * A program to check for a palindrome string.
 */
package com.innovapath.programingpractice;

public class Palindrome {

	public static boolean isPalindrome(String str) throws NullPointerException {
		if (str.length() == 0 || str.length() == 1)
			return true;
		
		
		if (str.charAt(0) == str.charAt(str.length() - 1))
			return isPalindrome(str.substring(1, str.length() - 1));

		return false;
	}

}
