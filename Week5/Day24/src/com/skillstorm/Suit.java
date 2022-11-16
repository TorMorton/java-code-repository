package com.skillstorm;

public class Suit {
	
	private int threadCount;
	private String color;
	private boolean hasTie;
	private int size;
	private double price;
	
	public Suit() {
		super();
	}
	
	public Suit(String color, int threadCount, boolean hasTie, int size, double price) {
		setColor(color);
		setThreadCount(threadCount);
		setHasTie(hasTie);
		setSize(size);
		setPrice(price);
		
	}

	public String getColor() {
		return color;
	}
	
	public boolean isHasTie() {
		return hasTie;
	}

	public void setHasTie(boolean hasTie) {
		this.hasTie = hasTie;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size < 30 || size > 60) {
			throw new IllegalArgumentException("Invalid size. Please enter a value between 30 and 60.");
		}
 	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		if (price < 0) {
			throw new IllegalArgumentException("Please provide a nonnegative price");
		}
		this.price = price;
	}
	
	
	public void setColor(String color) {
		if (color == null || color.isEmpty()) {
			throw new IllegalArgumentException("Please provide a valid color");
		}
		this.color = color;
	}
	
	public void setThreadCount(int count) {
		if (count < 100 || count > 300) {
			throw new IllegalArgumentException("Please provide a number between 100 and 300");
		}
		this.threadCount = count;
		
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (this.getClass() != o.getClass()) {
			return false;
		}
		Suit other = (Suit) o;
		if (other.color == null) {
			return false;
		}
	}

	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = result * prime + color.hashCode();
		result = result * prime + (hasTie ? 1 : 0);
		result = result * prime + threadCount;
		result = result * prime + size;
		result = result * prime + (int)(price * 100);
		
	}
	
	
}
