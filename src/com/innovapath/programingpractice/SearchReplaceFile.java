/*
 * A program to search for a string in a file and then replace it with another string.
 */

//Author
package com.innovapath.programingpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchReplaceFile {
	public static void searchReplace(String path,String search,String newStr) {
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			File temp=new File("src/replace.txt");
			PrintWriter wtr=new PrintWriter(temp);
			
			String value="";
			String [] word;
			
			try {
				while((value = br.readLine()) != null){
					word = value.split(" ");
	                for( String w : word)
	                {
	                	
	                	if(w.equals(search)){
	                  w=newStr;
	                	}
	                	wtr.print(w);
	                	wtr.append(' ');
	                }
	                wtr.flush();
					wtr.println();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
