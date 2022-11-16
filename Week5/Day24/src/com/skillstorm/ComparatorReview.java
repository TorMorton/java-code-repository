package com.skillstorm;

import java.util.LinkedList;

public class ComparatorReview {

	public static void main(String[] args) {
		
		Suit suit1 = new Suit();
		Suit suit2 = new Suit("black", 200, true, 40, 300.99);
		Suit suit3 = new Suit("black", 200, true, 40, 300.99);
		Suit suit4 = new Suit("black", 250, true, 30, 300.99);
		Suit suit5 = new Suit("black", 250, true, 35, 300.99);		
		
		
		
		Suit suit6 = new Suit("black", 250, true, 40, 200.99);		
		Suit suit7 = new Suit("black", 250, true, 40, 200.99);		
		Suit suit8 = new Suit("black", 250, true, 35, 200.99);		
		Suit suit9 = new Suit("black", 250, true, 35, 200.99);
		
		
		Suit suit10 = new Suit("black", 200, true, 35, 100.99);
		Suit suit11 = new Suit("black", 200, true, 40, 100.99);
		Suit suit12 = new Suit("black", 250, true, 35, 200.99);
		Suit suit13 = new Suit("black", 250, true, 30, 200.99);
		
		LinkedList<Suit> suits = new LinkedList<>();
		suits.add(suit1);
		suits.add(suit2);
		suits.add(suit3);
		suits.add(suit4);
		suits.add(suit5);
		suits.add(suit6);
		suits.add(suit7);
		suits.add(suit8);
		suits.add(suit9);
		suits.add(suit10);
		suits.add(suit11);
		suits.add(suit12);
		suits.add(suit13);
		suits.sort(new ThreadCountComparator());
		for (Suit suit : suits) {
			System.out.println(suit);
		}
		
		
		
		
		
	}
	
}
