package com.skillstorm;

public class ActionExample {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		// SLOW METHOD
		// 1) declare functional interface
		// 2) declare class implemnting it
		// 2b) define method
		// 3) create an instance
		doStuff(nums, new DoubleAction());
		doStuff(nums, (num) -> num * 2);
		int[] result = doStuff(nums, (a) -> {return a * 2;});
		for (int n : nums) {
			System.out.println(n + " ");
		}
		
		// Define a different action
		// squared
		Action square = () -> 

	}
	
	public static int[] doStuff(int[] nums, Action someCalculation) {
		int[] newArray = new int[nums.length];
		for(int i; i < nums.length; i++) {
			newArray[i] = someCalculation.act(nums[i]);
		}
		return newArray;
	}

}
