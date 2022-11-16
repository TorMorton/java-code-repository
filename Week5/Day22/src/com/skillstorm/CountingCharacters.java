package com.skillstorm;

import java.util.HashMap;

public class CountingCharacters {
//	Create a function, countCharacters, that returns the total amount of a each character in a given String. The total amount of characters returned should be depicted in the form of a HashMap where the keys are characters and the values is the amount of times that character appeared. If the string is empty or null, simply return an empty HashMap.

//	Requirements:
//
//	    Create a function, countCharacters, that takes in a String and returns a HashMap containing the number of times each character appeared in the string
//	    If the provided String is empty or null, return an empty HashMap
//
	//Bonus Challenge:
//
	//    Create another function, countWords, that takes in an array of Strings and returns a HashMap containing the number of times each word appeared in the array
		//   If the provided array is empty or null, return an empty HashMap

	public static HashMap<Character,Integer> countCharacters(String input){
	      HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
	      char[] stringArray = input.toCharArray();
	     if (input == null || input.isEmpty()) {
	    	try {
	    		countCharacters(null);
	    	} catch(NullPointerException e) {
	    		System.out.println(e.getClass());
	    		return hashMap;
	    	}
	    	  return hashMap; 
	     }else
	      for (char c : stringArray){
	         if (hashMap.containsKey(c)){
	            hashMap.put(c, hashMap.get(c) + 1);
	         }else{
	            hashMap.put(c, 1);
	         }  
	      }
	     return hashMap;
	     }
	      
	
	
	public static void main(String[] args) {
		
		System.out.println(countCharacters("mississippi"));
	}
		
}
