package com.skillstorm;

import java.util.HashSet;

public class Library {

	static HashSet<Book> catalog = new HashSet<>();
	
	public static void main(String[] args) {
		
		// add
		
		//catalog.add(null);
		catalog.add(null);
		System.out.println(catalog);
		Person author1 = new Person("Stephen King", 1947);
		Person author2 = new Person("Mark Twain", 1835);
		Person author3 = new Person("Michelle Obama", 1964);
		
		Book book1 = new Book("The Shining", author1);
		Book book2 = new Book("Mysterious Stranger", author2);
		Book book3 = new Book("Becoming", author3);
		
		catalog.add(book3);
		catalog.add(book2);
		catalog.add(book1);
		catalog.add(book1); // not added bc already .equals
		
		// When to use HashSet vs not
		/*
		 * Ex. Programmer known languages -- yes
		 * 		Programmer used languages on each project -- no
		 * Ex. library catalog -- yes
		 * 		keeping track of all the books available -- no
		 * Ex. What types of Halloween candy I have
		 * 		cs each piece of candy
		 * Ex. usernames in a db -- unique
		 * 		passwords -- not unique
		 * Ex items availbale at a grocery store
		 * 		vs at Target how many of each is available
		 * 
		 */
		
		System.out.println(catalog);
		
		//remove
		
		catalog.remove(null);
		
		System.out.println(catalog);
		System.out.println(catalog.size());
		
	}
	
}
