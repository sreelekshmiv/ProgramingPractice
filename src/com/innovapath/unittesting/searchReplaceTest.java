//Test for SearchReplaceFile.java


package com.innovapath.unittesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.SearchReplaceFile;

public class searchReplaceTest {
	
	@Test(description="Testcase for search and replace")
	public void searchReplace()
	{
		//SearchReplaceFile.searchReplace("src/count.txt", "fun", "nofun");
		File file1 = new File("src/replace.txt");
		File file2 = new File("src/replacetest.txt");
		

		try {
			boolean compare1and2 = FileUtils.contentEquals(file2, file1);
			
			Assert.assertEquals(compare1and2, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
