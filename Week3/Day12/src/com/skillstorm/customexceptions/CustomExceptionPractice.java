package com.skillstorm.customexceptions;

public class CustomExceptionPractice{

	public static void main(String[] args){
		try {
			doStuff();
		}catch (MyCheckedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of main");
		//you do not inherit constructors
		MyCheckedException e = new MyCheckedException("something");
		// what does the enableSuppression and writeableToStack default to?
		
	}
	
	public static void doStuff() throws MyCheckedException{
		//To throw a custom exception
				// we need to create a class
				//		-- the convention to name the class with "Exception" at the end of the name
				throw new MyCheckedException("Something unexpected happened.");
	}
}
