package com.skillstorm;

public class ArraysReview {
	public static void main(String[] args) {
		
		
		int[] myNumbers;
		myNumbers = new int[3];
		
		
		
		
		for (int i = 0; i < myNumbers.length – 1; i++) {
			myNumbers *= 2;
		}
		
		int counter = 0;
		while (counter < myNumbers.length){
			counter++;
		}


	}
	
	private static void print(int[] myNumbers) {
		for (int number : myNumbers) {
			System.out.println(number);
		}
	}
}
