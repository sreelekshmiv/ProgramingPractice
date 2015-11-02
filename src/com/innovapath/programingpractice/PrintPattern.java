/*a program  that prints a pattern like below.
    		*
    		**
    		***
    		****
    		*****
    		******
   The program contains a method that returns back number of lines printed. 		    		
 */
package com.innovapath.programingpractice;

public class PrintPattern {
	
	public static int printPattern(int n){
		int countLines = 0;
		for(int i=0;i<n;i++)
		{			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			countLines++;
		}
		return countLines;
	}
	
}
