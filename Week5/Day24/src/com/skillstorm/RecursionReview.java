package com.skillstorm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecursionReview {
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Example 2 - find the longest String recursively (LinkedList vs ArrayList)
	
	public static int findLongestLength(LinkedList<String> words) {
		// BASE CASE
		if (words.isEmpty()) {
			return 0;
		}
		//RECURSIVE CALL
		else {
			int current = words.remove().length();
			int winner = findLongestLength(words);
			return Math.max(current, winner);
		}
		
	}
	
	
	public static String findLongest(LinkedList<String> words) {
		// BASE
		if (words.isEmpty())
			return "";
		else {
			// get current string
			String current = words.remove();
			// get longest string so far
			String winner = findLongest(words);
			// compare the two
			if (current.length() >= winner.length()) {
				return current;
			} else {
				return winner;
			}
		}
		
		
	}
	
	// find longest String recursively using arraylist
	
	public static String findLongest(ArrayList<String> words) { // why can I reuse this name? Method overloading
		//MEthod 1 -- set up start index
		return helpFindLongest(words, 0);
	}
	
	private static String helpFindLongest(ArrayList<String> words, int index) {
		// BASE CASE
		if (index > words.size() - 1) {
			return "";
		// RECURSIVE CALL
		}else {
			// COMPARE CURRENT
			String current = words.get(index);
			// WINNER
			String winner = helpFindLongest(words, index + 1);
			if (current.length() >= winner.length()) {
				return current;
			} else {
				return winner;
			}
		}
	}
	
	
	// Example 2 TESTS
	
	
	public static void main (String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("Doug Dimmadome");
		names.add("Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.");
		names.add("Valientebarrientos");
		names.add("Jo Jo");
		System.out.println("Expecting " + "Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.");
	
		// all the same
		LinkedList<String> sameNames = new LinkedList<>();
		sameNames.add("Joe");
		sameNames.add("Tom");
		sameNames.add("Ben");
		sameNames.add("Rob");
		System.out.println(findLongest(sameNames));
		
		//empty
		System.out.println(findLongest(new LinkedList<String>()));
		
		System.out.println(findLongest(new LinkedList<String>(names)));
		
		//test ArrayList version
		ArrayList<String> arrayOfNames = new ArrayList<String>();
		arrayOfNames.add("Doug Dimmadome");
		arrayOfNames.add("Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.");
		arrayOfNames.add("Valientebarrientos");
		arrayOfNames.add("Jo Jo");
		System.out.println(findLongest(arrayOfNames));
		
		
		
		
		// test search for String
		List<String> findingNemo = new ArrayList<>();
		findingNemo.add(null);
		findingNemo.add("Dory");
		findingNemo.add("Bruce");
		findingNemo.add("Nemo");
		findingNemo.add("Darla");
		
		System.out.println("Found nemo? " + contains(findingNemo, "Nemo"));
		
		
		
		
		
	}
	
	
	// EXAMPLE 3 - find IF the list contains a given String
	
	public static boolean contains(List<String> words, String searchTerm) {
		
		return helpSearch(words, searchTerm, 0);
	}
	
	private static boolean helpSearch(List<String> words, String searchTerm, int index) {
		// BASE CASE
		if (index > words.size() -1) {
			//failure
			return false;
			
		}else if (searchTerm.equals(words.get(index))) {
			// success
			return true;
			
		} else {
			// RECURSIVE CALL, if it's not me keep checking
			return helpSearch(words, searchTerm, index + 1);
		}
	}
	
	
	
}
