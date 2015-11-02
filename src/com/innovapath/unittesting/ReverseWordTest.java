//Test for Reverseword.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.ReverseWord;

public class ReverseWordTest {

	@Test(description="Testcase to reverse words in a sentence")
	public void testreverseWord()
	{
		Assert.assertEquals(ReverseWord.reverseWord("This is an example"), "sihT si na elpmaxe");
	}
	
	@Test(description="Testcase to reverse one words in a sentence")
	public void testreverseOneWord()
	{
		Assert.assertEquals(ReverseWord.reverseWord("This"), "sihT");
	}
	
	@Test(description="Testcase to null input", expectedExceptions=NullPointerException.class)
	public void testreverseWordNull()
	{
		ReverseWord.reverseWord(null);
	}
	
	@Test(description="Testcase to Empty input")
	public void testreverseWordEmpty()
	{
		Assert.assertEquals(ReverseWord.reverseWord(""), "");
	}
}
