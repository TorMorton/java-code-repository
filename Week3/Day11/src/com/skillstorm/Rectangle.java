package com.skillstorm;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle() {
		super();
		this.length = 1; //default
		this.width = 1; //default
	}
	
	public Rectangle(int length, int width) {
		isValid(length);
		isValid(width);
		this.length = length;
		this.width = width;
	}

	// Getters and Setters should be marked public
	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		isValid(length);
		this.length = length;
	}
		
	

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		isValid(width);
		this.width = width;	
	}
	
	private void isValid(int value) {
		if (value <= 0) {
			throw new IllegalArgumentException("Please input a value greater than 0");
		}	
	}
	
	public String toString() {
		return "Rectangle: width = " + width + ", length = " + length;
	}
	
	

	
}
