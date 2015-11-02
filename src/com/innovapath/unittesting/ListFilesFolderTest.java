//Test for ListFilesFolder.java
package com.innovapath.unittesting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.ListFilesFolder;

public class ListFilesFolderTest {
	List<String> resFiles;
	FileReader fr;
	@BeforeClass
	public void init()
	{
		//Preparing test data file
		resFiles=new ArrayList<String>();
		
		try {
			fr = new FileReader("src/testfiles");
			BufferedReader br=new BufferedReader(fr);
			String value="";
			String [] files;
			
			while((value = br.readLine()) != null)
			{
				resFiles.add(value);
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
	
		
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	@Test(description="Test case for listing files in folder")
	public void testFilesFolder()
	{
		try {
			Assert.assertTrue(ListFilesFolder.listf("C://TestFolder").containsAll(resFiles));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(description="Test case for Exception",expectedExceptions=NullPointerException.class )
	public void testFilesFolderException() throws NullPointerException, IOException
	{
		
			ListFilesFolder.listf(null);
		
	}
}
