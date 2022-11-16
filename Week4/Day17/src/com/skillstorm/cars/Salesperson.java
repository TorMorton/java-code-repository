package com.skillstorm.cars;

// this class represents a generic salesperson with properties and methods relevant to our project
public class Salesperson extends Person {


	private double commission;
	// constructors
	
	public Salesperson() {
		super();
	}
	
	public Salesperson(String name, double netWorth, double commission) {
		super(name, netWorth);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return "Salesperson [commission=" + commission + ", getName()=" + getName() + ", getNetWorth()=" + getNetWorth()
				+ "]";
	}

	
}
