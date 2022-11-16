package com.skillstorm;

public class MaxValueOfArray {
	
	public static void main(String[] args) {
	
		
		int[] numArray = {61, 32, 21, 81, 9, 92, 10, 46, 8, 91};
		int maxNumber = numArray[0];
		
		System.out.println("The values in this array are: ");
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");

			
			if (numArray[i] > maxNumber) {
				maxNumber = numArray[i];	
			} 
		}
		
		System.out.println();
		
		System.out.println("The maximum value in this array is: " + maxNumber);
	}

}
