//Test for ConvertString.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.ConvertString;
public class ConvertStringTest {
	
	@Test(description="Testcase for positive input string")
	public void testConvertString()
	{
		Assert.assertEquals(ConvertString.convertString("This is nice"), "This1 is2 nice3");
	}
	@Test(description="Testcase for one string")
	public void testConvertOneString()
	{
		Assert.assertEquals(ConvertString.convertString("This"), "This1");
	}
	@Test(description="Testcase for numbered string")
	public void testConvertNumString()
	{
		Assert.assertEquals(ConvertString.convertString("This1 is nice2"), "This11 is2 nice23");
	}
	@Test(description="Testcase for null string", expectedExceptions=NullPointerException.class)
	public void testConvertNullString()
	{
		ConvertString.convertString(null);
	}
	@Test(description="Testcase for empty string")
	public void testConvertEmptyString()
	{
		Assert.assertEquals(ConvertString.convertString(" "),"");
	}
}
