//Test for Fibonacci.java

//Author: Sreelekshmi

package com.innovapath.unittesting;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




import com.innovapath.programingpractice.Fibonacci;

public class FibonacciTest {
	
	List<Integer> fibExpected;
	@BeforeClass
	public void init()
	{
		fibExpected=new ArrayList<Integer>();
	}
	
	@Test(description="Positive testcase with n as positive, n=5",priority=1)
	public void testFiboNorecurPositive()
	{
		
		fibExpected.add(0);
		fibExpected.add(1);
		fibExpected.add(1);
		fibExpected.add(2);
		fibExpected.add(3);
		
		Assert.assertEquals(Fibonacci.fiboNorecurrsion(5), fibExpected);
		Assert.assertEquals(Fibonacci.fiboNorecurrsion(5).size(), 5);
		Assert.assertTrue(Fibonacci.fiboNorecurrsion(5).contains(3));
		Assert.assertFalse(Fibonacci.fiboNorecurrsion(5).contains(5));
		
		fibExpected.clear();
	}

	@Test(description="Test case for n as zero, n=0", priority=2)
	public void testFiboNoRecurZero(){
		fibExpected.add(0);
		Assert.assertEquals(Fibonacci.fiboNorecurrsion(0),fibExpected);
		Assert.assertTrue(Fibonacci.fiboNorecurrsion(0).size()==1);
	}
	
	@Test(description="Negative test case with n as negative, n= -4",priority=3)
	public void testFiboNoRecurNegnum()
	{
	Assert.assertEquals(Fibonacci.fiboNorecurrsion(-4),fibExpected);
	}
	
	@Test(description="Test case for n as one, n=1", priority=4)
	public void testFiboNoRecurOne(){
		
		Assert.assertEquals(Fibonacci.fiboNorecurrsion(1),fibExpected);
		Assert.assertTrue(Fibonacci.fiboNorecurrsion(1).size()==1);
	}
	
	
	@Test(description="Recurssion positive testcase, n=3", priority=5)
	public void testFiboRecurPositive()
	{
	Assert.assertEquals(2, Fibonacci.fiboRecurssion(3));
	}
	
	@Test(description="Recurssion zero as input, n=0",priority=6)
	public void testFiboRecurZero()
	{
		Assert.assertEquals(0, Fibonacci.fiboRecurssion(0));
	}
	
	@Test(description="Recurssion negative number as input, n=-4",priority=7)
	public void testFiboRecurNegative()
	{
		Assert.assertEquals(0, Fibonacci.fiboRecurssion(-2));
	}
}
