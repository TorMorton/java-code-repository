package com.skillstorm;

public class Car {
	
	//class properties; don't need a car object created to use them
	public static boolean isDriveable;
	
	//properties
	//declared here but not initialized
	public String color;
	public String fuelType;
	
	
	//constructors
	public Car() {
		super();
	}
	
	public Car (String fuelType) {
		super();
		this.fuelType = fuelType;
		this.color = "Black";
	}
	
	public Car(String color, String fuelType) {
		// "initialized" here -> given actual useful values
		this.color = color;
		this.fuelType = fuelType;
		//this would be assignment, not initialization, because it already has a value from two lines up
		//this.color = "taupe";
	}
	
	//methods
	public void drive() {
		System.out.println("Off I go");
	}
}
