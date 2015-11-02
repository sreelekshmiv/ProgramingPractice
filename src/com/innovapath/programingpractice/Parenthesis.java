/*
 * A program to check if a given string of parenthesis has balanced parenthesis or not.
 * For example a string as "(())" is a valid string where as strings like ")(" or "(()))" are not valid strings
 */
package com.innovapath.programingpractice;

import java.util.Stack;

public class Parenthesis {
	 public static boolean isBalanced(String input) throws NullPointerException
	    {
	        Stack<Character> stck = new Stack<Character>();

	        for(char chr : input.toCharArray())
	        {
	            switch(chr) {

	                case '{':
	                case '(':
	                case '[':
	                    stck.push(chr);
	                    break;

	                case ']':
	                    if(stck.isEmpty() || stck.pop() != '[') 
	                        return false;
	                    break;
	                case ')':
	                    if(stck.isEmpty() || stck.pop() != '(')
	                        return false;
	                    break;
	                case '}':
	                    if(stck.isEmpty() || stck.pop() != '{')
	                        return false;
	                    break;
	            }
	        }
	        return stck.isEmpty();
	    }
	   
	    }

