/*
 * A program to reverse each individual word in a sentence
 */
package com.innovapath.programingpractice;

public class ReverseWord {

	//Without string reverse method
	public static String reverseWord(String strInput) throws NullPointerException
	{
		String[] str=strInput.split(" ");
		String[] newStr=new String[str.length];
		for(int i=0;i<str.length;i++)
		{
			char[] ch=new char[str[i].length()];
			int k=0;
			for(int j=str[i].length()-1;j>=0;j--){
				ch[k++]=str[i].charAt(j);
			}
			newStr[i]=String.valueOf(ch);
		}
		
		strInput="";
		for(String s:newStr){
			strInput+=s+" ";
		}
		return strInput.trim();
	}

}
