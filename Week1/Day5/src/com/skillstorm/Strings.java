package com.skillstorm;

public class Strings {

	public static void main(String[] args) {
		// WET - Write everything twice
		// DRY - Don't Repeat Yourself
		
		// What is a string?
		// String stores text
		
		// Strings are technically char arrays with a few extra features
		
		/*
		 * Features:
		 * 
		 * - Utility functions such as toLowerCase() and subString()
		 * - Java has given us the ability to use the + operator to add or concatenate two strings
		 *  Ex. "Apple " + "Banana" -> "Apple Banana"
		 * - Strings are technically immutable, unable to be changed
		 */
		
		int[] numbers = new int[5];
		numbers[3] = 5; //This cannot be done with a String
		
		// Strings are just char arrays under the hood
		// We can iterate over a String just like an array
		
		String firstName = "Margaret";
		
		//remember that String' lengths are gotten by .length();
		for (int i= 0; i < firstName.length(); i++) {
			char c = firstName.charAt(i);
			System.out.println("Char at index " + i + " is: " + c);
		}

		//Alternative way to loop through a String
		for (char c : firstName.toCharArray()) {
			System.out.println(c);
		}
		
		//Useful functions on the Strings
		
		// toLowerCase() takes a String and returns a new String that's has the A-Z lower cased
		
		String lowerCasedFirstName = firstName.toLowerCase(); //This does not change firstName
		
		System.out.println(lowerCasedFirstName); //New value
		System.out.println(firstName);
		
		String emptyString = "a";
		
		System.out.println(emptyString.isEmpty());
		
		// replace() repalces all instances of old char with new char
		
		String boringSentence = "I woke up today. After that, I went to the store.";
		String excitingSentence = boringSentence.replace('.', '!');

		System.out.println(excitingSentence);
		System.out.println(boringSentence);
		
		
		// substring() creates a new String that is a section of our old string
		
		String rainbow = "Rainbow";
		String rain = rainbow.substring(0, 4);
		
		System.out.println(rain);
		mySubstring(0, 7, "Rainbow");
		
		System.out.println("My substring function: " + mySubstring(0, 100, rainbow));
		
		// StringBuilder
		
		// Reversing a string
		
		String encodedMessage = "!dlroW olleH";
				
		//Creates a new StringBuilder, preconfigured with my string
		StringBuilder stringReverser = new StringBuilder(encodedMessage);
		stringReverser.reverse(); //Reverses the string in StringBuilder
		System.out.println(stringReverser);
		String decodedMessage = stringReverser.toString();
		
		System.out.println("Decoded message: " + decodedMessage);
		
		// trim() and removes any trailing or leading white space
		
		String uglyWord = "                                             John Doe                                         ";
		String prettyWord = uglyWord.trim(); // That's it. Creates a new string without whitespace
		System.out.println(prettyWord);
		System.out.println(uglyWord);
		
		// split() splits up a string based on some character, returns a String array
		
		String fullName = "Franklin Delano Roosevelt";
		String[] partsOfName = fullName.split(" "); // ["Franklin", "Delano", "Roosevelt"]
		
		for (String name : partsOfName) {
			System.out.println(name);
		}
		
		String age = "45";
		int ageNum = Integer.parseInt(age);
		System.out.println(ageNum);
		ageNum++; 
		ageNum = ageNum / 2; //23
		System.out.println(ageNum);
		
		int num = 20;
		double doubleNum = num; //Widening it, don't lose data
		//num = (int) doubleNum //Narrowing it and losing data
		
		// Write a program that parses CSV string and converts it into usable data
		// Comma Separated Values
		String johnData = "John,Doe,43";
		
	}
	
	public static boolean printCarDetails (String csv) {
		String johnDoeDetails = "John,Doe,89888888888,P Sherman 42 Wallaby Way,43,Texas,Dallas,2/4/2022,2/5/2022";
		return true;
	}
	
	public static String mySubstring(int startIndex, int endIndex, String str) {
		if (startIndex > endIndex || endIndex > str.length()) {
			return str;
		}
		StringBuilder newString = new StringBuilder();
		for (int i = startIndex; i < endIndex; i++) {
			newString.append(str.charAt(i));
		}
		return newString.toString();
	}

}
