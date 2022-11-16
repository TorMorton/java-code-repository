package com.skillstorm;

public class TwoDArrays {
	
	public static void main(String[] args) {
		//rectangular array
		int[][] numbers = { {1,2}, {3,4}, {5,6} }; //literals
		//jagged array
		int[][] numbers2 = { {1, 2, 5, 10}, 
								{3,4}, 
								{5,6} };
		
		
		//2D also have s et length
		int[][] example = new int[3][8];
		//
		//	number of inner arrays
		int[][] example2 = new int[3][]; // { {}. {}. {} }
		//int[][] example3 = new int[][3];
		
		
		// ---------------------------------------------------------------
		//tangent on other ways to initialize arrays or arrays
		
		String[] team1 = { "Aung", "Brittany", "Brian" };
		String[] team2 = { "Ernest", "Brandon", "Aaliyah" };
		String[] team3 = { "Jon", "Erica", "Miles" };
		
		String[][] teams = {team1, team2, team3};
		
		
		Object[] objects = {team1, new TwoDArrays(), null};// an array can hold different sub types
							//------------------------------------------------------------
		
		Object[][] different = {numbers, numbers2, teams, team1};
		
		System.out.print(numbers2[0][0] + " ");
		System.out.print(numbers2[0][1] + " ");
		System.out.print(numbers2[0][2] + " ");
		System.out.println(numbers2[0][3] + " ");
	
		
		System.out.print(numbers2[1][0] + " ");
		System.out.println(numbers2[1][1] + " ");

		System.out.print(numbers2[2][0] + " ");
		System.out.println(numbers2[2][1] + " ");
		
		int[] innerArray1 = numbers2[0]; // grabs the whole inner array
		int[] innerArray2 = numbers2[1];
		int[] innerArray3 = numbers2[2];
		
		System.out.println();
		
		for (int i = 0; i < innerArray1.length; i++) {
			System.out.print(innerArray1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < innerArray2.length; i++) {
			System.out.print(innerArray2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < innerArray3.length; i++) {
			System.out.print(innerArray3[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("numbers2.length = " + numbers2.length);
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println("numbers2[" + i + "].length = " + numbers2[i].length);
			for (int j = 0; j < numbers2[i].length; j++) {
				System.out.println(numbers2[i][j]);
			}
		}
		System.out.println();
		// prettier print
		prettyPrint(numbers2);
		
		System.out.println();
		// LEAST VERBOSE VERSION
		
		addElements(numbers2);
		
		System.out.println();
		
		System.out.println(count(numbers2));
		System.out.println(count(numbers));
		
		System.out.println();
		
		System.out.println(average(numbers2));
		System.out.println(average(numbers));
		
		System.out.println();
		
		String[][] people = {{ "Joe", "Kenny", "Nita", "Naruto"},
							 { "Boots", "Waldo" },
							 { "Jon", "Erica", "Miles"}};
		
		int[] result = whereIsWaldo(people);
		System.out.println("row = " + result[0]);
		System.out.println("col = " + result[1]);
		
		
		}
		
		
	
	
	//helper function
	
	private static void prettyPrint(int[][] numbers) {
	
		for (int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static int addElements(int[][] numbers) {
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];
				System.out.println("The current sum is " + sum);
			}
		}
		return sum;
	}
	
	private static int count(int[][] numbers) {
		int result = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				result++;
			}
		}
		return result;
	}
	
	public static double average(int[][] numbers) {
		
		double result;
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];
				count++;
			}
		}
		result = (double)sum / count;
		return result;
		
	}
	
	// this will return the row and column like { 0, 0 }
	public static int[] whereIsWaldo (String[][] people) {
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < people.length; i++) {
			for(int j = 0; j < people[i].length; j++) {
				if("Waldo".equals(people[i][j])) {
					row = i;
					col = j;
					int[] result = { row, col };
					return result;
				}
			}
			return null;
		}
	}

}
