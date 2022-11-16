package com.skillstorm;

import java.util.Scanner;

//import java.util.Scanner; // imports Scanner from the java.util package to use here


public class Input {

	public static void main(String[] args) {
		
		/*
		 * There are 3 system channels in Java:
		 * 
		 * 1. System.out -- system output. This is standard output to display in console.
		 * 2. System.in -- system input. This is for getting input from the user.
		 * 3. System.err -- system error. Similar to system output, used for displaying error messages
		 */
		
//		System.out.println("This is my system output");
//		System.err.println("This is my system error");
		
		//Create a Scanner to scan out system input channel
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Please enter your first name: ");
//		String firstName = scanner.nextLine();
//		
//		System.out.println("Please enter your last name: ");
//		String lastName = scanner.nextLine();
		
//		System.out.println("Your name is: " + firstName + " " + lastName);
		
		System.out.println("Please input your GPA: ");
		double yourGPA = scanner.nextDouble(); //a string may make an exception
		System.out.println(yourGPA);
		
		//closes the scanner to prevent system leaks
		scanner.close();
		
	}
}
