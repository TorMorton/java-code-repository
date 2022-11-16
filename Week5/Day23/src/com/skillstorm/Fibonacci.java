package com.skillstorm;

public class Fibonacci {
	
	public static int fibonacci(int n) {
		
		if ((n == 0) || (n == 1)) {
			return n;
		} else if (n > 1){
			return  fibonacci(n - 1) + fibonacci(n - 2);
		} else
			return 0;
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Your fibonacci number is " + fibonacci(10));
	}

}
