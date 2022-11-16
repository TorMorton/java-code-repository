package com.skillstorm;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceriesList;
	
	public GroceryList() {
		this.groceriesList = new ArrayList<>();
	}
	
	public GroceryList(ArrayList groceries) {
		this.groceriesList = new ArrayList<>(groceries);
	}
	
	public ArrayList<String> getGroceriesList() {
		return this.groceriesList;
	}
	
	public void addToList(String item) {
		this.groceriesList.add(item);
	}
	
	
}
