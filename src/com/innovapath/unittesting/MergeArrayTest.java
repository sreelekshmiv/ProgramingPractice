//Test for MergeArray.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.MergeArray;

public class MergeArrayTest {

	
	@Test(description="Testcase for merging two unsorted array")
	public void testMergeUnSortArray()
	{
		Assert.assertEquals(MergeArray.mergeArray(new int[]{3,1,7,5},new int[]{4,2,8,6}), new int[]{1,2,3,4,5,6,7,8});
	}
	
	@Test(description="Testcase for merging two sorted array")
	public void testMergeSortArray()
	{
		Assert.assertEquals(MergeArray.mergeArray(new int[]{1,3,5,7},new int[]{2,4,6,8}), new int[]{1,2,3,4,5,6,7,8});
	}
	
	@Test(description="Testcase for merging two sorted array in diff length")
	public void testMergeDiffLenArray()
	{
		Assert.assertEquals(MergeArray.mergeArray(new int[]{1,3,5},new int[]{2,4,6,8}), new int[]{1,2,3,4,5,6,8});
	}
	@Test(description="Testcase for merging one empty array")
	public void testMergeEmptyArray()
	{
		Assert.assertEquals(MergeArray.mergeArray(new int[]{},new int[]{4,2,8,6}), new int[]{2,4,6,8});
	}
	@Test(description="Testcase for merging two sorted array with duplicate values")
	public void testMergeDupArray()
	{
		Assert.assertEquals(MergeArray.mergeArray(new int[]{1,3,3,5},new int[]{2,4,6,5}), new int[]{1,2,3,3,4,5,5,6});
	}
}
