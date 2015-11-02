//Test for HashcodeEqual.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.HashcodeEqual;

public class HashcodeEqualTest {
	
	@Test(description="Testcase for HashcodeEqual")
	public void testHashcodeEqual()
	{
		HashcodeEqual obj1=new HashcodeEqual(20);
		HashcodeEqual obj2=new HashcodeEqual(20);
		
		Assert.assertEquals(obj1.equals(obj2), true);
	}
	
	@Test(description="Testcase for HashcodeEqual not equal")
	public void testHashcodeNotEqual()
	{
		HashcodeEqual obj1=new HashcodeEqual(20);
		HashcodeEqual obj2=new HashcodeEqual(10);
		
		Assert.assertEquals(obj1.equals(obj2), false);
	}
	

}
