package com.skillstorm;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LambdaComparatorExamples {

	public static void main(String[] args) {
		/*
		 * Let's use a lambda instead of an instance of a Comparator class
		 */
		
		// Strings Example
		LinkedList<String> states = new LinkedList<>(Arrays.asList("Florida", "Georgia", "Pennsylvania", "New Jersey", "Maryland", "Alabama"));
		
		// Natural Ordering
		// Ex;
		Collections.sort(states);
		System.out.println(states);
		
		
		LinkedList<String> states2 = new LinkedList<>(Arrays.asList("Florida", "Georgia", "Pennsylvania", "New Jersey", "Maryland", "Alabama"));
		
		// Special Ordering
		// Ex: sort by length of string
		Collections.sort(states2, (state1, state2) -> state1.length() - state2.length());
		System.out.println(states2);
		
		// User-defined Class Example
		// Special Ordering #1
		LinkedList<State> states3 = new LinkedList<>(Arrays.asList(new State("Georgia", 10000000, 59425), 
																	new State("Alabama", 5040000, 52419), 
																	new State("Florida", 21780000, 65758), 
																	new State("Colorado", 5812000, 104185)));
		
		Collections.sort(states3, (state1, state2) -> state1.getPopulation() - state2.getPopulation());
		System.out.println(states3);
		
		// Special Ordering #2
		Collections.sort(states3, (state1, state2) -> state1.getSize() / 10000 - state2.getSize() / 10000); 
		System.out.println(states3);
		
		
		
		
	}
	
	
}
