package com.skillstorm;

import java.util.Comparator;

public class ThreadCountComparator implements Comparator<Suit> {

	// if equal return 0
	// if o1 < o2 return negative
	// if o1 > o2 return positive
	
	@Override
	public int compare(Suit o1, Suit o2) {
		return (int) (o1.getPrice() * 100) - (int)(o2.getPrice() * 100);
	}

}
