//package declaration
package com.skillstorm;

//class declaration
public class DataTypes {

	//main method
	public static void main(String[] args) {
		
		/*Javascript, for ex, is loosely typed
		 * you don't have to tell it what kind of variable it is when declaring it
		 * it figures it out on its own
		 * 
		 * Advantage - flexibility, ease of setup
		 * Disadvantage - compiler doesn't know there's an issue until too late
		 * 
		 * Java is strongly typed
		 * must declare what kind of data is assigned to a variable when you declare the variable
		 * 
		 * Advantages/Disadvantages = the opposite of above
		 * 
		 * 
		 * Primitive data types in Java
		 * 	not objects (one exception)
		 *  
		 * Whole number Data Types
		 *  
		 * int (integer) - -2^31 through 2^31-1 (32 bits)
		 * byte - -2^7 through 2^7-1 (8 bits)
		 * short - -2^15 through 2^15-1 (16 bits)
		 * long - -2^63 through 2^63-1 (64 bits)
		 * 
		 * Decimal/Fractional Data Types
		 * 
		 * float - 32 bits including decimals
		 * double - 64 bits including decimals
		 * 
		 * True/False Data Type
		 * 
		 * boolean - two values, true or false
		 * 
		 * Alphanumeric Data Types
		 * 
		 * char - single alphanumeric character
		 * String (only one considered to be an object, hence the capital) - series of alphanumeric characters
		 */
		
		//int - reference type - what kind of data is in this variable
		//myNumber - variable name, camel case, first letter not capitalized, capital at each new word
		//34 - value assigned to variable
		int myNumber = 34;
		
		System.out.println(myNumber);

		byte myByte = 23;
		
		System.out.println(myByte);
		
		short myShort = 4988;
		
		System.out.println(myShort);
		
		long myLong = 33299992;
		
		System.out.println(myLong);
		
		double myDouble = 3432.2;
		
		System.out.println(myDouble);
		
		//remember f at end or it won't identify as a float
		float myFloat = 45.32f;
		
		System.out.println(myFloat);
		
		int myOtherInt = 3;
		
		System.out.println(myOtherInt);
		
		myOtherInt = myOtherInt/2;
		
		System.out.println(myOtherInt);
		
		double first = 3;
		double second = 5;
		double third = 7;
		System.out.println(first/2 + second/3 + third/4);
		
		boolean myBoolean = true;
		boolean myOtherBoolean = false;
		boolean myOtherOtherBoolean = (myBoolean || myOtherBoolean);
		System.out.println(myBoolean);
		System.out.println(myOtherBoolean);
		System.out.println(myOtherOtherBoolean);
		
		char myChar = 'A';
		System.out.println(myChar);
		
		//char can be incremented to sequentially move through letters/characters
		++myChar;
		System.out.println(myChar);
		
		//remember to use capital-S String as reference type, because String is an object
		String myString = "Hey! It's a me, my String!";
		System.out.println(myString);
		//can use a + to join them
		String myOtherString = "...no kidding.";
		System.out.println(myString + myOtherString);
	}

}
