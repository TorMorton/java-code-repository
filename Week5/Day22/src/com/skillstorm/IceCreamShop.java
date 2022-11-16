package com.skillstorm;

import java.util.LinkedList;
import java.util.Queue;

 

//Bonus Challenge:

//    Implement the toString methods for IceCream, Customer, and IceCreamShop

public class IceCreamShop {

	private double totalProfit;
	private LinkedList<IceCream> iceCreamFlavors;
	private Queue<Customer> customerLine;
	
	public IceCreamShop() {
		super();
		this.setTotalProfit(0);
		iceCreamFlavors = new LinkedList<IceCream>();
		customerLine = new LinkedList<Customer>();
	}
	
	public IceCreamShop(double profit, LinkedList<IceCream> iceCreamFlavors, Queue<Customer> customerLine) {
		setTotalProfit(profit);
		setIceCreamFlavors(iceCreamFlavors);
		setCustomerLine(customerLine);
	}

	public double getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(double totalProfit) {
		this.totalProfit = totalProfit;
	}

	public LinkedList<IceCream> getIceCreamFlavors() {
		return iceCreamFlavors;
	}

	public void setIceCreamFlavors(LinkedList<IceCream> iceCreamFlavors) {
		this.iceCreamFlavors = new LinkedList<>();
	}

	public Queue<Customer> getCustomerLine() {
		return customerLine;
	}

	public void setCustomerLine(Queue<Customer> customerLine) {
		this.customerLine = customerLine;
	}

	
//  Write the method, addCustomer that adds a Customer to the IceCreamShop's queue
	public void addCustomer(Customer customer) {
		if (customer.getName() != null) {
			customerLine.add(customer);
		}else {
			System.out.println("Please input customer name.");
		}
	}
	
//  Write the method, serviceCustomer that takes the Customer at the front of the list, adds the cost of their ice cream to the total earnings, and then removes them from the queue



	public void serviceCustomer(Queue<Customer> customerLine) {
		//  Throw an exception when attempting to service a customer from an empty queue
		if (customerLine.peek() != null) {
			if (customerLine.peek().getFlavor() != null) {
				for(int i = 0; i < iceCreamFlavors.size(); i++) {
					//  Prevent a customer from purchasing an ice cream flavor that's not in the available flavors list by throwing an exception (HINT: use the ice cream's flavor to compare two ice creams)
					if (customerLine.peek().getFlavor().equals(iceCreamFlavors.get(i).getFlavor())) {
						double price = iceCreamFlavors.get(i).getPrice();
						setTotalProfit(getTotalProfit() + price);
						customerLine.poll();
					}
				}
			}else {
				throw new IllegalArgumentException("Please input a flavor to purchase.");
			}
		} else {
		//  Prevent a customer from purchasing when they don't have an IceCream flavor by throwing an exception
			throw new IllegalArgumentException("There is no one in line.");
		
		}
	}	
		
		
	
	
//  Write the method, addFlavor that adds an IceCream flavor to the list of available IceCream flavors
//  Prevent the user from being able to add the same flavor multiple times to the flavor list
	public void addFlavor(IceCream icecream) {
		if (iceCreamFlavors.isEmpty()) {
			iceCreamFlavors.add(icecream);
		} else {
			for(int i = 0; i < iceCreamFlavors.size(); i++) {
				if (!(icecream.getFlavor().equals(iceCreamFlavors.get(i).getFlavor()))) {
					iceCreamFlavors.add(icecream);
				} else {
					System.out.println("This flavor is already on the list!");
			}
			}
		}
	}
	
//  Write the method, removeFlavor that removes an IceCream flavor to the list of available IceCream flavors	
	public void removeFlavor(IceCream icecream) {
		if(icecream.getFlavor() == null) {
			throw new IllegalArgumentException("No flavor to remove.");
		} else {
			for(int i = 0; i < iceCreamFlavors.size(); i++) {
				if (icecream.getFlavor().equals(iceCreamFlavors.get(i).getFlavor())) {
					iceCreamFlavors.remove(icecream);
				}
			}
		}
	}

	
	@Override
	public String toString() {
		return "IceCreamShop totalProfit = " + totalProfit + ", iceCreamFlavors = " + iceCreamFlavors + ", customerLine="
				+ customerLine;
	}
	
	
	
}
