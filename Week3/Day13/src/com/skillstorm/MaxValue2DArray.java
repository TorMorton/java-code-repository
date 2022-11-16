package com.skillstorm;

public class MaxValue2DArray {
	
	public static void main(String[] args) {
		
		int[][] numbers = {{ 93, 106, 8, 45, 2},
							{ 5, 63, 101, 3} ,
							{ 0, 9, 22, 32}};
		
		System.out.println("The max number of this array is " + findMax(numbers));
		System.out.println("The min number of this array is " + findMin(numbers));
		
	}
	
	
	public static int findMax(int[][] numbers) {
		int max = 0;
		
		
		for(int i = 0; i < numbers.length; i++) {
			  for(int j = 0; j < numbers[i].length; j++) {
				  if(numbers[i][j] >= max) {
					  max = numbers[i][j];
			  }
				 
		  }
		
		}  return max;
	}
	
	public static int findMin(int[][] numbers) {
		int min = findMax(numbers);
		
		for(int i = 0; i < numbers.length; i++) {
			  for(int j = 0; j < numbers[i].length; j++) {
				  if(numbers[i][j] < min) {
					  min = numbers[i][j];
			  }
				 
		  }
		
		}  return min;
	
	
	}
	
	
}
