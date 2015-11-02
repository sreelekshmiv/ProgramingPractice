//Test for SortMapByValue.java
package com.innovapath.unittesting;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.SortMapByValue;

public class SortMaByValueTest {
	
	@Test
	public void testSortMap()
	{
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("z", 10);
		hm.put("b", 5);
		hm.put("a", 6);
		hm.put("c", 20);
		hm.put("d", 1);
		
		Map<String, Integer> sMap = SortMapByValue.sortByComparator(hm);
		
		Map<String, Integer> hmexp = new HashMap<String, Integer>();
		hmexp.put("d", 1);
		hmexp.put("b", 5);
		hmexp.put("a", 6);
		hmexp.put("z", 10);
		hmexp.put("c", 20);
		
		Assert.assertEquals(sMap, hmexp);
	}

}
