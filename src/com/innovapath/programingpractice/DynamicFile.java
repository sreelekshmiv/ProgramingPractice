/*
 * A program that takes input from user dynamically using below classes.
  			--> Scanner: Use this class to input 2 integer numbers and sum them.
  			--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
  			--> DatainputStream: Use this class to input 2 integer numbers and multiply them.
  			--> Console: Use this class to input 2 integer numbers and divide them.
 */
//Author:Sreelekshmi
package com.innovapath.programingpractice;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DynamicFile {

	public static int scannerInput() throws InputMismatchException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
		return num1 + num2;
	}

	public static int readerInput() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter first number");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter second number");
		int num2 = Integer.parseInt(br.readLine());

		return num1 + num2;
	}
	
	public static int dataInputStream()throws IOException,InputMismatchException{
		
		DataInputStream dIn=new DataInputStream(System.in);
		System.out.println("Enter first number");
		int num1=Integer.parseInt(dIn.readLine());
		System.out.println("Enter second number");
		int num2 = Integer.parseInt(dIn.readLine());
		
		return num1-num2;
		
	}
	
	//****Note:- Eclipse IDE doesn't support interactive console. So will have to
	// run this function from command prompt
	//java -classpath C:\Innovapath\src <packagename.classname>
	public static void consoleInput()
	{
		Console c=System.console();  
		System.out.println("Enter first number");  
	int num1=Integer.parseInt(c.readLine());  
	System.out.println("Enter second number");
	int num2=Integer.parseInt(c.readLine());
	
	System.out.println(num1/num2);
	}
	
	public static void main(String args[])
	{
		DynamicFile.consoleInput();
	}
}
