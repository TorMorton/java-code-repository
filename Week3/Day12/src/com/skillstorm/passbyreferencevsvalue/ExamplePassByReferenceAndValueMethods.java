package com.skillstorm.passbyreferencevsvalue;

import com.skillstorm.customexceptions.SuperHero;

public class ExamplePassByReferenceAndValueMethods {

	public static void main(String[] args) {
		
		int n = 10;
		
		increment(n);
		
		System.out.println(n);
		
		SuperHero superman = new SuperHero();
		superman.setIndestructable(true);
		attackSuperHero(superman);
		System.out.println("After attack Super man is " + superman.isIndestructable());
		
		
		
	}
	
	// pass by value example
	public static void increment(int n) {
		n = n + 1;
	}
	
	public static void attackSuperHero(SuperHero superman) {
		superman.setIndestructable(false);
		System.out.println("This superhero is now " + superman.isIndestructable());
	}
	
	public static void attackSuperHeroV2(SuperHero superman) {
		SuperHero superhero = new SuperHero();
		superhero.setIndestructable(superman.isIndestructable());
		superhero.setIndestructable(false);
		System.out.println("Is this superhero still indestructable? " + superhero.isIndestructable());
	}
	
}
