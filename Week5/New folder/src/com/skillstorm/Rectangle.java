package com.skillstorm;

public class Rectangle {

	int width;
	int height;
	
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result + width;
		result = prime * result + height;
		return result;
	}
}
