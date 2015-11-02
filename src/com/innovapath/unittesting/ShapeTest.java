//Test for Shape.java
package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.Shape;
import com.innovapath.programingpractice.Square;

public class ShapeTest {
	
	@Test
	public void testSquare()
	{
		Square sq=new Square("Square");
		
		
		sq.setSides(4);
		Assert.assertEquals(sq.calculateArea(), 16.0);
		Assert.assertEquals(sq.calculatePermieter(), 16.0);
	}

	@Test
	public void testCircle()
	{
		Square cr=new Square("Circle");
		
		
		cr.setSides(10);
		Assert.assertEquals(cr.calculateArea(), 100.0);
		Assert.assertEquals(cr.calculatePermieter(), 40.0);
	}

}
