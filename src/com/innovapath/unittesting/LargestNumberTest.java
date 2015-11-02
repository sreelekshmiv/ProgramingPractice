//Test for LargestNumber.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.LargestNumber;

public class LargestNumberTest {
	
	@Test(description="Test to find max from positive integer values")
	public void testLargePosNumber()
	{
		Assert.assertEquals(LargestNumber.findLargest(new int[]{3,2,1,8,9}),9);
	}
	
	@Test(description="Test to find max from positive and negative integer values")
	public void testLargePosNegNumber()
	{
		Assert.assertEquals(LargestNumber.findLargest(new int[]{-3,2,1,-5,7}),7);
	}

	@Test(description="Test to find max from  negative integer values")
	public void testLargeNegNumber()
	{
		Assert.assertEquals(LargestNumber.findLargest(new int[]{-4,-8,-1,-6}),-1);
	}
	
	@Test(description="Test to find max from one integer value")
	public void testLargeOneNumber()
	{
		Assert.assertEquals(LargestNumber.findLargest(new int[]{5}),5);
	}
	@Test(description="Test to find max from zero values")
	public void testLargeZeroNumber()
	{
		Assert.assertEquals(LargestNumber.findLargest(new int[]{0}),0);
	}
	@Test(description="Test to find max from positive and one zero integer values")
	public void testLargePosZeroNumber()
	{
		Assert.assertEquals(LargestNumber.findLargest(new int[]{3,2,1,0,14}),14);
	}
	@Test(description="Test to find max from  negative  and zero integer values")
	public void testLargeNegZeroNumber()
	{
		Assert.assertEquals(LargestNumber.findLargest(new int[]{-3,-2,0,-8,-16}),0);
	}
	@Test(description="Test to find max from  duplicate integer values")
	public void testLargeDupNumber()
	{
		Assert.assertEquals(LargestNumber.findLargest(new int[]{3,5,5,6,6,2}),6);
	}
	
}
