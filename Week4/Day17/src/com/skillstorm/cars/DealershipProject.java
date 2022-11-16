package com.skillstorm.cars;

import java.util.LinkedList;

public class DealershipProject {

	public static void main(String[] args) {
		
		/*
		 * CAR DEALERSHIP MINI-PROJECT
		 * 
		 * a customer can buy a car
		 * a salesperson can sell a car
		 * the dealership can buy cars and add them to its inventory
		 * keep track of all the money and who owns what
		 * we need documentation of these transactions
		 * 
		 * What classes do we need
		 * 	- car
		 *  - customer
		 *  - salesperson
		 *  - customer
		 *  - dealership
		 * 
		 */

		//Vehicle testVehicle = new Vehicle("Dodge", "RAM", (short)2013, "Pickup", 49999.99, "Blue", "Gasoline");
//		System.out.println(testVehicle);
		
		//LinkedList<Vehicle> starterList = new LinkedList<Vehicle>();
	//	starterList.add(testVehicle);
		
		//Dealership myDealership = new Dealership("EngineKnock Motors", "Camden, NJ", starterList, 7890.08);
	//	System.out.println(myDealership);
	//	System.out.println(myDealership.getInventory());
		
		//Salesperson newSalesperson = new Salesperson("Novah", 999999.99, 0.1);
		//System.out.println(newSalesperson);
		
		//Customer newCustomer = new Customer("Steely Dan", 1495.25, (short)350, false, starterList);
		
		Vehicle vehicle1 = new Vehicle("Dodge", "RAM", (short)2013, "Pickup", 49999.99, "Blue", "Gasoline");
		Vehicle vehicle2 = new Vehicle("Toyota", "Corolla", (short)2016, "Sedan", 19999.99, "Grey", "Gasoline");
		Vehicle vehicle3 = new Vehicle("Kia", "Soul", (short)2015, "Compact", 15999.99, "Blue", "Gasoline");
		
		LinkedList<Vehicle> startingInventory = new LinkedList<Vehicle>();
		startingInventory.add(vehicle1);
		startingInventory.add(vehicle2);
		startingInventory.add(vehicle3);
		
		Dealership dealership1 = new Dealership("Bikini Bottom", "Under the Sea", startingInventory, 20000000.00);
		
		System.out.println("Our dealership to start:");
		System.out.println(dealership1);
		
		Salesperson mickey = new Salesperson("Mickey Rouse", 56000.00, 0.5);
		
		System.out.println("Our salesperson to start:");
		System.out.println(mickey);
		
		Customer krabs = new Customer("Mr. Krabs", 38000.00, (short)750, true, null);
		
		System.out.println("Our customer to start:");
		System.out.println(krabs);
		
		krabs.buy(vehicle3, dealership1, mickey);
		
		System.out.println(krabs.getCollection());
		
	}

}
