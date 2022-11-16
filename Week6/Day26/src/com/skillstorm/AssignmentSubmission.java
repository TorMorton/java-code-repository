package com.skillstorm;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

public class AssignmentSubmission {
	
	// due date and time
	private static final DUE_DATE = LocalDateTime.of(2022, 11, 0, 8, 11, 59);
	
	
	// TODO encapsulate me
    private String student; // name
    private int score; // 0 to 100
    private boolean cheated; // true means they cheated, false means they didn't
    
    private LocalDateTime submittedAt;
    
    public AssignmentSubmission() {
    	super("Test Student", 0 , false, DUE_DATE);
    }
    
    public AssignmentSubmission(String student, int score) {
    	this(student, score, false, DUE_DATE.plusMinutes(1));
    }
    
    public AssignmentSubmission(String student, int score, boolean cheated, LocalDateTime submittedAt) {
    	setStudent(student);
    	setScore(score);
    	setCheated(cheated);
    	this.submittedAt = submittedAt;
    }

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score < 0)
			throw new IllegalArgumentException("Score cannot be negative");
		if (score > 100)
			throw new IllegalArgumentException("Score cannot be over 100");
		this.score = score;
	}

	public boolean isCheated() {
		return cheated;
	}

	public void setCheated(boolean cheated) {
		this.cheated = cheated;
	}
    
	public LocalDateTime getSubmittedAt() {
		return submittedAt;
	}
	
    public void setSubmittedAt(LocalDateTime submittedAt) {
    	// reject dates in the future
    	//LocalDateTime now = LocalDateTime.now();
    	//Period difference = Period.between(now, submittedAt);
    	
    	
    	
    	if (isInFuture(submittedAt)) {
    		throw new IllegalArgumentException("Cannot have futrure date and time");
    	}
    	this.submittedAt = submittedAt;
    }
    
    // true if in future
    public boolean isInFuture(LocalDateTime submittedAt) {
    	// step 1: get the seconds
    	// use Instant -- a Java class for working with Temporal objects
    	Instant nowInstant = Instant.now();
    	Instant submissionInstant = submittedAt.atZone(ZoneId.of("America/New_York")).toInstant();
    	
    	// step 2: subtract now - submittedAt
    	return nowInstant.isBefore(submissionInstant);
    	
    }
    
    public static int daysLate(AssignmentSubmission submission) {
    	// what to do if it is over a month late and .getDays() returns 1 instead of 32 days
    	// throw illegal argument exception
    
    	// convert to LocalDate bc Period dows not support time
    	LocalDate submitted = LocalDate.from(submission.getSubmittedAt());
    	LocalDate dueDate = LocalDate.from(AssignmentSubmission.DUE_DATE);
    	// get the period between them
    	Period lateness = Period.between(submitted,  dueDate);
    	// return the number of days
    	return lateness.getDays();
    	
    	
    }
    
    public static boolean isLate(AssignmentSubmission submission) {
    	// create two instances
    	// due date
    	// submission date
    	Instant submissionInstant = submission.getSubmittedAt().atZone(ZoneId.of("America/New_York")).toInstant();
    	Instant dueDateInstant = AssignmentSubmission.DUE_DATE.atZone(ZoneId.of("Americ/New_York")).toInstant();
    	
    	return dueDateInstant.isBefore(submissionInstant); // if submission was after due date return true
    }
    
    
}
