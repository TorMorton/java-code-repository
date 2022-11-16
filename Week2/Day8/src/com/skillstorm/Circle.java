package com.skillstorm;


public class Circle {
	
	private double radius;
	double diameter;
	double circumference;
	double area;

	public Circle() {
		System.out.println("The default circle's radius will be 2.");
		radius = 2;
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
		System.out.println("Your created circle's radius is " + radius);
		
	}

	public double getDiameter () {
		diameter = radius * 2;
		return this.diameter;
	}
	
	public double getCircumference () {	
		circumference = (radius * 2) * Math.PI;
		return this.circumference;
	}
	
	public double getArea () {
		area = (radius *radius) * Math.PI;
		return this.area;
	}
	
	public void setDiameter (double radius) {
		this.radius = radius;
		this.diameter = radius * 2;
	}
	
	public void setCircumference (double radius) {
		this.radius = radius;
		this.circumference = (radius * 2) * Math.PI;
	}
	
	public void setArea (double radius) {
		this.radius = radius;
		this.area = (radius *radius) * Math.PI;
	}
	
	public boolean isEqual (Circle circle1, Circle circle2) {
		double firstCirc = circle1.getCircumference();
		double secondCirc = circle2.getCircumference();
		System.out.println("Are these circles equal?");
		if (firstCirc == secondCirc)
			return true;
		else
			return false;
	}


	public String toString() {
		return "Circle [Diameter: " + getDiameter() + ", circumference: " + getCircumference() + ", area: "
				+ getArea() + "]";
	}


	
	
}
