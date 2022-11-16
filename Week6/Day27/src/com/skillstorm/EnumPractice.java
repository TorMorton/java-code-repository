package com.skillstorm;

import java.util.Scanner;

import com.skillstorm.Day;

public class EnumPractice {

	public enum Planet {  // inner class -- don't need Planet.MERCURY -- we can just refer to MERCURY
		MERCURY,			// WE CAN KEEP OUR ENUM WITHIN THE CLASS WE US IT IN
		VENUS,
		MARS,
		EARTH,
		JUPITER,
		SATURN,
		URANUS,
		NEPTUNE // no semicolon necessary
		
	}
	
	// returns true if planet is further than planet2
	public static boolean isFurtherFromSun(Planet planet1, Planet planet2) {
		int planet1Ordinal = planet1.ordinal();
		int planet2Ordinal = planet2.ordinal();
		return planet1Ordinal > planet2Ordinal;
	}
	
	
	
	/*
	 * What is an enum?
	 * 
	 * = Enumeration
	 * - Constants stored in a Set
	 * 
	 * Ex: days of the week
	 * 
	 * What is the benefit?
	 * - retsrict the values that can be stored in a variable
	 * - comparison is faster compared to STring (== instead of comparing each characteer)
	 * - better than using int because encapsulates more information
	 * 
	 * 
	 * What is a con?
	 * - can't add mroe to the Enum's set of values as the program is running
	 */
	
	public static void main(String[] args) {
	
		Day today = Day.MONDAY; // instead of "Monday" or int 1
	
		// for each - print out all the values of Day
		for (Day day : Day.values()) {
			System.out.println(day);
		}
		
		// using valueOf to convert a String to an Enum
		// Day tomorrow = Day.valueOf("wed") ; // throws error if does not exist
		// Wednesday or wednesday -- use .toUppercase
		String userEntered = "Wednesday ";
		Day tomorrow = Day.valueOf(userEntered.toUpperCase().trim());
		System.out.println("User entered: " + tomorrow);
		
		// anywhere I use Day, I don't need to do validation anymore like I would with String day
		
		Color userColor = promptUserForColor(); // method that returns our enum
		System.out.println("You chose: " + userColor);
		// String hexCode = getColorHexCode("purple") does not work
		String hexCode = getColorHexCode(userColor); // method that uses our enum
		System.out.println("The hex value is " + hexCode);
		//Color[] colors = Color.values();
		//Color color = colors[0];
		
		System.out.println("Comparing Earth and Earth " + isFurtherFromSun(Planet.EARTH, Planet.EARTH));
		System.out.println("Comparing Mercury and Venus " + isFurtherFromSun(Planet.MERCURY, Planet.VENUS));
		System.out.println("Comparing Jupiter and Mars " + isFurtherFromSun(Planet.JUPITER, Planet.MARS));
	
	}
	
	public static String getColorHexCode(Color color) {
		return color.getHexValue();
	}
	
	public static Color promptUserForColor() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a color, out of");
		for (Color color: Color.values()) {
			System.out.println(color + " ");
		}
		String userEntry = input.nextLine();
		// sanitize the string
		userEntry = userEntry.toUpperCase().trim(); // store the result
		return Color.valueOf(userEntry);
	}
	
}
