/*program that accepts input from the command line and then prints them.*/

//Author
package com.innovapath.programingpractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CmdLineInput {

	// A method that accepts two input values, add them and return output
	// Method returns 0 for invalid input, else return add result
	public static int printCmdLineAdd(Scanner scan)
			throws InputMismatchException {

		System.out.println("Enter first number");
		int num1 = scan.nextInt();

		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		System.out.println("Addition Result:" + (num1 + num2));
		return num1 + num2;

	}

}
