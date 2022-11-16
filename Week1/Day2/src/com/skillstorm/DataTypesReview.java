package com.skillstorm;

public class DataTypesReview {

	public static void main(String[] args) {
		System.out.println("The MAX value of a double is " + Double.MAX_VALUE);
		System.out.println("The MIN value of a double is " + Double.MIN_VALUE);
		
		System.out.println("The MAX value of a double is " + Float.MAX_VALUE);
		System.out.println("The MIN value of a double is " + Float.MIN_VALUE);
		
		System.out.println();
		
		String s = "1" + 1;
		System.out.println(s); //String concatenation prints 11
		
		System.out.println("1" + 1 +1); //String concatenation prints out 111
		System.out.println("1" + (1+1));//String concatenation prints out 12
		
		System.out.println();
		
		// NOT BEST PRACTICE TO USE ONE LETTER/WORD NAMES FOR VARIABLES, BE DESCRIPTIVE
		
		int x = 4/5; //prints as integer 0
		System.out.println(x);
		
		double y = 4.0/5; //prints as double
		System.out.println(y);
		
		//Type Casting
		int z = (int)4.0 / 5;
		System.out.println(z);
		
		//can also 
		double a = (double)4 / 5;  
		System.out.println(a);
		
	}
}
