/*
 * program that implements various functions of different type of access modifiers(private,protected,default,public)
 */

//Author:Sreelekshmi

package com.innovapath.programingpractice;

public class AccessModifiers {

	//Private access modifier
	//Accessible only within the class
	//Not accessible with in package,outside package by subclass or outside package
	private AccessModifiers()
	{
		//Cannot create instance of this class if the constructor is private
	}
	
	private static void privateMethod()
	{	
		System.out.println("I'm a private method accessed from same class");
	}

		
	//default accessmodifier
	//accessible within class, within package
	//default modifier cannot be accessed outside the package and outside package by subclass
	void msgDefault()
	{
		System.out.println("Default Modifier from same class");
	}  
	
	
	//protected accessmodifier
	//Accessible with in the package, with in class and outside the package but only through inheritance
	//Not accessible outside package
	protected void msgProtected()
	{
		System.out.println("Protected Modifier from same class");
		}  
	
	//public access modifiers
	//accessible everywhere
	public void msgPublic()
	{
		System.out.println("Public Modifier from same class");
		}  
	
	public static void main(String args[])
	{
		AccessModifiers.privateMethod();// not accessible outside the class
		//System.out.println(AccessModifiers.data);
		AccessModifiers am=new AccessModifiers();
		am.msgDefault();
		am.msgProtected();
		am.msgPublic();
		
	}
	
}
