/*
 * 			program creating an abstract class Shape with properties (noOfSides,area,perimeter) 
		and methods(calculateArea,calculatePerimeter,setSides.
 */

package com.innovapath.programingpractice;

public abstract class Shape {

	private String name;
	private int noOfSides;

	public Shape(String name) {
		setName(name);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSides(int sides) {
		noOfSides = sides;
	}

	abstract double calculateArea();

	abstract double calculatePermieter();

}
