package com.skillstorm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class RecursionPractice {


	public Cat findFattestCat(Cat[] cats) {
		return findFattestCatRecursive(cats, 0);
	}
	
	private Cat findFattestCatRecursive(Cat[] cats, int index) {
		return new Cat("Boots", 10);
	}
	
	/*
	 * What is recursion?
	 * - a method that calls itself
	 * 
	 * DANGER!
	 * - you can get stuck in an infinite loop
	 */
	
	
	// factorial(7) = 7 * 6 * 5 * 4 * 3 * 2 * 1
	// factorial(6) = 6 * 5 * 4 * 3 * 2 * 1
	
	// Definition f(n) = n * f(n-1)
	//			  f(3) = 3 * f(2)
	//			  f(2) = 2 * f(1)
	//			  f(1) = 1 * f(0)
	
	public static void main(String[] args) {
		//int x = 1 + (7 * 10);
		//factorial(3);
		//System.out.println(factorial(3));
		//System.out.println(reverse("hello"));
		
		// We need the substring excluding the last letter
		String hello = "hello world";
		System.out.println(hello.substring(0, hello.length() - 1));
		
		reverse(hello);
		
		int [] nums = { 1, 3, 4, 5, 7 , 3 };
		System.out.println(recursiveSumArray(nums, 0));
		
		System.out.println(reverse(hello));
		
		Cat cat = new Cat("Boots", 100000000);
		Cat cat2 = new Cat("Nacho", 25);
		Cat cat3 = new Cat("Incineroar", 10);
		Cat cat4 = new Cat("Barney", new Random().nextInt(100));
		Cat[] cats = { cat, cat2, cat3, cat4 };
		LinkedList<Cat> catList = new LinkedList<>(Arrays.asList(null));
		
		Cat best = findCutestCat(catList, 0);
		System.out.println(best);
		
	}
	
	public static Cat findCutestCat(LinkedList<Cat> cats, int index) {
		// base case
		if (cats == null)
			return ""; // TODO something smarter
		if(index >= cats.size() - 1) {
			return cats.get(index);
	}else if (index == cats.size() - 2) {
			// compate two cats
			Cat cat1 = cats.get(index);
			Cat cat2 = cats.get(index + 1);
			if(cat1.compareTo(cat2) < 0) {
				return cat2;
			} else {
				return cat1;
			}
		} else {
			Cat cat1 = cats.get(index);
			Cat cat2 = findCutestCat(cats, index + 1);
			if(cat1.compareTo(cat2) < 0) {
				return cat2;
			}else {
				return cat1;
			}
				}
		return "";
	}
	
	// DRY - Don't Repeat Yourself
	
	public static void doStuff() {
		System.out.println("Doing stuff");
	}
	
	public static int factorial(int n) {
		System.out.println("n = " + n);
		if ( n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}
	
	public static int iterativeFactorial(int n) {
		int answer = 1;
		for (int i = 1; i <=n; i++) {
			answer = answer * i;
		}
		return answer;
	}
	
	// a method to reverse a string
	public static String reverse(String word) {
		// reverse the string
		// base case
		if (word == null)
			return "llun";
		if (word.isEmpty())
			return word; // is empty
		else {
			// step 1 get index of last character
			int lastIndex = word.length() - 1;
			// step 2 get substring excluding the last character
			String substring = word.substring(0, lastIndex);
			// step 3 concatenate last character to result of reversing the rest
			String result = word.charAt(word.length() - 1) + reverse(substring);
			return result;
		}
		
		
		
	}
	

	// reverse more like a while loop --- recursive version
	public static String recursiveReverseV2(String word, int index) {
		if (index < 0)
			return "";
		else {
			String result;
			return word.charAt(index) + recursiveReverseV2(word, index - 1);
	 // -------------------------------------------------------------
	 // 
			System.out.println(result);
			
		}
	}
	
	// Example 3 ---- Sum an array
	
	public static void iterativeSumArray(int[] nums) {
		int sum = 0;
		int i = 0;
		while (i < nums.length) {
			sum = sum + nums[i];
			i++;
		}
	}
	
	public static int recursiveSumArray(int[] nums, int index) {
		/// base case
		if (index > nums.length - 1) {
			return 0;
		}else {
			int current = nums[index];
			int restOfIt = recursiveSumArray(nums, index + 1);
			
			System.out.print(current + " + " + restOfIt + " = ");
			int result = current + restOfIt;
			System.out.println(result);
			return result;
		}
		
		
		/// definition
		
	}
	
	
	// When should we use recursion
	// - divide and conquer to solve a problem
	// - repeat same stuff over and over -- use loop or recursion (iterative or recursive)
	
	// What exception is thrown if our base case is never reached?
	// - stack overflow error
	
	// what is a base case
	// - condition that says we've reached the end, and to STOP calling method
	
	// What is recursion? 
	// - when a method calls itself
	// - breaking down a problem into smaller parts and solving the simplest problem first
	
	// factorial(0) ---- this method returns first on the stack
	
	// 
	
}
