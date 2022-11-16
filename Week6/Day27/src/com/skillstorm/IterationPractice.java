package com.skillstorm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class IterationPractice {
	
	/*
	 * What is an iterator?
	 * - alternative to
	 * 		-- stream
	 * 		-- loops - while, for, for-each
	 * 			- or recursion
	 * - uses iteration (not recursion to traverse a collection)
	 * 		collection - list, set, array, map
	 * 
	 * Pros - can start and stop and keep continuing from where left off
	 * 		- we remove safely in the middle of iterating
	 * 
	 * - unlike stream we are operation on the list or collection itself -- mutates the list
	 * 		- does not create a new list
	 * 
	 * Explore on your own
	 * - ListIterator - can get previous
	 */
	
	public static void main(String[] args) {
		LinkedList<String> programmingLanguages = new LinkedList<>(Arrays.asList("Rust", "Python", "Ruby", "Go", "C#", "Pascal", "Java"));
		
		Iterator<String> iter = programmingLanguages.iterator();
		String language1 = iter.next();
		String language2 = iter.next();
		System.out.println(language1);
		System.out.println(language2);
		System.out.println("more? " + iter.hasNext());
		String language3 = iter.next();
		System.out.println(language3);
		
		// go through all the rest
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	//	for (int i = 0; i < programmingLanguages.size(); i++) {
//			if (programmingLanguages.get(i).equals("Java")) {
	//			programmingLanguages.remove(i);                         // do not remove as iterate over a list
//	//		} else {
	//			System.out.println(prgrammingLanguages.get(i));
	//		}
	//	}
		
		Iterator<String> iter2 = programmingLanguages.iterator();
		while(iter2.hasNext()) {
			String language = iter2.next();
			// other cool code goes here to do stuff with each elemnt
			// as i go i want to also remove safely
			if (language.equals("Java")) {
				iter2.remove();
			}
		}
		System.out.println(programmingLanguages);
		
		
	}

}
