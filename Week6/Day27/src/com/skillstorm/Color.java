package com.skillstorm;

public enum Color {

	RED("#FF0000"),
	ORANGE("#FFA500"),
	YELLOW("#FFFF00"),
	GREEN("#008000"),
	BLUE("#0000FF");
	
	private String hexValue;
	
	private Color(String hexValue) {
		this.hexValue = hexValue;
	}
	
	public String getHexValue() {
		return hexValue;
	}
	
	// should we create a setter?
	// NO these are constants (final) so should not be changing
	
}
