//Test Overloading.java and Overriding.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.Car;
import com.innovapath.programingpractice.Ford;
import com.innovapath.programingpractice.OverLoading;

public class OverloadingridingTest {

	
	@Test
	public void testOverloading()
	{
		Assert.assertEquals(OverLoading.add(2, 3), 5);
		Assert.assertEquals(OverLoading.add(5,1, 3), 9);
	}
	
	@Test
	public void testOverRiding()
	{
		Car obj = new Ford();
    Car cobj=new Car();
    	
		Assert.assertEquals(obj.speedLimit(),150);
		Assert.assertEquals(cobj.speedLimit(),100);
	}
}
