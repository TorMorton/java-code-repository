package com.skillstorm;

public class ControlFlowAndMethods {

	public static void main(String[] args) {
		System.out.println("This is my main method.");
		
		System.out.println("It is awesome!");

		otherMethod(30, "Park", 10000L);
	}
	
	public static void otherMethod(int numOfPeople, String location, long someNumber) {
		System.out.println(numOfPeople + " are at the " + location);
		
		System.out.println("This is my other method.");
		
		System.out.println("It is really cool!");
		
		anotherMethod();
		System.out.println(" ===== I just ran anotherMethod");
		System.out.println(" ----- otherMethod is now ending");
	}
	public static void anotherMethod() {
		
		System.out.println("This is my another method.");
		
		System.out.println("It is really really cool!");
	}

} //end of the class, nothing outside of here
