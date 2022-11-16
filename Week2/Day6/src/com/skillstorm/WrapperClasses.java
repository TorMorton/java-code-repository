package com.skillstorm;

import java.util.LinkedList;

public class WrapperClasses {
	public static void main(String[] args) {
		
		//Wrapper classes are Objects used to contain primitive data types
		
		//normal variable declaration/initialization
		int age = 23;
		
		Integer ageInt = new Integer(23);
		// can do it like this, not as clear when analyzing the code
		// Integer myInt2 = 5;
		
		System.out.println(ageInt);
		
		Byte myByte = new Byte((byte)3);
		System.out.println(myByte);
		
		Short myShort = new Short((short)321);
		System.out.println(myShort);
		
		Long myLong = new Long(12345);
		System.out.println(myLong);
		
		Double myDouble = new Double(45.32);
		System.out.println(myDouble);
		
		Float myFloat = new Float(3.4f);
		System.out.println(myFloat);
		
		Boolean myBoolean = new Boolean(true);
		System.out.println(myBoolean);
		
		Character myChar = new Character('Z');
		System.out.println(myChar);
		
		System.out.println();
		
		// an array CAN hold primitives
		int[] myIntArray = { 1, 2, 3, 6, 2, 7, 84};
		
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		
		System.out.println();
		
		// but a LinkedList CANNOT -- must hold Objects
		// so we use the Integer wrapper class
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(new Integer(1));
		myLinkedList.add(new Integer(3));
		myLinkedList.add(new Integer(6));
		myLinkedList.add(new Integer(3));
		myLinkedList.add(new Integer(7));
		myLinkedList.add(new Integer(5));
		
		for (Integer num : myLinkedList) {
			System.out.println(num);
		}
		
		//wrapper classes have some methods that primitives do not
		// can be useful when converting types, for example
		String myLongAsAString = myLong.toString();
		System.out.println(myLongAsAString);
		
		
	}
}
