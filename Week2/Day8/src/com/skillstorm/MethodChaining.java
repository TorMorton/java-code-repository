package com.skillstorm;

public class MethodChaining {
	
	public static void main(String[] args) {
		
		/*
		 *  METHOD CHAINING 
		 * 
		 *  What if i want to do several things in a row to an Object?
		 *  
		 *  I could call each of the Object's methods one after another in separate lines of code
		 *  
		 *  OR, I could set up my methods so we could do them all at once
		 *  
		 *  syntax without chainings:
		 *  
		 *  object.methodOne(param);
		 *  object.methodTwo(param);
		 *  object.methodThree(param);
		 *  
		 *  syntax with chaining: object.methodOne(param).methodTwo(param).methodThree(param);
		 *  
		 *  Either way all three methods get run on the same object
		 */
		
		Horse horse = new Horse(5);
		System.out.println(horse.toString());
		
		//horse.addHair(10);
		
		//System.out.println(horse.toString());
		
		//horse.addLotsOfHair(10);
		
		//System.out.println(horse.toString());
		
		//horse.addAnInsaneAmountOfHair(6);
		
		//System.out.println(horse.toString());
		
		horse.addHair(10).addLotsOfHair(10).addAnInsaneAmountOfHair(6);
		System.out.println(horse.toString());
		
		Horse greatHorse = new Horse(1);
		System.out.println(greatHorse.toString());
		
		greatHorse.addAnInsaneAmountOfHair(34).addHair(50).addLotsOfHair(889);
		System.out.println(greatHorse.toString());
	}
}
