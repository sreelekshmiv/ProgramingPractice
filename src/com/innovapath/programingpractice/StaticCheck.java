package com.innovapath.programingpractice;

public class StaticCheck {
	String name;
	
	StaticCheck(String name)
	{
		this.name=name;
	}
	
	static
	{
		System.out.println("I'm static block and I will be exceuted first before main method");
	}

	public static void staticMethod()
	{
		System.out.println("I'm static method and can be called without class instance");
	}
	
	public static void main(String args[])
	{
		System.out.println("Check the static execution sequence");
		
		StaticCheck.staticMethod();
		
		
		/* Console output
		 * I'm static block and I will be exceuted first before main method
			Check the static execution sequence
			I'm static method and can be called without class instance

		 */
	}
}
