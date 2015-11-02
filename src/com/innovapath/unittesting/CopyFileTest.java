
//Test for CopyFile.java
package com.innovapath.unittesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.CopyFile;

public class CopyFileTest {
	
	@Test(description="Testcase to test the copy contents")
	public void testCopyContents() throws IOException
	{
		CopyFile.copyFileContents("src/copy1.txt", "src/copy3.txt");
		File f1=new File("src/copy1.txt");
		File f2=new File("src/copy3.txt");
		
		boolean compare1and2 = FileUtils.contentEquals(f1,f2);
		
		Assert.assertTrue(compare1and2);
	}
	@Test(description="Testcase exception", expectedExceptions=NullPointerException.class)
	public void testCopyContentsExcep() throws IOException
	{
		CopyFile.copyFileContents(null,null);
		
	}
}
