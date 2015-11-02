/*Program that swaps 2 given numbers have 2 separate functions in the program.
     		   1) One Function should swap the numbers without any third new variable.
      		   2) Second function should swap the numbers using a third variable.
 */
package com.innovapath.programingpractice;

public class SwapTwoNumbers {

	// Swap without third variable
	public static void swapWithOutThirdVar(int[] nums) {
		int first = nums[0];
		int second = nums[1];

		first = first + second;
		second = first - second;
		first = first - second;

		nums[0] = first;
		nums[1] = second;

	}

	// Swap with third variable
	public static void swapWithThirdVar(int[] nums) {

		int temp = 0;
		int first = nums[0];
		int second = nums[1];

		temp = second;
		second = first;
		first = temp;
		
		nums[0]=first;
		nums[1]=second;
	}

}
