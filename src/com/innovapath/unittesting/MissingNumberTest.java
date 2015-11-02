//Test for MissingNumber.java
package com.innovapath.unittesting;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.MissingNumber;

public class MissingNumberTest {
	List<Integer> expList;
	
	@BeforeClass
	public void init()
	{
		expList=new ArrayList<Integer>();
	}
	
	@Test(description="Testcase for one missing value", priority=1)
	public void testMissingOneNum()
	{
		expList.add(4);		
		Assert.assertEquals(MissingNumber.findMissingNumber(new int[]{1,2,3,5}),expList);
		expList.clear();
	}
	
	@Test(description="Testcase for more than one missing value", priority=2)
	public void testMissingMoreNum()
	{
		expList.add(4);	
		expList.add(5);
		expList.add(7);
		Assert.assertEquals(MissingNumber.findMissingNumber(new int[]{1,2,3,6,8}),expList);
		expList.clear();
	}
	
	@Test(description="Testcase for missing  zero value", priority=3)
	public void testMissingNoNum()
	{
		Assert.assertEquals(MissingNumber.findMissingNumber(new int[]{1,2,3}),expList);
	}
	

}
