package com.skillstorm;

public class Circle implements Shape {

	// This circle MUST include this method, because the interface says it has to
	@Override
	public void declareMyself() {
		System.out.println("I am a circle and I have no corners.");
		
	}

}
