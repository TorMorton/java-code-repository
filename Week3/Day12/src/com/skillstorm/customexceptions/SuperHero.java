package com.skillstorm.customexceptions;

public class SuperHero {
	
	private boolean indestructable;
	
	
	public void fly(String weather) throws BadWeatherException {
			if (weather.equals("Rainy"))
				//throw new Exception(); want to be more specific than this and throw my own exception type
				throw new BadWeatherException("Can't fly cuz its rainy");
			System.out.println("Whoosh! Flying to the rescue!");
		}
		
	public void fightCrime() {
		if(!indestructable) {	
			// throw an exception that Justice was
			throw new KryptoniteException("Justice was not served today")
		}
		System.out.println("Justice is served!");
		}
	
	//getters and setters
	
	public boolean isIndestructable() {
		return this.indestructable;
	}

	public void setIndestructable(boolean indestructable) {
		this.indestructable = indestructable;
	}
		
}
