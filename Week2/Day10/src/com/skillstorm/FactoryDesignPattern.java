package com.skillstorm;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		// FACTORY DESIGN PATTERN
		
		/*
		 * the factory design pattern is a creational design patter
		 * -- it deals with the creation of an object
		 * -- an example of a deeper usage of the abstraction pillar
		 * 
		 * The factory will create Objects for us
		 * -- how it does so and which Objects its going to create are hidden from us
		 * -- we don't know how, why, and we don't care
		 * 
		 */
		
		// by using interface to group classes, we can collect them in an array
		Shape [] shapes = { new Circle(), new Triangle(), new Rhombus(), new Octagon() };
		
		// by forcing them all to implement declareMyself(), we can also run the same method on each one
		// each has its own implementation of that method, with different results
		for (Shape shape : shapes) {
			shape.declareMyself();
		}
		
		System.out.println();
		System.out.println();
		
		//create a new shape factory
		ShapeFactory myShapeFactory = new ShapeFactory();
		
		// Can just run the method, but can't really do anything with the return
		//saving the output to the variable
		Shape myFreshShape = myShapeFactory.createShape(5);
		// calling a method on our newly created shape
		myFreshShape.declareMyself();


	}

}
