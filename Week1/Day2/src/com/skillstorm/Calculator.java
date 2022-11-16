package com.skillstorm;

public class Calculator {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 2;
		
		System.out.println("Our original numbers are " + a + " and " + b);
		System.out.println();
		
		willAdd(a, b);
		willSubtract(a, b);
		willMultiply(a,b);
		willDivide(a,b);
	}
	
	public static void willAdd(int a, int b) {
		System.out.println("These numbers added equal " + (a + b));
	}
	
	public static void willSubtract(int a, int b) {
		System.out.println("These numbers subtracted equal " + (a - b));
	}

	public static void willMultiply(int a, int b) {
		System.out.println("These numbers multiplied equal " + (a * b));
	}
	
	public static void willDivide(double a, double b) {
		if (b == 0) {
		System.out.println("Cannot divide by 0");
		}else {
		System.out.println("These numbers divided equal " + (a / b));
		}
	}
}
