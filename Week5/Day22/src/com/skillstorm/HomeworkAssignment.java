package com.skillstorm;

import java.util.HashMap;

//Create a class called HomeworkAssignment
//with a HashMap of student names and the student's grade.

//- Create a method that finds the highest grade
//- Create a method that finds the lowest grade
//- Create a method that finds the average grade

//Bonus
//- Create a method that returns the name of the top scoring student

public class HomeworkAssignment {
	
	private HashMap<String, Integer> studentGrades;
	private String listOfNames[];
	
	public HomeworkAssignment() {
		super();
		this.studentGrades = new HashMap<String, Integer>();
	}
	
	public int highestGrade() {
		int maxGrade = 0;
		for (String student : studentGrades.keySet()) {
			int grade = studentGrades.get(student);
			maxGrade = Math.max(maxGrade, grade);
		}
		return maxGrade;
	}
	
	public int lowestGrade() {
		return 0;
	}
	
	public int averageGrade() {
		int total = 0;
		int count = 0;
		for (String name : studentGrades.keySet()) {
			int grade = studentGrades.get(name);
			total += grade;
			count++;
		}
		return total/count;
	}
	
	public HashMap<String, Integer> getGrades() {
		return studentGrades;
	}
	
	public void setGrades(HashMap<String, Integer> studentGrades) {
		
	}
	
	public String topStudent() {
		String result = "";
		int topScore = highestGrade();
		for (String name : studentGrades.keySet()) {
			int score = studentGrades.get(name);
			if (score == topScore)
				result += name + " ";
		}
		return result;
	}
	
}
