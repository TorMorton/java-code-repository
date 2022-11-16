package com.skillstorm;

import java.util.Scanner;

public class BooleanUtilityFunction {

	public static void main(String[] args) {
		// This class will have max. and min. temperatures that will turn on/off heat or A/C

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please provide the current temperature in Fahrenheit: ");
		int currentTemp = scanner.nextInt();
	
		int myMaxTemp = 77;
		int myMinTemp = 66;

		boolean isHot = (currentTemp >= myMaxTemp);
		boolean isCold = (currentTemp <= myMinTemp);
		
		System.out.println();
		
		//Could also put (currentTemp >= myMaxTemp)/(currentTemp <= myMinTemp) into the if statement
		//Using assigned booleans for purpose of exercise being "Boolean Utility Function" 
		
		if (isHot) {
			System.out.println("The current temperature is " + currentTemp + " degrees Fahrenheit. It is warm.");
			System.out.println("Air conditioning turned on.");
			System.out.println("Heat is off.");
		}else if (isCold) {
			System.out.println("The current temperature is " + currentTemp + " degrees Fahrenheit. It is cold.");
			System.out.println("Heat turned on.");
			System.out.println("Air conditioning is off.");
		}else {
			System.out.println(currentTemp + " is an acceptable temperature. Neither heat nor A/C required.");
		}
		
		scanner.close();
		
	}
	

}
