package com.skillstorm;

public class BetterBilliardBall {
	
	private byte number;
	
//	public BetterBilliardBall() {
//		super();
//	}
	
	public BetterBilliardBall(byte number) {
		if (number >= 0 && number <= 15) 
			this.number = number;
		else
			System.out.println("invalid ball");
	}
	
	public BetterBilliardBall setNumber(byte number) {
		if (number >= 0 && number <= 15) 
			this.number = number;
		else
			System.out.println("invalid ball");
		return this;
	}
	
	public String getPattern() {

		if (number <= 8)
			return "solid";
		else
			return "striped";
		
	}
	
	public String getColor() {
		
		switch (this.number) {
		
			case 0:
				return "white";
			case 1:
			case 9:
				return "Yellow";
			case 2:
			case 10:
				return "Blue";
			case 3:
			case 11:
				return "Red";
			case 4:
			case 12:
				return "Purple";
			case 5:
			case 13:
				return "Orange";
			case 6:
			case 14:
				return "Green";
			case 7:
			case 15:
				return "Maroon";
			case 8:
				return "Black";
				default: return "invalid number";
		}
		
		
	}
}
