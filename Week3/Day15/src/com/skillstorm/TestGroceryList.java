package com.skillstorm;

import java.util.ArrayList;

public class TestGroceryList {

	public static void main(String[] args) {
		
		// ALL OBJECTS
		//  1. in a constructor -- make a copy, don't use their copy
		// 2. in a setter -- make a copy don't use their copy
		// 3. in a getter -- don't return your copy, make a copy to return
		
		
		ArrayList<String> need = new ArrayList<>();
		need.add("coffee");
		need.add("toothpaste");
		need.add("eggs");
		
		GroceryList groceryList = new GroceryList(need);
		System.out.println(groceryList.getGroceriesList());
		
		need.add("captain crunch");
		System.out.println(groceryList.getGroceriesList());
	}
}
