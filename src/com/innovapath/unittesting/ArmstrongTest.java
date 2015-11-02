
//Test for Armstrong number
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.ArmstrongNumber;

public class ArmstrongTest {
	
	@Test(description="Test case for an armstrong number")
	public void testPosArmstrong()
	{
		Assert.assertEquals(ArmstrongNumber.isArmstrong(153), true);
	}
	
	@Test(description="Test case for not an armstrong number")
	public void testNotArmstrong()
	{
		Assert.assertEquals(ArmstrongNumber.isArmstrong(135), false);
	}
	
	@Test(description="Test case for an armstrong number as zero")
	public void testZeroArmstrong()
	{
		Assert.assertEquals(ArmstrongNumber.isArmstrong(0), true);
	}
	
	@Test(description="Test case for an armstrong number as one")
	public void testOneArmstrong()
	{
		Assert.assertEquals(ArmstrongNumber.isArmstrong(1), true);
	}
	
	@Test(description="Test case for an armstrong number as negative input")
	public void testNegArmstrong()
	{
		Assert.assertEquals(ArmstrongNumber.isArmstrong(-153), true);
	}

}
