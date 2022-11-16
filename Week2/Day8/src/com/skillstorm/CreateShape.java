package com.skillstorm;

public class CreateShape {

	public static void main(String[] args) {
		Square square1 = new Square(4);
		square1.sides();
		square1.getArea();
		square1.getPerimeter();
		
		System.out.println();
		
		Square square2 = new Square(6);
		square2.sides();
		square2.getArea();
		square2.getPerimeter();
		
		System.out.println();
		
		Square square3 = new Square(8);
		square3.sides();
		square3.getArea();
		square3.getPerimeter();

		
	}
}
