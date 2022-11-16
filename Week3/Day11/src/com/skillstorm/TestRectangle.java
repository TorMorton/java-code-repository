package com.skillstorm;

import java.util.Scanner;

public class TestRectangle {
public static void main(String[] args) {
		
	//make class fully encapsulated
		
		Rectangle yourRectangle = new Rectangle();
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Please enter the desired length of your rectangle: ");
		int length = myScan.nextInt();
		boolean userInputIsValid = false;
		while (!userInputIsValid) {
			try {
				yourRectangle.setLength(length);
				userInputIsValid = true;
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Please enter the desired width of your rectangle: ");
		int width = myScan.nextInt();
		userInputIsValid = false;
		while (!userInputIsValid) {
			try {
				yourRectangle.setWidth(width);
				userInputIsValid = true;
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		System.out.println();
		
		Rectangle myRectangle = new Rectangle(1, 3);
		
		System.out.println(myRectangle.getLength());
		System.out.println(myRectangle.getWidth());
		System.out.println(myRectangle.toString());
		
		
		
		myScan.close();
		
	}

}
