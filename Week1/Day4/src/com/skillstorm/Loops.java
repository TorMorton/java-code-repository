package com.skillstorm;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		/*
		 * What is a loop?
		 * 
		 * Loops are just blocks of code that will continuously execute so long as their condition is met
		 * 
		 * Similar to an if statement with the conditions
		 * 
		 * Loop process
		 * 
		 * So long as the boolean condition is true, the following block of code will be executed. Once that block
		 * finishes execution, the boolean condition is rechecked. If it is true, run the block again and so on
		 * If false, code does not execute and program proceeds normally
		 * 
		 */

		if(true) {
		//Runs this code
		}
		System.out.println("hello"); // This will always happen
		
		/*
		 * Different types of loops
		 * 
		 * while - while something is true (positive bank balance ex)
		 * for - use for reading and writing to a list of data
		 * do-while - hardly used
		 * for-each - reading through a list of data and doing something with the data (don't use to edit)
		 * 
		 */
		
		//While loop, don't write while true loop or it continues forever
		//while (2 == 2) {
		//	System.out.println("Inside while loop.");
		//}
		
		int count = 0;
		while(count < 5) {
			System.out.println("The value of count is: " + count);
			count++;
			//Recheck the boolean condition with the new value of count
		}
		System.out.println("Finished Loop!");
		System.out.println("The final value of count is: " + count);
		System.out.println();
		//None of this code after the while loop will ever run if it is always true
		
		
		String[] fruits = {"Apple", "Pear", "Orange", "Plum", "Lemon", "Mango", "Strawberry"};
		
		//Use a while loop to iterate over my array
		int index = 0;
		while (index < fruits.length) {
			System.out.println("The fruit at index " + index + " is: " + fruits[index]);
			index++;
		}
		
		System.out.println();
		
		//For Loops
		
		//Benefit of for loops is for iterating over something for a given amount
		
		//Syntax of a for loop
		// for (counter initialization; condition; ) {}
		
		for (int i = 0; i < fruits.length; i++) {
			//Hit the bottom, do i++
		}
			
		
		//Foreach loop
		//Foreach loops do not come with an index
		//For each fruit in the fruits array
		
		for (String bag : fruits) {
			System.out.println(bag);
			bag = "Apple"; //Doesn't actuall change the value in the array
		}
		
		System.out.println();
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//Do while loop
		
		//Similar to a while loop
		
		do {
			System.out.println("Inside a do-while loop");
		} while (false);
		
		
		Scanner scan = new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("What is your age?");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.println("You are " + age + " years old!");
			
			System.out.println("Do you want to continue Y/N");
			answer = scan.nextLine();
		} while(answer.equals("y") || answer.equals("Y") || answer.equals("Yes") || answer.equals("yes"));
		
		System.out.println("Thanks for playing!");
		
		scan.close();
	}
}