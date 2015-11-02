//Test for Parenthesis.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.Parenthesis;

public class ParenthesisTest {
	
	@Test(description="Testcase for balanced parenthesis")
	public void testParenthesisBalanced()
	{
		Assert.assertEquals(Parenthesis.isBalanced("(())"), true);
	}
	@Test(description="Testcase for not balanced parenthesis")
	public void testParenthesisNotBalanced()
	{
		Assert.assertEquals(Parenthesis.isBalanced("((})"), false);
	}
	@Test(description="Testcase for only opened balanced parenthesis")
	public void testParenthesisOpenBalanced()
	{
		Assert.assertEquals(Parenthesis.isBalanced("(("), false);
	}
	@Test(description="Testcase for only closed balanced parenthesis")
	public void testParenthesisClosedBalanced()
	{
		Assert.assertEquals(Parenthesis.isBalanced("}}"), false);
	}
	@Test(description="Testcase for only null parenthesis", expectedExceptions=NullPointerException.class)
	public void testParenthesnull()
	{
		Parenthesis.isBalanced(null);
	}
}
