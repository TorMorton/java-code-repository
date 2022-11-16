package com.skillstorm.customexceptions;

public class MyCheckedException extends Exception{

	public MyCheckedException() {
		super();
	}
	
	//If I add this constructor, do I still have a default constructor
	// no
	public MyCheckedException(String message) {
		//to set the message property I can call the super constructor
		super(message);
	}
	
	// A constructor that takes in a message and a cause
	public MyCheckedException(String message, Throwable cause) {
		//set the message and cause I can call the super constructor
		super(message, cause);
	}
	
	public MyCheckedException(String message, Throwable cause, boolean suppressable, boolean writable) {
		super(message, cause, suppressable, writable);
	}
}
