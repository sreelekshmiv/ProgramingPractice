//Test for Palindrome.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.Palindrome;

public class PalindromeTest {

	@Test(description = "Testcase for palindrome ")
	public void testPalindrome() {
		Assert.assertEquals(Palindrome.isPalindrome("malayalam"), true);
	}

	@Test(description = "Testcase for not a palindrome ")
	public void testPalindromeNot() {
		Assert.assertEquals(Palindrome.isPalindrome("hello"), false);
	}

	@Test(description = "Testcase for null input ", expectedExceptions = NullPointerException.class)
	public void testPalindromeNull() {
		Palindrome.isPalindrome(null);
	}

	@Test(description = "Testcase for empty input ")
	public void testPalindromeEmpty() {
		Assert.assertEquals(Palindrome.isPalindrome(""), true);
	}

	@Test(description = "Testcase for single character input ")
	public void testPalindromeSingleChar() {
		Assert.assertEquals(Palindrome.isPalindrome("d"), true);
	}
}
