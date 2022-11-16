package com.skillstorm.cars;

import java.util.LinkedList;

public class Customer extends Person{


	private short creditScore;
	private boolean tradeIn;
	private LinkedList<Vehicle> collection;
	
	public Customer() {
		super();
	}
	
	public Customer(String name, double netWorth, short creditScore, boolean tradeIn, LinkedList<Vehicle> collection) {
		super(name, netWorth);
		this.creditScore = creditScore;
		this.tradeIn = tradeIn;
		
		if (collection == null) {
			this.collection = new LinkedList<Vehicle>();
		} else {
			this.collection = collection;
		}
	
	}

	public short getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(short creditScore) {
		this.creditScore = creditScore;
	}

	public boolean isTradeIn() {
		return tradeIn;
	}

	public void setTradeIn(boolean tradeIn) {
		this.tradeIn = tradeIn;
	}

	public LinkedList<Vehicle> getCollection() {
		return collection;
	}

	public void setCollection(LinkedList<Vehicle> collection) {
		this.collection = collection;
	}
	
	public void buy(Vehicle vehicle, Dealership dealership, Salesperson salesperson) {
		// check if the dealership has the vehicle
		// check if the customer has enough money
		// check if trade in
		// check the credit score
		if (dealership.getInventory().contains(vehicle)) {
			if (this.getNetWorth() >= vehicle.getPrice() || this.creditScore >= 400) {
				double finalPrice = vehicle.getPrice();
				if (tradeIn) {
					finalPrice = finalPrice - 5000;
					if (finalPrice < 0) {
						finalPrice = 0;
					}
						
				}
				//subtracts final price from customer's net worth
				this.setNetWorth(this.getNetWorth() - finalPrice);
				
				// adds commission to saleperson's net worth
				salesperson.setNetWorth(salesperson.getNetWorth() + (salesperson.getCommission() * finalPrice));
				
				// add remaining value to dealerships cashOnHand
				dealership.setCashOnHand(dealership.getCashOnHand() + (finalPrice -(salesperson.getCommission() * finalPrice)));
				
				// add vehicle to customer's collection, then remove vehicle from dealership inventory
				this.collection.add(vehicle);
				dealership.getInventory().remove(vehicle);
				
				
			} else {
				System.out.println("Sorry, we can't take your money, or lack thereof");
			}
		} else {
			System.out.println("Sorry, not in stock");
		}
	}

	@Override
	public String toString() {
		return "Customer [Name=" + getName() + ", getNetWorth()=" + getNetWorth() + "creditScore=" + creditScore + ", tradeIn=" + tradeIn + ", collection=" + collection
				+ "]";
	}

	
	
}
