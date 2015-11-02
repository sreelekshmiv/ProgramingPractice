//Test for LocateSwap.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.LocateSwap;

public class LocateSwapTest {

	@Test(description="Testcase for locate and swap two elements in array")
	public void testLocateSwap()
	{
		Assert.assertEquals(LocateSwap.locateAndSwap(new int[]{1,2,5,6,4}), new int[]{1,2,4,6,5});
	}
	
	@Test(description="Testcase for locate and swap two elements in array with all sorted")
	public void testLocateSortedSwap()
	{
		Assert.assertEquals(LocateSwap.locateAndSwap(new int[]{1,2,3,4}), new int[]{1,2,3,4});
	}
	
	@Test(description="Testcase for locate and swap two elements in array with negative values")
	public void testLocateNegSwap()
	{
		Assert.assertEquals(LocateSwap.locateAndSwap(new int[]{-2,0,-1,1,2}), new int[]{-2,-1,0,1,2});
	}
	
	@Test(description="Testcase for locate and swap two elements in array with duplicate values")
	public void testLocateDupSwap()
	{
		Assert.assertEquals(LocateSwap.locateAndSwap(new int[]{1,2,3,5,2}), new int[]{1,2,2,5,3});
	}
}
