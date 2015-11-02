/*
 * A program to search for a string in a file and then return the count of number of occurrences of the string.
 */
package com.innovapath.programingpractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchStringFile {
	
	public static int searchString(String path,String str) {
		int occur=0;
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			String value="";
			String [] word;
			
			try {
				while((value = br.readLine()) != null){
					word = value.split(" ");
	                for( String w : word)
	                {
	                	if(w.equals(str)){
	                  occur++;
	                	}
	                }
					
				}
				fr.close();
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return occur;
	}

	
}
