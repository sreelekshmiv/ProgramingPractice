//Test for InputSeries
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.InputSeries;

public class InputSeriesTest {

	@Test(description = "Test case to test input series")
	public void testInputSeries() {
		String[] exp = { "a1", "b1", "a2", "b2", "a3", "b3", "a4", "b4" };
		Assert.assertEquals(
				InputSeries.inputSeries(new String[] { "a1", "a2", "a3", "a4",
						"b1", "b2", "b3", "b4" }, 8), exp);

	}
	@Test(description = "Test case to test one input series")
	public void testOneInputSeries() {
		String[] exp = { "a1", "b1"};
		Assert.assertEquals(
				InputSeries.inputSeries(new String[] { "a1","b1" }, 2), exp);

	}

}
