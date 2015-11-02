//Test for Factorial.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.Factorial;

public class FactorialTest {
	
	@Test(description="Postive testcase factorial of positive number")
	public void testFactPosNoRecur()
	{
		Assert.assertEquals(Factorial.factNoRecur(6),720);
	}
	
	@Test(description="Testcase factorial of negative number")
	public void testFactNegNoRecur()
	{
		Assert.assertEquals(Factorial.factNoRecur(-5),1);
	}
	
	@Test(description="Testcase factorial of zero number")
	public void testFactZeroNoRecur()
	{
		Assert.assertEquals(Factorial.factNoRecur(0),1);
	}
	
	@Test(description="Testcase factorial of one number")
	public void testFactOneNoRecur()
	{
		Assert.assertEquals(Factorial.factNoRecur(1),1);
	}
	

	@Test(description="Postive testcase factorial of positive number")
	public void testFactPosRecur()
	{
		Assert.assertEquals(Factorial.factRecur(6),720);
	}
	@Test(description="Testcase factorial of negative number")
	public void testFactNegRecur()
	{
		Assert.assertEquals(Factorial.factRecur(-5),1);
	}
	
	@Test(description="Testcase factorial of zero number")
	public void testFactZeroRecur()
	{
		Assert.assertEquals(Factorial.factRecur(0),1);
	}
	
	@Test(description="Testcase factorial of one number")
	public void testFactOneRecur()
	{
		Assert.assertEquals(Factorial.factRecur(1),1);
	}
}
