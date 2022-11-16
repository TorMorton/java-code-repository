package com.skillstorm;


// this is the class that's actually going to build our shapes
public class ShapeFactory {

	//return type of a method refers to the reference type of the Object returned
	public Shape createShape(int corners) {
		
		// covers all int values for corners
		// any input validation will have happened prior to reaching this method 
		switch (corners) {
			case 0:
				return new Circle();
			case 3:
				return new Triangle();
			case 4:
				return new Rhombus();
			case 8:
				return new Octagon();
			case 5:
				return new Pentagon();
			default:
				//totally acceptable to do this
				//can output some default value or Object
				
				//System.out.println("No objects with that many corners, here's a circle instead.");
				//return new Circle();
				
				//or can be useful to throw an exception
				//stops the code in its tracks and lets the user know why
				//string in the parentheses will print out to the console as an error message
				throw new IllegalArgumentException("No shapes in this factory have " + corners + " corners.");
			}
		
		
	}
	
}
