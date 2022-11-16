package com.skillstorm;

public class Animal {
	
	//Properties that ALL animals have
	public boolean hasLegs;
	public String color;
	public String diet;
	
	//Constructors
	public Animal() {
		super();
	}
	
	public Animal(boolean hasLegs, String color, String diet) {
		this.hasLegs = hasLegs;
		this.color = color;
		this.diet = diet;
	}
	
	
	
	//Methods that ALL animals have
	public void move() {
		System.out.println("I am an animal, and I just went forward");
	}
	
	public void speak() {
		System.out.println("Generic Animal Noise");
	}
	
	// RUN TIME POLYMORPHISM
	// same as method overriding
	// we have an ear() method here and in our dog class, which inherits from Animal
	// when the program runs, it decides which method it is going to run
	
	public void eat() {
		System.out.println("I am an animal, and now I am full");
	}

	public static void drink() {
		System.out.println("Glub, glub, animal like drink");
	}
}
