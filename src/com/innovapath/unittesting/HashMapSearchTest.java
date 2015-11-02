//Test for HashMapSearch.java
package com.innovapath.unittesting;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.HashMapSearch;

public class HashMapSearchTest {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	
	@Test(description="Test for a value",priority=1)
	public void testSearchVal()
	{
		
		hm.put(1,"A");
		hm.put(2, "B");
		Assert.assertEquals(new HashMapSearch(hm).searchValue(2),true);
		
	}
	
	@Test(description="Test for key not in hashmap")
	public void testSearchNoVal()
	{
		
		hm.put(1,"A");
		hm.put(2, "B");
		Assert.assertEquals(new HashMapSearch(hm).searchValue(4),false);
		
	}
}
