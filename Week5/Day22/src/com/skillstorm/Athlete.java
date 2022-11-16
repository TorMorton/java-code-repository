package com.skillstorm;

public class Athlete {

	private String name;
	private int careerWins;
	private int careerLosses;
	private double totalPlayed;
	
	public Athlete() {
		super();
	}
	
	public Athlete(String name, int careerWins, int careerLosses) {
		this.name = name;
		this.careerWins = careerWins;
		this.careerLosses = careerLosses;
		setTotalPlayed();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCareerWins() {
		return careerWins;
	}

	public void setCareerWins(int careerWins) {
		this.careerWins = careerWins;
	}

	public int getCareerLosses() {
		return careerLosses;
	}

	public void setCareerLosses(int careerLosses) {
		this.careerLosses = careerLosses;
	}
	
	public double getTotalPlayed() {
		return totalPlayed;
	}
	
	public void setTotalPlayed() {
		this.totalPlayed = (double) getCareerWins() + (double) getCareerLosses();
	}
	
	public double getCareerAverage() {
		double average = (double)(getCareerWins() / getTotalPlayed()) * 100;
		
		return average;
	}

	@Override
	public String toString() {
		return "Athlete [name=" + name + ", careerWins=" + careerWins + ", careerLosses=" + careerLosses
				+ ", average=" + getCareerAverage() + "]";
	}
	
	
}
