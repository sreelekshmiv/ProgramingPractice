//Test for CmdLineInput.java

package com.innovapath.unittesting;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.CmdLineInput;

public class CmdLineInputTest {
	
	@Test(description="Testcase with command line values as 2 and 1")
	public void testCmdLineInput()
	{
		Scanner scan=new Scanner(System.in);
		Assert.assertEquals(CmdLineInput.printCmdLineAdd(scan), 3);
	}

	@Test(description="Testcase for Exception, invalid input", expectedExceptions=InputMismatchException.class, enabled=false)
	public void testCmdLineInvalidInput()
	{
		Scanner scan=new Scanner(System.in);
		CmdLineInput.printCmdLineAdd(scan);
	}
	
	@Test(description="Testcase with command line values as 0 and 1", enabled=false)
	public void testCmdLineZeroInput()
	{
		Scanner scan=new Scanner(System.in);
		Assert.assertEquals(CmdLineInput.printCmdLineAdd(scan), 1);
	}
	
	@Test(description="Testcase with command line values as -2 and -7", enabled=false)
	public void testCmdLineNegInput()
	{
		Scanner scan=new Scanner(System.in);
		Assert.assertEquals(CmdLineInput.printCmdLineAdd(scan), -9);
	}
	
	
}
