package com.skillstorm;

import java.util.Collections;
import java.util.LinkedList;

public class TestAthletes {

	public static void main(String[] args) {
		LinkedList<Athlete> myAthletes = new LinkedList<Athlete>();
		
		myAthletes.add(new Athlete("Lebron", 20, 18));
		myAthletes.add(new Athlete("Jones", 56, 34));
		myAthletes.add(new Athlete("Brian", 27, 33));
		myAthletes.add(new Athlete("Emily", 37, 32));
		myAthletes.add(new Athlete("Peter", 1, 22));
		
		Athlete james = new Athlete("Lebron", 20, 18);
		
		System.out.println(james.getTotalPlayed());
		System.out.println(james.getCareerWins());
		System.out.println(james.getCareerAverage());
		
		
		System.out.println(myAthletes);
		
		RankingAthletes comparer = new RankingAthletes();
		
		Collections.sort(myAthletes, comparer);
		System.out.println(myAthletes);
		
		
	}
	
	
	
}
