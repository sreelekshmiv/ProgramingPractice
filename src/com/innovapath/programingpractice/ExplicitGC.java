/*
 * Explicit Garbage Collection
 */

//Author:Sreelekshmi
package com.innovapath.programingpractice;

public class ExplicitGC {

	private String name;
	 
	public ExplicitGC(String name) {
		this.name = name;
	}
 
	@Override
	public void finalize() {
		System.out.println(this.name + " cleaned");// May or may not print this , because GC is not gauranteed!
	}
	
	
	public static void main(String args[])
	{
		ExplicitGC a = new ExplicitGC("Java Program");
		a = null;
 
		Runtime.getRuntime().gc();
	}
}
