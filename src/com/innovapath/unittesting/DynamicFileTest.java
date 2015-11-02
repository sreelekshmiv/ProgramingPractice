//Test for DynamicFile.java
package com.innovapath.unittesting;

import java.io.IOException;
import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.DynamicFile;

public class DynamicFileTest {

	@Test(description="Testcase for scanner function for input 2,3",enabled=false)
	public void testScanner(){
		Assert.assertEquals(DynamicFile.scannerInput(), 5);
	}
	@Test(description="Testcase for scanner function for zero input 0,3",enabled=false)
	public void testScannerZero(){
		Assert.assertEquals(DynamicFile.scannerInput(), 3);
	}
	@Test(description="Testcase for scanner function for InputMismatchException", expectedExceptions=InputMismatchException.class, enabled=false)
	public void testScannerException(){
		Assert.assertEquals(DynamicFile.scannerInput(), 5);
	}
	
	
	@Test(description="Testcase for readerinput function for input 2,3",enabled=false)
	public void testReaderInput(){
		try {
			Assert.assertEquals(DynamicFile.readerInput(), 5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(description="Testcase for datainputstream function for input 2,3",enabled=true)
	public void testDataInputStream(){
		try {
			Assert.assertEquals(DynamicFile.dataInputStream(), -1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
