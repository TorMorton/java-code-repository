package com.skillstorm;

import java.util.Random;

public class TestHomework {
	
	public static void main(String[] args) {
	
		HomeworkAssignment hardAssignment = new HomeworkAssignment();
		System.out.println(hardAssignment);
		String[] names = {

			"Brandon",

			"Jason",

			"Christopher",

			"Edwin",

			"Brian",

			"Kirby",

			"Preston",

			"Aung",

			"Lion",

			"Eric",

			"Donavon",

			"Raymond",

			"Ernesto",

			"NaDario",

			"Victoria",

			"Rob",

			"Lamar",

			"Jordan",

			"Aaliyah",

			"Dylan",

			"Rina",

			"Artyom",

			"Kelvin" };
		
		//HashMap<String, Integer> studentGrades = new HashMap<>();
		Random generator = new Random();
		for (String name : names) {
			hardAssignment.getGrades().put(name, generator.nextInt(100));
		}
		System.out.println(hardAssignment.getGrades());
		
		System.out.println("The high score was: " + hardAssignment.highestGrade());
		
		System.out.println("Top scoreer(s): " + hardAssignment.topStudent());
		
		System.out.println("Avg score: " + hardAssignment.averageGrade());
		
	}
}
