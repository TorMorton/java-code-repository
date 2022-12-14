package com.skillstorm;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

public class State {

	private static final List<String> states = Arrays.asList("Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming");
	
	private String name;
	private int population;
	private int size;
	
	// Constructors
	public State(String name, int population, int size) {
		setName(name);
		setPopulation(population);
		setSize(size);
	}
	
	
	// Getters/Setters
	public String getName() {
		return name;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setName(String name) {
		if(name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Please enter a valid State name");
		} else if (states.contains(name)) {
			this.name = name;
		} else {
			throw new IllegalArgumentException ("Please enter a valid State name");
		}
	}
	
	public void setPopulation(int population) {
		if (population < 0) {
			throw new IllegalArgumentException("Population must be non-negative");
		}
		this.population = population;
		
	}
	
	public void setSize(int size) {
		if (size < 0)
			throw new IllegalArgumentException("Please enter a valid size.");
		this.size = size;
	}
	
	public String toString() {
		NumberFormat nf = NumberFormat.getInstance(); // Using this to add commas to my printed numbers
		return name + ":" + nf.format(population) + ":" + nf.format(size);
	}
	
}
