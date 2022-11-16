package com.skillstorm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

public class UsefulUsesOfLambdas {

	//
	// built in for-each and how to use it
	
	public static void main(String[] args) {
		/*
		 * GOAL: Apply a method to EVERY element in a list (which we will convert to a stream)
		 * 
		 * 
		 */
		
		LinkedList<State> states3 = new LinkedList<>(Arrays.asList(new State("Georgia", 10000000, 59425), 
				new State("Alabama", 5040000, 52419), 
				new State("Florida", 21780000, 65758), 
				new State("Colorado", 5812000, 104185)));
		
		//  Step 1: convert to stream
		Stream<State> stateStream = states3.stream();
		// Step 2: Use java built-in .forEach(method) using our lambda
		// get the first two letters
		// capitalize them
		// print them out
		stateStream.forEach((state) -> {
			String name = state.getName();
			String abbreviation = name.substring(0,2);
			// char initialLetter = name.charAt(0); // only grabs one letter ata atime -- use substring for multiple
			// char secondLetter = name.charAt(1);
			abbreviation = abbreviation.toUpperCase();
			System.out.println(abbreviation);
		});
		
		// Example 2
		// for each will not mutate our list so save the result
		Stream<State> stateStreamAltered = stateStream.map((state) -> {
			String alteredName = state.getName().substring(0,2).toUpperCase();
			int population = state.getPopulation();
			int alteredSize = state.getSize();
			State alteredState = new State(alteredName, population, alteredSize);
			return alteredState;
		});
		
	}
	
}
