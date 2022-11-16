package com.skillstorm;

import java.util.Objects;

public class Book {

	private String title;
	private Person author;
	
	public Book(String title, Person author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public String toString() {
		return " " + title + " written by " + author;
	}
	
	// HOW WE WILL USE THIS
	@Override
	public int hashCode() {
		int hash = 51;
		hash = 7 * hash  + ((title == null)? 0 : title.hashCode());
		hash = 7 * hash  + ((author == null)? 0 : author.hashCode());
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
			return Objects.equals(title, other.title) && Objects.equals(author, other.author); 
	}
	



}
