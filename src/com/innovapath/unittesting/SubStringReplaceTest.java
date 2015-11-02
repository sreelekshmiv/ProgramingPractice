//Test for SubStringReplace.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.SubstringReplace;

public class SubStringReplaceTest {
	
	@Test(description="Test case for finding and replace substring in input string")
	public void testSubstringReplace()
	{
		Assert.assertEquals(SubstringReplace.substringReplace("java", "ava", "dbc"), "jdbc");
	}
	@Test(description="Test case for finding and replace substring not in input string")
	public void testNoSubstringReplace()
	{
		Assert.assertEquals(SubstringReplace.substringReplace("java", "help", "dbc"), "Substring not found");
	}
	
	@Test(description="Test case for Exception",expectedExceptions=NullPointerException.class)
	public void testExpSubstringReplace()
	{
		Assert.assertEquals(SubstringReplace.substringReplace(null,null,null), null);
	}

}
