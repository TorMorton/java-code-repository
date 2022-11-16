package com.skillstorm;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		
		// if I don't declare a type, it defaults to a LinkedList of Objects
		//LinkedList myList = new LinkedList();
		
		//declare a type inside the carets
		LinkedList<String> myStringList = new LinkedList<String>();
		
		// empty list by default, not null
		System.out.println(myStringList);
		
		// adding an item
		myStringList.add("football");
		myStringList.add("cheesecake");
		myStringList.add("paper cut");
		
		System.out.println(myStringList);
		
		// inserting and item in the middle
		myStringList.add(1, "Baby napkins"); // syntax here is first parameter = index where you want to inser; all items at/after that get moved to the right
		
		System.out.println(myStringList);
		
		
		//removing an item
		myStringList.remove();
		
		System.out.println(myStringList);
		
		// removing an item from the middle
		myStringList.remove(1);
		
		System.out.println(myStringList);
		
		myStringList.add("twine");
		myStringList.add("liquor");
		myStringList.add("Gwar");
		myStringList.add("fishcakes");
		
		System.out.println(myStringList);
		
		//removing the item at the end
		myStringList.removeLast();
		
		System.out.println(myStringList);
		
		myStringList.remove(myStringList.indexOf("Gwar"));
		
		
		myStringList.add("Gwar");
		myStringList.add("Gwar");
		myStringList.add("Gwar");
		
		System.out.println(myStringList);
		
		// using removeALl()
		LinkedList<String> myListToRemove = new LinkedList<String>();
		myListToRemove.add("Gwar");
		myListToRemove.add("paper cut");
		
		// checking to see if it has single value in it
		System.out.println(myStringList.contains("liquor"));
		// checking to see if it has all of a collection of values in it
		System.out.println(myStringList.containsAll(myListToRemove));
		
		//removing all instances of all values in one list from another
		myStringList.removeAll(myListToRemove);
		
		System.out.println(myStringList);
		
		
		// can I have a LinkedList of LinkedLists? yes
		
		LinkedList<LinkedList<String>> myLists = new LinkedList<LinkedList<String>>();
		myLists.add(myStringList);
		myLists.add(myListToRemove);
		
		System.out.println(myLists);
		
		//LinkedList testList = new LinkedList<String>();
		//LinkedList otherTestList = new LinkedList<BetterBilliardBall>();
		
		//LinkedList groupList = new LinkedList();
		
		//groupList.add(testList);
		//groupList.add(otherTestList);
		
		//LinkedList<String> stringList = new LinkedList<>();
		
		
		LinkedList<String> heroes = new LinkedList<String>();
		
		heroes.add("Batman");
		heroes.add("Iron Man");
		heroes.add("The Incredible Hulk");
		heroes.add("Loki");
		
		System.out.println(heroes);
		
		System.out.println(heroes.size());
		
		heroes.remove(3);
		
		System.out.println(heroes);
		
		
		
		
		
		
		
		
	}

}
