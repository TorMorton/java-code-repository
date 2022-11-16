package com.skillstorm;

import java.util.Objects;

public class Person {

	String name;
	final int dateOfBirth;
	
	public Person(String name, int dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}
	
	@Override
	public int hashCode() {
		int hash = 51;
		hash = 7 * hash  + ((name == null)? 0 : name.hashCode()); // TODO do better
		hash = 7 * hash + ((int) dateOfBirth);
		return hash;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
			return Objects.equals(name, other.name) && Objects.equals(dateOfBirth, other.dateOfBirth); 
	}
	
	public String toString() {
		return "" + name + " DOB: " + dateOfBirth;
	}
	
	
}
