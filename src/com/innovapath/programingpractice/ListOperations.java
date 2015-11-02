/*
 * 
 */
package com.innovapath.programingpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListOperations {
	ArrayList<Integer> arList;
	public ArrayList<Integer> addElements(int[] num)
	{
		arList=new ArrayList<Integer>();
		for(int n:num){
			arList.add(n);
		}
		return arList;
	}
	public boolean searchElement(int n)
	{
		boolean flag=false;
		if(arList.contains(n)){
			flag=true;
		}
		return flag;
	}
	
	public void printIterator()
	{
		Iterator<Integer> itr=arList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	public void printListIterator()
	{
		ListIterator<Integer> lstItr=arList.listIterator(arList.size());
		while(lstItr.hasPrevious())
		{
			System.out.println(lstItr.previous());
		}
	}
	
	
}
