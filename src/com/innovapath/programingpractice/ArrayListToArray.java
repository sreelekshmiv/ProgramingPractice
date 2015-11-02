/*
 * A program to copy arraylist to an array
 */
//Author:Sreelekshmi

package com.innovapath.programingpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	
	//Converts arraylist to array 
	public static String[] listToArray(List<String> ls)
	{		
		return (String[]) ls.toArray(new String[ls.size()]);
	}
	
	public static void main(String args[])
	{
		List<String> a=new ArrayList<String>();
		a.add("hi");
		a.add("hello");
		
		String[] res=ArrayListToArray.listToArray(a);
		for(String s:res)
		{
			System.out.println(s);
		}
	}
}
