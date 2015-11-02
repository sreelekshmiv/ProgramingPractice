//Test for PrimeNumber.java

package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.PrimeNumber;

public class PrimeNumberTest {
	
	@Test(description="Test for a prime number, n=5")
	public void testPrime(){
		Assert.assertEquals(PrimeNumber.isPrime(5), true);
	}
	
	@Test(description="Test for a not prime number, n=6")
	public void testNotPrime(){
		Assert.assertEquals(PrimeNumber.isPrime(6), false);
	}
	
	@Test(description="Test for zero as input, n=0")
	public void testZeroPrime(){
		Assert.assertEquals(PrimeNumber.isPrime(0), false);
	}
	
	@Test(description="Test for one as input, n=1")
	public void testOnePrime(){
		Assert.assertEquals(PrimeNumber.isPrime(1), false);
	}
	
	@Test(description="Test for a prime number, n=-3")
	public void testNegNumPrime(){
		Assert.assertEquals(PrimeNumber.isPrime(-3), false);
	}
	
	@Test(description="Test for a prime number, n=2")
	public void testIsPrime(){
		Assert.assertEquals(PrimeNumber.isPrime(2), true);
	}
}
