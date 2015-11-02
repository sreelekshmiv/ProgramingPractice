package com.innovapath.programingpractice;

public class Circle extends Shape implements ShapeConstants {

	private double radius;

	public Circle(String name) {
		super(name);
	}

	@Override
	public void setSides(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return ShapeConstants.PI * this.radius * this.radius;
	}

	@Override
	public double calculatePermieter() {
		return 2 * ShapeConstants.PI * this.radius;
	}

}
