package com.skillstorm.cars;

// this class represents and  individual vehicle
// we should include properties and methods that are relevant to this project
public class Vehicle {

	//properties
	private String make;
	private String model;
	private short year;
	private String type;
	private double price;
	private String color;
	private String fuelType;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(String make, String model, short year, String type, double price, String color, String fuelType) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.type = type;
		this.price = price;
		this.color = color;
		this.fuelType = fuelType;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", type=" + type + ", price=$" + price
			 + ", color=" + color + ", fuelType=" + fuelType + "]";
	}
	
}
