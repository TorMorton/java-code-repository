//package declaration
package com.skillstorm;

//class declaration
public class Operators {

	public static void main(String[] args) {
		
		/*
		 * OPERATORS
		 * An operator is something that does an operation
		 * 
		 * Mathematical Operators
		 * 
		 * + -- Addition
		 * - -- Subtraction
		 * * -- Multiplication
		 *  / -- Division
		 * % -- Modulo (returns the remainder of a division operation) (2 % 2 == 0, 3 % 2 == 1 
		 * = -- Assignment operator (Assigns the value on right to variable on left) (int x = 34)
		 * 		This operator returns a value -- if (myBoolean = true) (returns myBoolean = true)
		 * += -- Add value on right to variable on left and assign that new value (myInt = 3; myInt += 5; now myInt == 8)
		 * -= -- Same, just subtraction
		 * *= -- Same, multiplication
		 *  /= -- Same, division
		 * %= -- same, modular
		 * 
		 * ++ -- increases value of variable by 1
		 * -- -- decreases value of variable by 1
		 * 	myInt++; and ++myInt; have same result but its calculated at different times
		 * 
		 * 
		 * Boolean Operators'
		 * Asks a true/false question, returns the answer as a boolean
		 * 
		 * == -- logical equals, is the value on the left equal to the value on the right
		 * < -- less than
		 * > -- greater than
		 * <= -- less than or equal
		 * >= -- greater than or equal
		 * ! -- not, negates whatever follows it (!= not equal, true == !false, false == !true, !<)
		 * | -- bitwise OR, processes both to see if they're true, regardless of whether the first one already gives an answer 
		 * & -- bitwise AND, processes both to see if they're true
		 * || -- logical OR, is the value either the value on the left true OR the value on the right true ( true || false == true)
		 * && -- logical AND, is the value either the value on the left true AND the value on the right true ( true && false == false)
		 * !|| -- NOR, returns true if neither value is true ( false || false == true )
		 * !&& -- NAND, returns true only if at least one value is false ( true && false == true, true && true == false )
		 * ^ -- XOR, exclusive OR, returns true ONLY if One is true but not BOTH
		 * !^ -- XNOR, exclusive NOR, returns
		 */
		
		// if/else statements allow to execute code only if certain conditions are met
		// want one thing to happen if true, another if false
		
		boolean myBoolean = false;
		int myInt = 1;
		
		// if your if/else block only contains one line of code each, you don't need curly braces
		// the below statement assigns true to the boolean, so it will return true
		// if (boolean condition) {
		//    //some code
		// }
		
		if (myInt == 5) {
			System.out.println("It's true!");
		} else {
			System.out.println("It's false :(");
		}
		
		// can do as many else if as you want, but only one else, as it catches every other possibility
		
		if (myInt == 4) {
			System.out.println("Spot on");
		}else if (myInt == 5) {
			System.out.println("Just a little too big");
		}else if (myInt ==3) {
			System.out.println("Just a little too small");
		}else if (myInt > 5) {
			System.out.println("Too big :(");
		}else {
			System.out.println("Too small ;(");
		}
		
		System.out.println();
		
		int myAge = 21;
		
		if (myAge >= 18) {
			if (myAge >= 21) {
				System.out.println("To the bar!");
			}else if (myAge == 20) {
				System.out.println("Please Mr. Bouncer, let me in!");
			}else {
				System.out.println("At least I can die for my country...");
			}
		}else {
			System.out.println("Too bad kid.");
		}
		
		System.out.println();
		
		// checking conditions all at once
		
		// a String is an array of chars
		String myName = "Larry";
		String myLastName = "Larryson";
		String myHatSize = "XL";
		
		if (myName == "Larry" && myAge == 20 || myLastName == "Larryson" && myHatSize.indexOf('X') == 1) {
			System.out.println("Everything checks out.");
		}else if (myName == "Larry") {
			System.out.println("Hey, Larry...no such luck this time.");
		}else {
			System.out.println("Sorry fella");
		}
		
		System.out.println();
		System.out.println();
		
		//Post Office example
		//if size/weight is... do something
		//if destination is national/international, do something
		//if shape is... do something
		//if delivery time is...do something
		
		//new Object declaration
		Object myPackage = new Object();
		int weight = 30;
		int length = 25;
		String destination = "Florida";
		boolean isInternational = false;
		String shape = "Square";
		int deliveryTime = 4;
		
		if (myPackage != null) {
			if (weight >= 50) {
				System.out.println("Package is large, freight shipping required.");
			}else {
				System.out.println("Proceed to normal shipping procedures.");
				if (length > 25) {
					System.out.println("Package is too long, freight shipping required.");
				}else {
					System.out.println("Proceed to destination check.");
					if (!isInternational) {
						System.out.println("Destination is " + destination);

					}
					if (shape != "Square") {
						System.out.println("Check shape requirements for flat shipping.");
					}else {
						System.out.println("Estimated time for delivery " + deliveryTime + " days");
					}
				}
					
				}
		}else {
			System.out.println("No packages today.");
		}
		
		System.out.println();
		
		if (myPackage != null && weight <= 49 && length <= 25 && !isInternational && shape == "Square") {
			System.out.println("Weight ok. Length ok. Not an international package.");
			System.out.println("Destination is " + destination + ". Estimated delivery time " + deliveryTime + " days.");
			}else {
			System.out.println("Refer to special shipping guidelines for your package.");
			}
		
		
	}
}
