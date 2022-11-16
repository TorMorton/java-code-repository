package com.skillstorm;

public class HoneyBadger extends Animal{
	
	public boolean isUnstoppable = true;
	
	public HoneyBadger() {
		super();
	}
	
	public void speak() {
		System.out.println("Razzle dazzle...take that bees");
	}
	
	public static void drink() {
		System.out.println("Glub, glub, honey badger drink bee souls");
	}
}
