/*
 * Program that defines an enum having months of the year and 
 * then prints the value of all the enum elements.
 */

//Author:Sreelekshmi
package com.innovapath.programingpractice;

public class EnumPrint {
	
	public enum Month
	{
	  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
	  JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}
	
	public static void printEnum()
	{
		 int count = 1;
		    // loop through our enum
		    for (Month m: Month.values())
		    {
		      System.out.printf("Month %d = %s\n", count++, m);
		    }
	}
	
	public static void main(String args[])
	{
		EnumPrint.printEnum();
	}

}
