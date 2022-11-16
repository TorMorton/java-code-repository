package com.skillstorm;


//to inherit from another class we use the "extends" keyword
//"implements" is for interfaces, so don't use that yet!
//can only extend ONE class, not
public class Dog extends Animal{
	
	//now our Dog class has inherited all properties and methods of Animal
	
	//Properties that Dog has but Animal does not
	public String ownerName;
	public boolean isVaccinated;
	public byte numberOfLegs = 4;
	
	//default constructor uses superclass(Animal) default constructor as well
	public Dog() {
		//calling the superclass (Animal) constructor
		super();
	}
	
	//custom constructor, uses Animal's default constructor as well
	public Dog(String ownerName, boolean isVaccinated, byte numberOfLegs) {
		// syntax: this object's variable = the variable we took in as a parameter
		this.ownerName = ownerName;
		this.isVaccinated = isVaccinated;
		this.numberOfLegs = numberOfLegs;
	}
	
	//uses constructor chaining to call the custom super(3 params) constructor from within this constructor
	public Dog(boolean hasLegs, String color, String diet, String ownerName, boolean isVaccinated, byte numberOfLegs) {
		//first three parameters get passed on to the other constructor
		super(hasLegs, color, diet);
		
		//last three parameters get passed as usual
		this.ownerName = ownerName;
		this.isVaccinated = isVaccinated;
		this.numberOfLegs = numberOfLegs;
	}
	
	//method overriding
	//using the exact same method names and signatures as superclass methods
	//but giving them different functionality
	
	public void move() {
		System.out.println("I am a dog and I'm running towards a frisbee.");
	}
	
	//COMPILE TIME POLYMORPHISM
	// same as method overloading
	// there are two versions of the speak() method, one with no parameters, one with an int -- speak() vs speak (int NumberofTimes)
	
	public void speak() {
		System.out.println("Bark");
	}
	
	//RUNTIME POLYMORPHISM
	// SEE EAT IN ANIMAL;
	
	public void eat() {
		System.out.println("Dog food");
	}
	
	
	//method overloading with other speak() method
	public void speak(int numberOfTimes){
		int counter = 0;
		while (counter < numberOfTimes) {
			System.out.println("Bark");
			counter++;
		}
	}
	
	
	
	
}


