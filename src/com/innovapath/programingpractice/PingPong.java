/*
 *  program print "ping" if a number is divisible by 3,
 *  "pong" if a number is divisible by 5, and
 *   "ping pong" if number is divisible by both, 
 *   else print the number.
 */

//Author: Sreelekshmi
package com.innovapath.programingpractice;

public class PingPong {

	public static String printPingPong(int num)  {
		if (num % 3 == 0 && num % 5 == 0) {
			return "ping pong";
		} else if (num % 3 == 0) {
			return "ping";
		} else if (num % 5 == 0) {
			return "pong";
		} else
			return String.valueOf(num);

	}

}
