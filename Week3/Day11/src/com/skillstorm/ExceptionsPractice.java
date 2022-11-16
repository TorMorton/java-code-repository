package com.skillstorm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsPractice {
	
	//public static void main(String[] args) throws FileNotFoundException {
		
	public static void main(String[] args) {
			
		/*
		 * What is an exception?
		 * 
		 * An event that occurs unexpectedly, and interrupts the normal flow of execution
		 * 
		 * What are some we've seen
		 * -ArithmeticException - like divide by 0
		 * -IndexOutOfBounds - like accessing myArray[myArray.length]
		 * 
		 * Exception objects have certain properties
		 * -- it can have a type
		 * -- a cause
		 * -- supressable
		 * -- writeStackTrace
		 * 
		 * 
		 * 
		 */
		
		//Example 1:
		// System.out.println(1/0)
		
		//Example 2:
		//String[] myPets = new String[2];
		//System.out.println(myPets[2]);
		
		//Example 3:
		//String myCat = null;
		//System.out.println(myCat.length());
		
		//infinite loop
		//boolean stop = false;
		//while(!stop) {
		//	System.out.println("still going");
		//}
		
		//String[] someStuff = {};
		//main(someStuff); 
		
		// Example 4: Checked Exception -- must declare this using the "throws keyword"
		//								-- or handle the exception using a try-catch block
		//try {
	//		Scanner myScanner = new Scanner(new File("somefile.txt"));
		//} catch (FileNotFoundException e) {
		//	// TODO Auto-generated catch block
	//		e.printStackTrace();
		//}
		
		//Example 5: using a try-catch to continue code after the error is thrown
		//1. throw -- used to throw an exception
		//2. throws -- used to declare that the method might throw the exception
		
		//Examples of where we could use illegal argument exception
		// -- when a user hands in an invalid value
		try {
			divide(1,0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		System.out.println("End of main. Program terminating.");
		
	
	
	///////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////Afternoon Block/////////////////////////////////////////
	
	/*
	 * Finally block
	 * - a block that runs in both situations
	 * 	1. if the try block throws an exception and jumps to the catch block
	 * 	2. 
	 */
	
	/*
	 * Try-Catch
	 * vs
	 * If-Else
	 * -- ex. searching an array for a value that is not found returns -1
	 * 		this is using a special value to indicate to the user something went wrong
	 * -- try-catch will force user to handle the case
	 * 			- it helps the user identify earlier where the error in their logic is
	 */
	
	
	
	/*
	 * Multiple Catches
	 * and
	 * Multiple catch blocks:
	 * 
	 * 
	 * 
	 */
	
		try {
			throwRandomException();
		}catch(ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException e) {
		//some code
		}
		
		try {
			//something
			throwRandomException();
		}catch (ArithmeticException e) {
			//some code
			System.out.println("Are you bad at math");
		} catch (NullPointerException e) {
			//some code
			System.out.println("Nothing here");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Can't get that");
		}catch(Exception e) {
			System.out.println("Idk what happened");
		}
	
	
	}
	
	public static void divide(int a, int b) throws IllegalArgumentException{
		try {
			System.out.println(a + " / " + b + " = " + (a / b));
		} catch (ArithmeticException e) {
			//constructor
			// IllegalArgumentException (String message, Throwable cause)
			// constructs a new exception with the specified detail message and cause
			throw new IllegalArgumentException("Please enter a valid divisor.", e);
		}
		
	}
	
	public static void throwRandomException() {
		int someNumber = (int) Math.floor(Math.random() * 10);
		if (someNumber < 4) {
			throw new ArithmeticException();
		}else if (someNumber < 8) {
			throw new NullPointerException();
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

}
