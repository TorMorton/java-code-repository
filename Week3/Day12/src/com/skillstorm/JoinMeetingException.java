package com.skillstorm;

public class JoinMeetingException extends Exception{

	public JoinMeetingException() {
		super("Unable to join meeting.");
	}
	

	public JoinMeetingException(String message) {
		super(message);
	}
	
	public JoinMeetingException(Throwable cause) {
		super(cause);
	}
}
