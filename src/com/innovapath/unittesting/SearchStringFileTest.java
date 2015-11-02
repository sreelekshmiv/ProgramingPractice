//Test for SearchStringile.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.SearchStringFile;

public class SearchStringFileTest {
	
	@Test(description="Test case for number of occurance")
	public void testSearchString(){
		Assert.assertEquals(SearchStringFile.searchString("src/count.txt", "fun"), 3);
	}
	
	@Test(description="Test case for one occurance")
	public void testSearchStringOne(){
		Assert.assertEquals(SearchStringFile.searchString("src/count.txt", "to"), 1);
	}
	@Test(description="Test case for no occurance")
	public void testSearchStringNo(){
		Assert.assertEquals(SearchStringFile.searchString("src/count.txt", "hey"), 0);
	}

}
