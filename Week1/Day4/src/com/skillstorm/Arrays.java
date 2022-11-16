package com.skillstorm;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		 * Arrays in Java are primarily to store multiple values in a single variable
		 * 
		 * Key Things to Note:
		 *  - Fixed size, once defined cannot change, must be defined up front
		 *  - Need to know how big you'd like your array from the start
		 *  - Arrays are typed and must be homogeneous in terms of type
		 *  - Array are stored in memory contiguously
		 *  - Arrays are 0-indexed, start at 0, first element is at index zero
		 */
		
		// How to create an array
		// DataType[]
		
		int[] numbers;
		// Creates space in memory
		numbers = new int[5];
		
		System.out.println(numbers); //Memory address
		
		// In the numbers array, give me the value at index 0
		System.out.println(numbers[0]);
		
		numbers[0] = 1;
		numbers[4] = 200;
		numbers[2] = -535;
		// *numbers + 2
//numbers[5] = 200; //Throws a ArrayOutofBounds
		
		int[] moreNumbers = new int[10];
		moreNumbers[5] = 200;
		System.out.println(moreNumbers[5]);
		
		// We can easily get the size of the array by using 
		System.out.println("The length of moreNumbers is " + moreNumbers.length);
		
		//Getting the final element of an array
		System.out.println("The final element of the array is: " + moreNumbers[moreNumbers.length - 1]);
		
		char[] singleItemArray = new char[1];
		
		singleItemArray[0] = 'A';
		System.out.println("First element in the char array: " + singleItemArray[0]);
		System.out.println("Last element in the char array: " + singleItemArray[singleItemArray.length - 1]);
		
		/*
		 * REMEMBER:
		 * 
		 * 0 is for getting the first element of array
		 * arrayName.length - 1 for getting the last element of array
		 */
		//Shorthand
		//String[] fruits = new String[7];
		//fruits[0] = "Apple";
		//fruits[1] = "Pear";
		//					  0		  1			2		3		4		  5
		String[] fruits = {"Apple", "Pear", "Orange", "Plum", "Lemon", "Mango", "Strawberry"};
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println("Fruit at index " + i + " is " + fruits[i]);
		}
		
	}

}
