package com.skillstorm;

public class BilliardBall {

	//instance variables like these live in the heap (they persist as long as the BilliardBall object does
	private String color;
	private byte number;
	private boolean solid;
	
	public BilliardBall() {
		super();
	}

	//local variables like these live in the stack and are removed when constructor finishes
	public BilliardBall(String color, byte number, boolean solid) {
		super();
		this.color = color;
		this.number = number;
		this.solid = solid;
	}
	
	public String getColor() {
		return color;
	}
	
	public byte getNumber() {
		return number;
	}
	
	public boolean isSolid() {
		return solid;
	}
	
	public BilliardBall setColor(String color) {
		this.color = color;
		return this;
	}
	
	@Override
	public String toString() {
		return "BilliardBall [color=" + color + ", number=" + number + ", solid=" + solid + "]";
	}

	public BilliardBall setNumber(byte number) {
		this.number = number;
		return this;
	}
	
	public BilliardBall isSolid(boolean solid) {
		this.solid = solid;
		return this;
	}
}
