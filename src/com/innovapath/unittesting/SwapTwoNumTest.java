//Test for SwapTwoNumbers.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.SwapTwoNumbers;

public class SwapTwoNumTest {
	
	@Test(description="Test case to swap two positive numbers")
	public static void swapTwoNumNoThirdVar()
	{		
		int[] num={2,4};
		SwapTwoNumbers.swapWithOutThirdVar(num);
		Assert.assertEquals(4, num[0]);
		Assert.assertEquals(2, num[1]);		
	}

	@Test(description="Test case to swap two negative numbers")
	public static void swapTwoNegNoThirdVar()
	{		
		int[] num={-2,-8};
		SwapTwoNumbers.swapWithOutThirdVar(num);
		Assert.assertEquals(-8, num[0]);
		Assert.assertEquals(-2, num[1]);		
	}
	@Test(description="Test case to swap one positive,one negative number")
	public static void swapTwoPosNegNoThirdVar()
	{		
		int[] num={-7,5};
		SwapTwoNumbers.swapWithOutThirdVar(num);
		Assert.assertEquals(5, num[0]);
		Assert.assertEquals(-7, num[1]);		
	}
	
	@Test(description="Test case to swap duplicate numbers")
	public static void swapTwoDupNoThirdVar()
	{		
		int[] num={6,6};
		SwapTwoNumbers.swapWithOutThirdVar(num);
		Assert.assertEquals(6, num[0]);
		Assert.assertEquals(6, num[1]);		
	}
	@Test(description="Test case to swap one input as zero")
	public static void swapTwoNumZeroNoThirdVar()
	{		
		int[] num={3,0};
		SwapTwoNumbers.swapWithOutThirdVar(num);
		Assert.assertEquals(0, num[0]);
		Assert.assertEquals(3, num[1]);		
	}
	
	
	@Test(description="Third Var Test case to swap two positive numbers")
	public static void swapTwoNumThirdVar()
	{		
		int[] num={2,4};
		SwapTwoNumbers.swapWithThirdVar(num);
		Assert.assertEquals(4, num[0]);
		Assert.assertEquals(2, num[1]);		
	}

	@Test(description="Third Var Test case to swap two negative numbers")
	public static void swapTwoNegThirdVar()
	{		
		int[] num={-2,-8};
		SwapTwoNumbers.swapWithThirdVar(num);
		Assert.assertEquals(-8, num[0]);
		Assert.assertEquals(-2, num[1]);		
	}
	@Test(description="Third Var Test case to swap one positive,one negative number")
	public static void swapTwoPosNegThirdVar()
	{		
		int[] num={-7,5};
		SwapTwoNumbers.swapWithThirdVar(num);
		Assert.assertEquals(5, num[0]);
		Assert.assertEquals(-7, num[1]);		
	}
	
	@Test(description="Third Var,Test case to swap duplicate numbers")
	public static void swapTwoDupThirdVar()
	{		
		int[] num={6,6};
		SwapTwoNumbers.swapWithThirdVar(num);
		Assert.assertEquals(6, num[0]);
		Assert.assertEquals(6, num[1]);		
	}
	@Test(description="Third Var, Test case to swap one input as zero")
	public static void swapTwoNumZeroThirdVar()
	{		
		int[] num={3,0};
		SwapTwoNumbers.swapWithThirdVar(num);
		Assert.assertEquals(0, num[0]);
		Assert.assertEquals(3, num[1]);		
	}
}
