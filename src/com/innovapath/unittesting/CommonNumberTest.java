package com.innovapath.unittesting;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.CommonNumber;

public class CommonNumberTest {

	ArrayList<Integer> aListmiss;
	@BeforeClass
	public void init()
	{
		aListmiss=new ArrayList<Integer>();
	}
	@Test(description="Test case common one common number", priority=1)
	public void testCommonTestOne()
	{
		aListmiss.add(2);
		Assert.assertEquals(CommonNumber.findCommon(new int[]{1,2,3},new int[]{2,4,5}),aListmiss);
		aListmiss.clear();
	}
	
	@Test(description="Test case common more than one common number", priority=2)
	public void testCommonTestMoreOne()
	{
		aListmiss.add(1);
		aListmiss.add(2);	
		aListmiss.add(3);
		Assert.assertEquals(CommonNumber.findCommon(new int[]{1,2,3},new int[]{1,2,3,5}),aListmiss);
		aListmiss.clear();
	}
	@Test(description="Test case common no common number", priority=3)
	public void testCommonTestNo()
	{

		Assert.assertEquals(CommonNumber.findCommon(new int[]{1,2,3},new int[]{4,5,6}),aListmiss);
	}
}
