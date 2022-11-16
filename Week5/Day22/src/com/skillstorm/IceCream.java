package com.skillstorm;

public class IceCream {

	private String flavor;
	private double price;
	
	public IceCream() {
		super();
	}
	
	public IceCream(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "IceCream flavor = " + flavor + ", price = " + price;
	}
	
	
	
}
