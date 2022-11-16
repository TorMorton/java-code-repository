package com.skillstorm;

public class OneMoreRecursionEx {

	public static void main(String[] args) {
		countDown(10);
	}
	
	public static void countDown(int t) {
		if (t <= 0) {
			System.out.println("Blast off");
		} else {
			System.out.println(t + " ");
			countDown(t - 1);
		}
	}
}
