package com.skillstorm;

public class Customer {

	private String name;
	private String flavor;
	
	public Customer() {
		super();
	}
	
	public Customer(String name, String flavor) {
		this.name = name;
		this.flavor = flavor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		return "Customer name = " + name + ", flavor = " + flavor;
	}
	
	
	
	
}
