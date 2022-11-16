package com.skillstorm;

public class LambdaPractice {

	/*
	 * What is functional programming?
	 * 1. Functions are "first class"
	 * - I can treat a function like any other variable type
	 * 	-- I can return a function from a method
	 * 	-- I can pass in a function as a parameter
	 * 
	 * 2. "Pure" functions
	 * - no side effects
	 * 	-- mutating an object reference passed in or changing state of your application program -- LEAVE EVERYTHING AS YOU FOUND IT
	 * 
	 * 
	 */
	
	
	// Examples of PURE functions
	// is this "pure"
	int b;
	public static int add(int a) {
		return a + b;
	}
	// add(1) == 4
	// in the future if b = 1
	// add(1) == 2
	
	
	// is this "pure"
	public static int add(int a, int b) { // no side effects
		return a + b;
	}
	// add(1, 1) == 2
	// class b can change but my function always returns 2 for add(1, 1);
	public static int addAAndOne(int a) { // not pure if relies on outside states
		return a + ++b; 
	}
	
	// is this pure?
	public static int addAAndOneV2(int a) { // not pure bc changes based on b, no side-effects but deterministic? no
		return a + (1 + b);
	}
	
	final int stuff; 
	
	public LambdaPractice() {
		stuff = 1;
	}
	
	public int addStuff(int a) { // IS THIS A PURE METHOD? -- if we are talking about within an object oriented situation
		return a + this.stuff;
	}
	
	// for a given instance
	public static void main(String[] args) {
		LambdaPractice myPractice = new LambdaPractice(1);
		myPractice.addStuff(1);
		myPractice.addStuff(1); // I'll always get the same result
	}
	
	
	
	
	public static int[] doStuff(int[] nums, Action someCalculation) {
		int[] newArray = new int[nums.length];
		for(int i; i < nums.length; i++) {
			newArray[i] = someCalculation(nums[i]);
		}
		return newArray;
	}
	
	
	
	
	
	
	/*
	 * History of Java
	 * 
	 * - it did NOT support functional programming
	 * - Java 8
	 * 
	 */
	
	
	/*
	 * What is a lambda?
	 * - a function that you can hand to a function
	 * 
	 * Also known as
	 * - lambda function
	 * - anonymous function -- no method signature when writing lambdas so no name declared
	 * - arrow function -- syntax we us is an -> 
	 */
	
	
	
	/*
	 * Syntax Rules
	 * 
	 * General Structure
	 * Ex. 1 Hello world
	 * () -> System.out.println("Hello world!");
	 * 
	 * () -- parenthesis are where parameters go
	 * -> -- arrow indicates where method body starts
	 * the rest == what code is gonna get run up to the first semicolon ;
	 * 
	 * 
	 * Ex 2: multiple parameters
	 * (name1, name2) -> System.out.println("Hello " + name1 + ", I am " + name2);
	 * 
	 * () == parameters DONT declare a type
	 * 
	 * Ex 3:
	 * name -> System.out.println("Hi there " + name + "!");
	 * 
	 * RULE -- with ONE parameter ONLT situation can exclude the () for the parameter
	 * 
	 * Ex. 4 more complicated body
	 * (name 1, name 2) -> { -- just like if statements, more than one line body needs curly braces
	 * 		System.out.println(name1);
	 * 		System.out.println(name2);
	 * 		return name1 + " " + name2;
	 * }
	 * 
	 * Ex 5: returning a value --- SPECIAL CASE
	 * (a, b) -> a + b; --- IMPORTANT the "return" is implied 
	 * 
	 * Ex 5b:
	 * a -> a; // return is implied, takes in one value and returns that value
	 * 
	 * 
	 * Ex 6: BE CAREFUL
	 * a -> { -- Java ignores how many lines and doesn't realize this is one line I want returned
	 * 		a.toUppercase(); // return is NOT implied with the curly braces
	 * }
	 * 
	 */
	
	/*
	 * Examples: Valid or Not Lambda Syntax?
	 * 
	 * 1. () -> 1; -- good use of parentheses, good use of arrow, good use of implied return
	 * 
	 * 2. a, b -> a + b; -- needs parenthesis bc more than one parameter
	 * 		(a, b) -> a + b;
	 * 3. (a, b, c) -> {
	 * 			a = a + 1;
	 * 			b = b + 2;
	 * 			c = c + 3;
	 * 			a + b + c; -- needs to specify return bc multiline body of method
	 * 
	 * 4. -> "Hello"; -- bad, needs ()
	 * FIX () -> "Hello";
	 */
	
	
	
}
