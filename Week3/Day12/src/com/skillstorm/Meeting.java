package com.skillstorm;

public class Meeting {
	
	public static final int MAX_NUMBER_OF_PEOPLE = 4;
	private int numOfPeople = 0;
	private int[] people = {0, 0}; // this will hold the number of guests and the number of members
	private Attendee[] attendees;
	
	public Meeting() {
		super();
		this.numOfPeople= 0;
		this.people = new int[2]; 
		this.attendees = new Attendees[MAX_NUMBER_OF_PEOPLE];
	}
	
	public Meeting (int numberOfPeopleInMeeting, int[] people) {
		
	}
	
	public int getNumPeople() {
		return this.numOfPeople;
	}
	
	public void add(Attendee attendee) throws JoinMeetingException{
		try {
			attendees[numOfPeople] = attendee;
			numOfPeople++;
			System.out.println("The meeting now has " + numOfPeople + " people");
		} catch(ArrayIndexOutOfBoundsException e) {
			throw new JoinMeetingException("The meeting is full.");
		}
		
		
	}
	
	private void trackAttendeesType(Member attendee) {
		people[0]++;
	}
	
	private void trackAttendeesType(Guest attendee) {
		people[1]++;
	}
}
