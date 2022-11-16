package com.skillstorm;

import java.util.LinkedList;
import java.util.Queue;

public class IceCreamTest {

	public static void main(String[] args) {
		
		
		
		Queue<Customer> customers = new LinkedList<>();
		LinkedList<IceCream> flavors = new LinkedList<>();
		
		
		
		IceCreamShop freezeTreats = new IceCreamShop(0.00, flavors, customers);
		
		IceCream vanilla = new IceCream("Vanilla", 2.99);
		IceCream chocolate = new IceCream("Chocolate", 1.99);
		
		
		freezeTreats.addFlavor(chocolate);
		freezeTreats.addFlavor(vanilla);
		
		
		Customer cust1 = new Customer("Dan", "Vanilla");
		Customer cust2 = new Customer("Darla", "Chocolate");
		
		freezeTreats.addCustomer(cust1);
		freezeTreats.addCustomer(cust2);
		
		System.out.println(freezeTreats.getIceCreamFlavors());
		System.out.println(freezeTreats);
		
		freezeTreats.serviceCustomer(customers);
		System.out.println(freezeTreats);
		
	}
}
