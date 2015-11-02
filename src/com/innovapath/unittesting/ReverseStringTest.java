//Test for ReverseString.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.ReverseString;

public class ReverseStringTest {

	
	@Test(description="Test case for reverse string")
	public void testReverseString()
	{
		Assert.assertEquals(ReverseString.reverseString("Unittesting"), "gnitsettinU");
	}
	
	@Test(description="Test case for reverse string with 1 char")
	public void testReverseStringoneChar()
	{
		Assert.assertEquals(ReverseString.reverseString("w"), "w");
	}
	
	@Test(description="Test case for reverse null string", expectedExceptions=NullPointerException.class)
	public void testReverseStringNull()
	{
		ReverseString.reverseString(null);
	}
	
	@Test(description="Test case for reverse empty string")
	public void testReverseStringEmpty()
	{
		Assert.assertEquals(ReverseString.reverseString(""), "");
	}
}
