//Test for ArrayListToArray.java
package com.innovapath.unittesting;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.ArrayListToArray;

public class ArrayListToArrayTest {
	
	@Test(description="Testcase for arraylist to array")
	public void testArrayListtoArray()
	{
		List<String> a=new ArrayList<String>();
		a.add("hi");
		a.add("hello");
		
		Assert.assertEquals(ArrayListToArray.listToArray(a), new String[]{"hi","hello"});
	}
	@Test(description="Testcase for arraylist to array",expectedExceptions=NullPointerException.class)
	public void testArrayListtoArrayException()
	{
		List<String> a=new ArrayList<String>();
		a.add("hi");
		a.add("hello");
		
		ArrayListToArray.listToArray(null);
	}
	

}
