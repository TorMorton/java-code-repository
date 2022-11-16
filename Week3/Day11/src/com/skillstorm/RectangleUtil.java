package com.skillstorm;

public class RectangleUtil {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(5, 6);
		System.out.println("This rectangle's length is " + rectangle.getLength() + " and width is " + rectangle.getWidth());
		doubleRectangle(rectangle);
		
		System.out.println("This rectangle's length is " + rectangle.getLength() + " and width is " + rectangle.getWidth());
		
		System.out.println();
		
		Rectangle otherRectangle = new Rectangle(8,6);
		System.out.println("This rectangle's length is " + otherRectangle.getLength() + " and width is " + otherRectangle.getWidth());
		halveRectangle(otherRectangle);
		
		System.out.println("This rectangle's length is " + otherRectangle.getLength() + " and width is " + otherRectangle.getWidth());
		
		
	}
	
	
	public static void doubleRectangle(Rectangle rect) {
		int length = rect.getLength() * 2;
		rect.setLength(length);
		int width = rect.getWidth() * 2;
		rect.setWidth(width);
		System.out.println("The square now has a length of " + length + " and a width of " + width);
	}
	
	public static void halveRectangle(Rectangle rect) {
		int length = rect.getLength() / 2;
		int width = rect.getWidth() / 2;
		System.out.println("The square has a length of " + length + " and a width of " + width);
	}
}
