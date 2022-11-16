package com.skillstorm;

public class MethodsAndOperationsExamples {
	
	public static void main(String[] args) {
		//uncomment to run
//		makeCookies();
//		int numberOfCookiesIWant = 6;
//		eatCookies(numberOfCookiesIWant);
		bikeToLibrary();
		
	}
	/////////////////////////////////////////////////////////////////////
	
	///// Example 1: Making Cookies
	
	/////////////////////////////////////////////////////////////////////
	public static void makeCookies() {
		System.out.println("Get the ingeredients for your cookies.");
		System.out.println("Mix the ingredients together.");
		bakeCookies();
	}
	
	public static void bakeCookies() {
		System.out.println("Put the cookies in the oven for 12 minutes.");
		System.out.println("Take the cookies out and let them cool before eating.");
		
	}
	
	public static void eatCookies (int numOfCookies) {
		System.out.println("I ate " + numOfCookies + " cookies.");
		
	}
	/////////////////////////////////////////////////////////////////////
	
	//// Example 2: Bike to the Library
	
	////////////////////////////////////////////////////////////////////
	
	// Only bike to the library 
	public static void bikeToLibrary() {
		float inchesOfRain = 1;
		int time = 1200;
		if (!isItRaining(inchesOfRain) && isLibraryOpen(time)) {
			System.out.println("Biking to the library.");
		} else {
			System.out.println("Can't bike to the library.");
		}
		
		
	}
	
	// isItRaining takes in a float
	//  -- in Java float can store an int, byte, short, but not double
	
	/*
	 * Returns true if it is "raining"
	 * returns false if it is "clear" or "some other descriptor we'll return false
	 */
	public static boolean isItRaining(float inchesOfRain){
		if (inchesOfRain > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Returns true if library is open and false if library is closed
	 * Takes in the current time as an int in military time
	 */
	
	public static boolean isLibraryOpen(int time){
	//the library is open at 0800 hours
		boolean hasOpened = time >= 800;
	//the library is closed at 1700
		boolean hasntClosed = time < 1700;
		
	//	if (800 <= time < 1700)
	//	return true if both conditions evaluate to true
		if (hasOpened && hasntClosed) {
			return true;
		} else {
			return false;
		}
		//shorthand is
		//return hasOpened && hasntClosed;
	}
	
	
}
