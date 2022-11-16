package com.skillstorm;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

//Problem 1: Find the highest score (excluding students that cheated)

//Problem 2: Find the low score (excluding students that didn't take the exam -- assume those are the only 0 scores)

//Problem 3: Set all the scores of the students who cheated to 0


public class MainClass {
	  
	public static void main(String[] args) {
	        
	        
	        
	        AssignmentSubmission eric = new AssignmentSubmission("eric", 67, false);
	        AssignmentSubmission tanya = new AssignmentSubmission("tanya", 82, true);
	        AssignmentSubmission josh = new AssignmentSubmission("josh", 0, false);
	        AssignmentSubmission amanda = new AssignmentSubmission("eric", 38, false);
	        AssignmentSubmission todd = new AssignmentSubmission("todd", 99, true);
	        AssignmentSubmission felicia = new AssignmentSubmission("felicia", 56, false);
	        AssignmentSubmission megan = new AssignmentSubmission("megan", 92, false);
	        
	        
	        List<AssignmentSubmission> submissions = new LinkedList<>(); // YOUR CODE HERE
	        submissions.add(eric);
	        submissions.add(tanya);
	        submissions.add(josh);
	        submissions.add(amanda);
	        submissions.add(todd);
	        submissions.add(felicia);
	        submissions.add(megan);
	       
	        Stream<AssignmentSubmission> assignmentStream = submissions.stream();
	        // Convert to Stream
	        
	        Stream<Integer> highestStream = assignmentStream.map((assignment) -> {
	        	int score = 0;
	        	if (assignment.isCheated() != true)
	        		score = assignment.getScore();
	        	return score;
	        	});
	        
	        //highestStream.forEach(System.out::println);
	        
	        Integer highestScore = highestStream.reduce(Integer.MIN_VALUE, (soFar, num) -> {
		
				return Math.max(soFar, num);
			});
	        
	        System.out.println(highestScore);
	        
	        
	        List<AssignmentSubmission> submissions2 = new LinkedList<>(); // YOUR CODE HERE
	        submissions2.add(eric);
	        submissions2.add(tanya);
	        submissions2.add(josh);
	        submissions2.add(amanda);
	        submissions2.add(todd);
	        submissions2.add(felicia);
	        submissions2.add(megan);
	       
	        Stream<AssignmentSubmission> assignmentStream2 = submissions.stream();
	      
	        
	        Stream<Integer> lowestStream = assignmentStream2.map((assignment) -> {
	        	int score = 0;
	        	if (assignment.getScore() != 0)
	        		score = assignment.getScore();
	        	return score;
	        	});
	        
	        lowestStream.forEach(System.out::println);
	        
	        
	        Integer lowestScore = lowestStream.reduce(highestScore, (soFar, num) -> {
				// compare soFar and num
				
				// return larger of the two
				return Math.min(soFar, num);
			});
	        
	        //System.out.println(lowestScore);
	        
	    }
}
