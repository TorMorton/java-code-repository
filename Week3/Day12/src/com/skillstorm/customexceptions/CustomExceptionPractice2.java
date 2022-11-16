package com.skillstorm.customexceptions;

public class CustomExceptionPractice2 {

	public static void main(String[] args) {
		//the compiler doesn't force me to catch or declare the exception
		// bc it IS-A RuntimeException
		throw new MyUncheckedException();
	}
	
	
}
