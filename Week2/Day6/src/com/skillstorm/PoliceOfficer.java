package com.skillstorm;

public class PoliceOfficer {

	//PROPERTIES
	// class variable
	// All Objects of this class share this variable
	// static keyword makes a variable a class variable and NOT an instance variable
	public static boolean isUpstanding = true;
	
	// final keyword
	final public static String DISTRICT = "West New York";
	
	// instance variables
	// each Object of this class will have its own copy of these variables
	// assigned values will be defaults unless overwritten in a constructor
	public boolean isCertified = true;
	public String sidearmType = "Smith and Wesson";
	public String uniformColor = "Blue";
	public byte age = 35;
	
	// CONSTRUCTORS
	// Each class has a default constructor even if you don't create one
	
	//default constructor
	//exists whether we type it out or not
	public PoliceOfficer() {
		super();
	}
	
	public PoliceOfficer(boolean isCertified) {
		this.isCertified = isCertified;
	}
	
	// custom constructor
	public PoliceOfficer(boolean isCertified, String sidearmType, String uniformColor, byte age) {
		this.isCertified = isCertified;
		this.sidearmType = sidearmType;
		this.uniformColor = uniformColor;
		this.age = age;
	}
	
	//Methods
	
	// static methods
	public static void graduate() {
		System.out.println("Whoopee I got my badge");
	}
	
	//static methods can ONLY call static variable or other static methods
	//Does not work because I'm trying to use a non-static variable
	//public static void checkCertification() {
	//	if (this.isCertified) {
	//		System.out.println("I'm certified.");
	//	}
    //	}
	
	// instance methods
	public void shoot() {
		System.out.println("Bang!");
	}
	
	public void rescueCat() {
		System.out.println("Come out of the tree kitty.");
	}
	
	public void checkUpstandingness() {
		if (isUpstanding) {
			System.out.println("I am upstanding");
		} else {
			System.out.println("Bad cop");
		}
	}

}
