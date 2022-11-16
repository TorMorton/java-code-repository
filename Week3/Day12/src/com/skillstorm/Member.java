package com.skillstorm;

public class Member implements Attendee{
	
	String name;
	
	public Member() {
		super();
	}
	public Member(String name) {
		this.name = name;
	}

	public void join(Meeting meeting) {
		try {
			meeting.add(this);
			System.out.println();
		}
	}
	
	
}
