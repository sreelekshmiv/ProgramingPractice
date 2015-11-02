package com.innovapath.programingpractice;

public class Square extends Shape implements ShapeConstants {

	private double sides;
	public Square(String name) {
		super(name);		
	}
	
	@Override
	public void setSides(int sides) {
		this.sides=sides;
	}



	@Override
	public double calculateArea() {
		return this.sides*this.sides;
	}

	@Override
	public double calculatePermieter() {
		return 4*this.sides;
	}



	

}
