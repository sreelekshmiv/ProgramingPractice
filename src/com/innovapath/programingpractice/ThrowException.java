/*
 * Program containing a function which is expected to throw any kind of exception 
 * say NullPointerException or ArithmeticException etc and 
 * then handle this function in the parent function which calls this function.
 */
package com.innovapath.programingpractice;

public class ThrowException {
	
	public static int arithmetic(int n1,int n2)throws ArithmeticException
	{
		return n1/n2;
	}

	
	//Handle Exception
	public static void main(String args[])
	{
		try
		{
			ThrowException.arithmetic(3, 0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception catched");
		}
	}
}
