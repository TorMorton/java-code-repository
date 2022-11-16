package com.skillstorm;

import com.skillstorm.fun.Shoe;

public class Encapsulation {

	public static void main(String[] args) {
		
		/*
		 * ENCAPSULATION
		 * 
		 * Two pieces;
		 * 
		 * -- wrapping properties and methods into a class
		 * -- what is it like, what can it do?
		 * 
		 * We've been doing this already, when creating classes, giving them instance variables and methods
		 * 
		 * Access Modifiers
		 * 
		 * DOES NOT APPLY TO LOCAL VARIABLES (variables within methods)
		 * 
		 * public
		 *  -- any class, anywhere can access this property or method
		 *  -- public int age = 12;
		 *  -- Person doug = new Person()
		 *  	can change doug's age by saying doug.age = 80; from anywhere
		 *  
		 * protected
		 *  -- any class within the same package and any subclass, even if it's in a different package
		 *  -- protected int age = 12;
		 *  -- Car myCar = new Car();
		 *  	I can change myCar's color from Mustang, even if it were in a different package because Mustang is a subclass of Car
		 *  -- CANNOT create a new instance of the superclass in the subclass and expect to e able to access protected variables/methods
		 *  -- can ONLY access the protected variables/methods of a specific Object's specific parent Object
		 *  
		 * default (nothing)
		 *  -- any class within the same package can access this property or method
		 *  -- int age = 12;
		 * 
		 * private
		 *  -- only the class itself can access this property or method
		 *  -- private int age = 12;
		 * 
		 * 
		 * 
		 */
		
		Shoe myShoe = new Shoe();
		System.out.println(myShoe);
		
		System.out.println(myShoe.brand);
		
		System.out.println();
		
		Computer myComputer = new Computer();
		
		System.out.println(myComputer.toString());
		
		Computer myOtherComputer = new Computer((byte) 16, "4TB", false, "Windows", "Tesla");
		System.out.println(myOtherComputer.toString());
		
		System.out.println();
		
		System.out.println(myOtherComputer.getRamAmount());
		System.out.println(myOtherComputer.getGpuBrand());
		System.out.println(myOtherComputer.getOs());
		System.out.println(myOtherComputer.getStorageAmount());
		System.out.println(myOtherComputer.isLaptop());
		
		System.out.println();
		System.out.println("Setting a value, then getting it:");
		myOtherComputer.setRamAmount((byte)32);
		myOtherComputer.setStorageAmount("8TB");
		myOtherComputer.setLaptop(true);
		myOtherComputer.setOs("Mac");
		myOtherComputer.setGpuBrand("NVIDIA");

		System.out.println(myOtherComputer.getRamAmount());
		System.out.println(myOtherComputer.getGpuBrand());
		System.out.println(myOtherComputer.getOs());
		System.out.println(myOtherComputer.getStorageAmount());
		System.out.println(myOtherComputer.isLaptop());
	}

}
