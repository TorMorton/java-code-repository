package com.skillstorm;

import java.util.Arrays;
import java.util.List;

public class LambdaReview {
	
	/*
	 * OOP vs Functional Programming
	 * 
	 */
	
	
	/*
	 * What are the 4 principles of OOP?
	 * 1. Encapsulation - using access modifiers  to restrict access
	 * 2. Abstraction - hiding unneccesary details to the user (hide implementation details)
	 * 3. Polymorphism - how code can be changed, adapted or reused
	 * 4. Inheritance - Parent child relationship, one class gets the methods and properties from another for code reusability and extensibility
	 */
	
	/*
	 * What are the two principles of functional programming?
	 * 1. functions are "first class" -- we can pass a function as an argument, can return as a value, 
	 * 2. Pure functions -- only use input that is passed in, doesn't mutate the state of anything in program, just returns new
	 * 
	 */
	
	// dfn functional interface
	
	
	/*
	 * Follow up question
	 * - are methods in java treated as such?
	 * --- no, so we can't use functional programming without functional interfaces
	 * 
	 */
	
	/*
	 * What is a "Functional Interface"?
	 * - an interface with ONE abstract method
	 */
	
	/*
	 * What is a lambda function?
	 * - anonymous -- 
	 * - arrow -- 
	 * - dfn: lambda function is shorthand for creating a class that IMPLEMENTS a functional interface
	 * 
	 */
	
	/*
	 * Example: User-defined Functional Interface
	 */
	 // tells the compiler that this should only have one method
	
	
	class Motorcycle implements Driveable{
		@Override
		public void drive(String name) {
			System.out.println("vroom");	
		}	
	}
	
	public static void main(String[] args) {

		Driveable myDriveable = new Motorcycle();
		List<String> peopleAtMotorcycleEvent = Arrays.asList("Tor", "Bob", "Joe");
		forEachMotorcycle(peopleAtMotorcycleEvent, myDriveable);
		
	}
	
	// for each we will hand write a method that runs the drive method on each person at the motorcycle event
	public static void forEachMotorcycle(List<String> peopleAtEvent, Driveable driver) {
		// every element in my list, call the method
		for(String person : peopleAtEvent) {
			driver.drive(person);
		}
	}
	
	
	/*
	 * Example: Built-in Functional Interfaces
	 * - Comparator -- compareTo takes in two arguments, returns an int
	 * - Predicate -- take in one argument and returns a boolean
	 * - Consumer -- a built in interface that takes ONE argument and returns VOID
	 * - Supplier -- takes in NO arguments, returns ONE value of any type
	 * - Function -- takes in ANY type and returns ANY type
	 */
	

}
