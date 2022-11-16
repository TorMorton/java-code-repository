package com.skillstorm;

import java.util.ArrayList;

public class ArrayListPractice {

	
	public static void main(String[] args) {
		practice();
		
	}
	
	public static void practice() {
		
		/*
		 * What is an array?
		 * -group of like objects, primitive or non-primitive
		 * 		- arrays of primitives hold the value, non-primitives have their memory addresses held
		 * 		- all items must be the same type (non-primitives can use sub types)
		 * - indexed specifically starting with 0
		 * - last index you can access is the length - 1
		 * - we can access the items using the index
		 * - once you initialize the array size is FIXED
		 * 		- you can initialize the size - it fills with default values ex: 0
		 * 		- or you can initialize it with the values you want
		 * 
		 * 
		 * What is an ArrayList?
		 * - it's RESIZABLE - we can continue adding items indefinitely
		 * - don't need to specify length up front
		 * - MUST BE NON-PRIMITIVE
		 * - all items must be the same type (non-primitives can use sub types)
		 */
		
		
		//How to declare
		ArrayList<String> names = new ArrayList<>(); // default capacity is 10
		ArrayList objects = new ArrayList(); // stores any java.lang.object and subtypes
		
		//Instead of .length
		names.size(); // capacity vs number of items added
		System.out.println(names.size());
		
		// declare initial capacity
		ArrayList<Integer> numbers = new ArrayList<>(4);
		System.out.println(numbers.size());
		
		numbers.add(1); // 1 is autoboxed to be an Integer
		numbers.add(Integer.valueOf(10));
		numbers.add(100);
		numbers.add(101);
		numbers.add(102); // 5th item, when item is added beyond arraylist size, creates a new array that has a capacity that is 50% larger
		System.out.println(numbers.size());
		
		Integer n = new Integer(1); //or
		Integer x = Integer.valueOf(1);
		//autoboxing
		Integer y = 1;
		//autoboxing
		int z = y;
		
		System.out.println();
		numbers.add(2, Integer.valueOf(50)); // index, value'
		//numbers.add(9, Integer.valueOf(60));
		System.out.println(numbers);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(5);
		numbers2.add(7);
		
		// change the value at index 2
		numbers.set(2, Integer.valueOf(55));
		System.out.println(numbers);
		numbers.set(2, Integer.valueOf(1));
		System.out.println(numbers);
		
		//copy everuthing
		numbers.addAll(numbers2);
		System.out.println(numbers);
		
		numbers.add(1, Integer.valueOf(27));
		numbers.add(9, Integer.valueOf(1000));
		System.out.println(numbers.size());
		System.out.println(numbers);
		//remove by value
		numbers.remove(Integer.valueOf(1)); // removes the value
		
		System.out.println();
		
		//remove by index
		numbers.remove(1); // removes value at that index
		System.out.println(numbers);
		
		
		//Strings examples
		ArrayList<String> people = new ArrayList<>();
		people.add("Jon");
		people.add("Joe");
		people.add("Jimmy");
		System.out.println(people);
		
		//remove by value
		people.remove("Joe");
		System.out.println(people);
		
		//remove by index
		people.remove(1);
		System.out.println(people);
		
		people.add("Jon");
		System.out.println(people);
		
		people.remove("Jon");
		System.out.println(people);
		
		people.add("James");
		people.add("Joseph");
		people.add("Jane");
		people.add("Jon");
		people.add("Jesus");
		people.add("Jon");
		people.add("Jimmerson");
		people.add("Jameson");
		people.add("Johnson");
		people.add("Jon");
		System.out.println(people);
		
		
		
		ArrayList<String> peopleWithoutTicket = new ArrayList<>();
		peopleWithoutTicket.add("Jon");
		
		people.removeAll(peopleWithoutTicket);
		System.out.println(people);
		
		//people.removeAll(people); // inefficient, removes one by one
		//people.clear();
		System.out.println();
		
		//
		people.set(0,  "Jaqueline");
		System.out.println(people);
		
		people.set(1,  "Juliet");
		System.out.println(people);
		
		System.out.println(people.get(2));
		
		System.out.println(people.get(people.size() - 1));
		
		int middle = people.size() /2;
		
		System.out.println(people.get(middle));
		
		System.out.println(people.indexOf("Jameson"));
		
		
		//indexOf with duplicates
		people.set(middle,  "Jon");
		people.set(people.size()-1,  "Jon");
		System.out.println(people);
		System.out.println("Found Jon at index " + people.indexOf("Jon"));
		
		
		//
		System.out.println("Is Jon in the list? " + people.contains("Jon"));
		System.out.println("Is Jesus here? " + people.contains("Jesus"));
		
		
		ArrayList<String> keepers = new ArrayList<>();
		keepers.add("Jimmerson");
		keepers.add("Jameson");
		keepers.add("Jon" );
		people.retainAll(keepers);
		System.out.println(people);
		
		//retain range - PROTECTED only accessable if we create MyArrayLIst extends ArrayList
		//people.retainRange(0,3);
		
		
		ArrayList<Integer> years = new ArrayList<>();
		
		years.add(2010);
		years.add(1998);
		years.add(2020);
		years.add(1990);
		
		System.out.println(years);
		
		years.set(0, 2022);
		
		System.out.println(years);
	
		System.out.println(years.size());S
		
		years.remove(1);
		
		System.out.println(years);
		
		
	
		
		
		
		
		
		
		
		
		
	}// end main
	
	
}
