//Test for ListOperations
package com.innovapath.unittesting;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.ListOperations;

public class ListOperationsTest {
ListOperations ls=new ListOperations();
	@Test(description="Testcase to add elements ",priority=1)
	public void testAddElements()
	{
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(2);
		ar.add(4);
		ar.add(6);
		
		Assert.assertEquals(ls.addElements(new int[]{2,4,6}),ar);
	}
	@Test(description="Testcase to search elements ",priority=2)
	public void testSearch()
	{

		Assert.assertTrue(ls.searchElement(4));
	}
	@Test(description="Testcase to search element not in list ",priority=3)
	public void testSearchNot()
	{

		Assert.assertFalse(ls.searchElement(5));
	}
}
