
/*
 * A program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".
 */
package com.innovapath.programingpractice;

public class ConvertString {
	
	//Used String split, trim methods
	public static String convertString(String strInput) throws NullPointerException
	{
		String[] splitStr=strInput.split(" ");
		
		
		int j=1;
		for(int i=0;i<splitStr.length;i++)
		{
			splitStr[i]=splitStr[i]+j++;
		}
		strInput="";
		for(String s:splitStr)
		{
			strInput+=s+" ";
		}
		return strInput.trim();
	}

	

}
