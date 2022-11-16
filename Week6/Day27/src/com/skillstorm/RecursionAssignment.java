package com.skillstorm;

public class RecursionAssignment {
	
	
	public static int sum(int n) {
		if (n == 0) {
			return n;
		} else {
			return n + sum(n - 1);
		}
	}
	
	public static boolean containsLargerThan100(int[] nums, int index) {
		if (index > nums.length - 1) {
			return false;
		}else {
			if (nums[index] > 100) {
				return true;
			} else {
				return containsLargerThan100(nums, index + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(7));
		
		int [] nums = { 1, 33, 45, 33, 2 , 33 };
		
		System.out.println(containsLargerThan100(nums, 0));
		
		
	}
	
}
