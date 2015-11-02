//Test for DuplicateSet.java
package com.innovapath.unittesting;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.DuplicatesSet;

public class DuplicateSetTest {

	Set<Integer> s=new HashSet<Integer>();
	@Test(description="Testcase with duplicates",priority=1)
	public void testDuplicateSet()
	{
		s.add(2);
		s.add(4);
		s.add(5);
		Assert.assertEquals(DuplicatesSet.removeDuplicates(new int[]{2,4,4,5}), s);
		s.clear();
	}
	@Test(description="Testcase with duplicates",priority=2)
	public void testNoDuplicateSet()
	{
		s.add(2);
		s.add(4);
		s.add(5);
		Assert.assertEquals(DuplicatesSet.removeDuplicates(new int[]{2,4,5}), s);
		s.clear();
	}
	@Test(description="Testcase with only  duplicates",priority=3)
	public void testOnlyDuplicateSet()
	{
		s.add(2);
		s.add(2);
		
		Assert.assertEquals(DuplicatesSet.removeDuplicates(new int[]{2,2}), s);
		
	}
}
