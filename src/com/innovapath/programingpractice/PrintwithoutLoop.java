package com.innovapath.programingpractice;

public class PrintwithoutLoop {
	
	public static void printValues(int n) {
	    if(n <= 10) {
	        System.out.println(n);
	        printValues(n+1);
	    }
	}
	
	public static void main(String args[])
	{
		PrintwithoutLoop.printValues(1);
	}

}
