//Test for PrintPattern.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.PrintPattern;

public class PrintPatternTest {

	
	@Test(description="Testcase for print pattern positive value")
	public void testprintPattern()
	{
		Assert.assertEquals(PrintPattern.printPattern(3), 3);
	}
	
	@Test(description="Testcase for print pattern zero value", enabled=false)
	public void testprintzeroPattern()
	{
		Assert.assertEquals(PrintPattern.printPattern(0), 0);
	}
	@Test(description="Testcase for print pattern one value", enabled=false)
	public void testprintonePattern()
	{
		Assert.assertEquals(PrintPattern.printPattern(1), 1);
	}
	@Test(description="Testcase for print pattern one value", enabled=false)
	public void testprintnegPattern()
	{
		Assert.assertEquals(PrintPattern.printPattern(-6), 0);
	}
}
