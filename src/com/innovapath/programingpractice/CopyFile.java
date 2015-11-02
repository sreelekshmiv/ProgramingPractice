/*
 * A program to copy content of file into another file.
 */

//Author:Sreelekshmi
package com.innovapath.programingpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	
	public static void copyFileContents(String path1,String path2)
	{
		InputStream inStream = null;
		OutputStream outStream = null;
			
	    	try{
	    		
	    	    File afile =new File(path1);
	    	    File bfile =new File(path2);
	    		
	    	    inStream = new FileInputStream(afile);
	    	    outStream = new FileOutputStream(bfile);
	        	
	    	    byte[] buffer = new byte[1024];
	    		
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	    	  
	    	    	outStream.write(buffer, 0, length);
	    	 
	    	    }
	    	 
	    	    inStream.close();
	    	    outStream.close();
	    	       	    
	    	}catch(IOException e){
	    		e.printStackTrace();
	    	}
	}
	
	  public static void main(String[] args)
	    {	
	    	
	    	CopyFile.copyFileContents("src/copy1.txt", "src/copy2.txt");
	    }
}
