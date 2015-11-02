/*
 * a program to implement hashCode() and equals() methods
 */
package com.innovapath.programingpractice;

public class HashcodeEqual {

	private int age;

	public HashcodeEqual(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		HashcodeEqual hash = (HashcodeEqual) obj;
		if (hash.age == age)
			flag = true;
		return flag;
	}

}
