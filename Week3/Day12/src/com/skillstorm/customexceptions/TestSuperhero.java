package com.skillstorm.customexceptions;

public class TestSuperhero {

	public static void main(String[] args) throws Exception {
		
		SuperHero superman = new SuperHero();
		superman.setIndestructable(true);
		superman.fly("Beautiful fall weather");
		//superman.fly("Rainy");
		
		superman.fightCrime();
	}

}
