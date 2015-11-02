//a program that is expected to throw a null pointer exception and in turn handles it using try catch and finally.
package com.innovapath.programingpractice;

public class TryCatchFinally {
	
	public static void tryCatchException(String str)
	{
		try
		{
			char[] ch=str.toCharArray();
			for(int i=ch.length-1;i>=0;i--)
			{
				System.out.print(ch[i]);
			}
			System.out.println();
			
		}catch(NullPointerException ex)
		{
			System.out.println("NullPointerException is catched");
		}
		finally
		{
			System.out.println("Will be called even if exception occured or not");
		}
	}
	
	public static void main(String args[])
	{
		TryCatchFinally.tryCatchException("java");
		TryCatchFinally.tryCatchException(null);
	}

}
