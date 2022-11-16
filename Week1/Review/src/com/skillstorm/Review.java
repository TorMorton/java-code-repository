package com.skillstorm;

public class Review {

	public static void main(String[] args) {
		int one = 1;
		int two = 2;
		
		String[] names = {"Joe", "Mary", "Zulnak"};
		int[] numbers = {12, 10, 2, 13, 45, 50};
		
		//LOOPS review
		
		/*
		 * while
		 * for
		 * for each {enhanced for}
		 * do/while
		 */
		
		// while (condition) {
		//  code
		// }
		
		// checks the condition BEFORE running the first time
		while (one == two) {
			System.out.println("Forever....");
		}
		
		/*
		 * do {
		 * some code
		 * } while (condition)
		 */
		
		do {
			System.out.println("Code to do...");
		} while (one == two);
		
		/* for each
		 * for (data type variable name : collection name) {
		 *  some code
		 *  }
		 */
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println();
		
		/*
		 * for (variable value; condition; what to do after each loop) {
		 * some code
		 * }
		 */
		
		System.out.println("For:");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		System.out.println("For backwards: ");
		for (int i = 2; i >= 0; i--) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		System.out.println("For [numbers]: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		// Boolean structure
		
		/*
		 * if (condition) {
		 *  does this code if condition is true
		 *  }
		 *  
		 * if (condition) {
		 * 	does this code if condition is true
		 *  } else {
		 *   does this code if condition is false
		 *   }
		 *   
		 * if (condition) {
		 * 	does this code if condition is true
		 * } else if (condition) {
		 *   does this code if another condition is true
		 *   } else {
		 *    does this code if condition is false
		 *   }
		 * 
		 * if (condition) {
		 * 	does this code if condition is true
		 * 		if (other condition) {
		 * 			does this code if both conditions are true
		 * 		}
		 * 	also does this code if condition is true
		 *  }
		 * 
		 * 
		 */
		
	}

}
