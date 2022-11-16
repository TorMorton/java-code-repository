package com.skillstorm;

import java.util.ArrayList;

public class ProgrammerTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> danLangs = new ArrayList<String>();
		danLangs.add("Python");
		danLangs.add("Java");
		danLangs.add("JavaScript");
		
		Programmer steelyDan = new Programmer("Steely Dan", "Verizon", danLangs);
		System.out.println(steelyDan.toString());
		steelyDan.add(null);
		steelyDan.forget("Java");
		
		System.out.println(steelyDan.toString());
		
		ArrayList<String> marthaLangs = new ArrayList<String>();
		marthaLangs.add("Python");
		marthaLangs.add("C++");
		marthaLangs.add("HTML");
		
		Programmer marthaWay = new Programmer("Martha Way", "AT&T", marthaLangs);
		System.out.println(marthaWay.toString());
		marthaWay.add("Java");
		System.out.println(marthaWay.toString());
		marthaWay.forget("HTML");
		System.out.println(marthaWay.toString());
	}

}
