package com.skillstorm;

import java.util.LinkedList;

public class Inheritance {

	public static void main(String[] args) {
		
		//Inheritance Examples
		Animal.drink();
		HoneyBadger.drink();
		
		
		System.out.println();
		
		Animal animalOne = new Animal(true, "Black", "Omnivore");
		
		System.out.println(animalOne.hasLegs + " " + animalOne.color + " " + animalOne.diet);
		
		animalOne.move();
		animalOne.speak();
		animalOne.eat();
		
		System.out.println();
		
		Dog dogOne = new Dog();
		dogOne.eat();
		
		System.out.println(dogOne.numberOfLegs);
		System.out.println(dogOne.isVaccinated);
		System.out.println(dogOne.color);
		System.out.println(dogOne.diet);
		
		//System.out.println(animalOne.numberOfLegs);
		// does not work because an Animal is NOT a dog even though a dog is an animal
		
		
		//This uses our custom Dog constructpr but uses the default Animal constructor
		Dog dogTwo = new Dog("Jacob", true, (byte)4);
		
		System.out.println(dogTwo.hasLegs);
		System.out.println(dogTwo.color);
		System.out.println(dogTwo.diet);
		System.out.println(dogTwo.ownerName);
		System.out.println(dogTwo.isVaccinated);
		System.out.println(dogTwo.numberOfLegs);
		
		System.out.println();
		
		//This uses out custom Dog constructor and our custom Animal constructor
		Dog dogThree = new Dog(true, "White", "Omnivore", "Jet", true, (byte)3);
		
		System.out.println(dogThree.hasLegs);
		System.out.println(dogThree.color);
		System.out.println(dogThree.diet);
		System.out.println(dogThree.ownerName);
		System.out.println(dogThree.isVaccinated);
		System.out.println(dogThree.numberOfLegs);
		
		
		//Without overriding dog uses just the Animal methods
		//with overriding the Dog uses its own versions of the methods
		dogThree.move();
		dogThree.speak();
		dogThree.eat();
		dogThree.speak(5);
		
		//COVARIANCE
		// when something can be two things at once ie a dog is a dog and an animal
		// enables us to group objects together that are inherited from the same source
		// all objects we create are technically covariant (inherit from object class at some level)
		
		
		HoneyBadger hbOne = new HoneyBadger();
		
		hbOne.speak();
		
		//reference type = Animal
		//CAN do this, because a HoneyBadger IS AN animal
		Animal hbTwo = new HoneyBadger();
		
		//Can't do this because an animal is not a Honeybadger
		//HoneyBadger hbThree = new Animal();
		
		Inheritance inheritance = new Inheritance();
		
		LinkedList<HoneyBadger> hbll = new LinkedList<HoneyBadger>();
		
		//cannot add different Object types to a collection
		//hbll.add(hbOne);
		//hbll.add(inheritance);
		
		LinkedList<Animal> animalList = new LinkedList<Animal>();
		
		//can do this because all Animals, Dogs, and HoneyBadgers are animals, regardless of reference type
		animalList.add(hbOne);
		animalList.add(animalOne);
		animalList.add(dogOne);
		
		Computer myComputer = new Computer("RTX 2060", "Intel i9", 650, (byte)16, false, 2000, "Z390 Phantom Gaming");
		myComputer.bootSystem();
		myComputer.shutDown(false);
		myComputer.restart();
		
		Animal hbThree = (Animal) (new HoneyBadger());
		hbThree.drink();
		
		//static methods do not subscribe to the rules of overriding
	}

}
