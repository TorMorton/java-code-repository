package com.skillstorm;

public class Memoization {

	/*
	 * What is memoization? -- memorizing (aka caching) the values to avoid re-calculating them over and over
	 */
	
	public static Long[] fibs = new Long[100];
	
	// initialize the values we know from the definition
	static { // this is OK bc it runs when the class loads
		fibs[0] = 0L; // long literal needs L
		fibs[1] = 1L;
	}
	
	
	
	// Memoized version
	public static long fibonacciMemoized(int n) {
		// BASE CASE
		if (n < 2) {
			return n;
		}
		// RECURSION
		long fibNum1; 
		long fibNum2;
		if (fibs[n - 1] == null) { // so I have n-1 calculated
			// make recursive call
			fibNum1 = fibonacciMemoized(n - 1);
		}else {
			fibNum1 = fibs[n - 1];
		}
		
		if (fibs[n - 2] == null) { // do I have n - 2 calculated
			// check if HAVE already before calling again
			fibNum2 = fibonacciMemoized(n - 2);
		}else {
			fibNum2 = fibs[n - 2];
		}
		fibs[n] = fibNum1 + fibNum2;
		return fibs[n];
	}
	
	
	
	
	
	
	// Recursive fibonacci code from yesterday
	
	public static long fibonacci(long n) {
		// BASE CASE
		if (n < 2) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
		
	}
		
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long result = fibonacciMemoized(46);
		long endTime = System.nanoTime();
		long seconds = (endTime - startTime) / 1000000000;
		System.out.println("result was " + result);
		System.out.println("time taken was " + (endTime - startTime) + " nano seconds!");
		System.out.println("time taken was " + seconds + " seconds.");
	
	}
}

