/*
 * Test for CountWordsFile.java
 */
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.CountWordsFile;

public class CountWordsFileTest {
	
	@Test(description="Counds words in File", enabled=true)
	public void testCoundWords()
	{
		Assert.assertEquals(CountWordsFile.countWords("src/count.txt"), 13);
	}
	
	@Test(description="Counds words  with one word in File", enabled=false)
	public void testCoundWordsOneWord()
	{
		Assert.assertEquals(CountWordsFile.countWords("src/count.txt"), 1);
	}
	
	@Test(description="Counds words  with no words in File", enabled=false)
	public void testCoundWordsNoWord()
	{
		Assert.assertEquals(CountWordsFile.countWords("src/count.txt"), 0);
	}

}
