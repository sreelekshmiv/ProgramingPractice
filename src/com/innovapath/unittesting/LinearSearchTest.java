package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.LinearSearch;


// Test for LinearSearch.java 

public class LinearSearchTest {
	
	@Test(description="Testcase for linear search")
	public void testLinearSearch()
	{
		
		Assert.assertEquals(LinearSearch.linearSearch(new int[]{3,6,9,12},9),true);
	}
	
	@Test(description="Testcase for linear search not in array")
	public void testLinearSearchNoVal()
	{
		
		Assert.assertEquals(LinearSearch.linearSearch(new int[]{3,6,9,12},4),false);
	}
	
	@Test(description="Testcase for linear search with duplicate value")
	public void testLinearSearchDup()
	{
		
		Assert.assertEquals(LinearSearch.linearSearch(new int[]{3,9,9,12},9),true);
	}
	
	@Test(description="Testcase for linear search with zero value")
	public void testLinearSearchZero()
	{
		
		Assert.assertEquals(LinearSearch.linearSearch(new int[]{3,9,0,12},0),true);
	}
	
	@Test(description="Testcase for linear search with one value")
	public void testLinearSearchOne()
	{
		
		Assert.assertEquals(LinearSearch.linearSearch(new int[]{3},3),true);
	}

}
