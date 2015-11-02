package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.SortArray;

public class SortArrayTest {
	
	@Test(description="Testcase for sorting postive values")
	public void testSortArray()
	{
		Assert.assertEquals(SortArray.sortArray(new int[]{3,2,1,4,5}),new int[]{1,2,3,4,5});
	}
	@Test(description="Testcase for sorting negative values")
	public void testSortArrayNeg()
	{
		Assert.assertEquals(SortArray.sortArray(new int[]{-3,2,1,-4,5}),new int[]{-4,-3,1,2,5});
	}
	
	@Test(description="Testcase for sorting duplicate values")
	public void testSortArrayDup()
	{
		Assert.assertEquals(SortArray.sortArray(new int[]{4,4,5,2,1,6}),new int[]{1,2,4,4,5,6});
	}
	@Test(description="Testcase for sorting with one value")
	public void testSortArrayOneVal()
	{
		Assert.assertEquals(SortArray.sortArray(new int[]{9}),new int[]{9});
	}
}
