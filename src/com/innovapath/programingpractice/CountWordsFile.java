/*
 * A program to count the number of words in a file.
 */

//Author:Sreelekshmi
package com.innovapath.programingpractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CountWordsFile {

	public static int countWords(String path) {
		int words=0;
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
	                	System.out.println(w);
	                  words++;        
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
		
		return words;
	}
	
	

}
