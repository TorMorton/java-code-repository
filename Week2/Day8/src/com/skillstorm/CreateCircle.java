package com.skillstorm;


public class CreateCircle {

	public static void main(String[] args) {
		
		
		Circle myCircle = new Circle();
	
		System.out.println();
		
		System.out.println(myCircle.toString());
		
		System.out.println();
		
		Circle nextCircle = new Circle(7);

		
		System.out.println();
		
		System.out.println(myCircle.toString());
		
		System.out.println();

		System.out.println(myCircle.isEqual(myCircle, nextCircle));
	}

}
