package com.skillstorm;

import java.util.ArrayList;

public class Programmer {
	
	private String name;
	private String companyName;
	private ArrayList<String> programLanguages;
	
	public Programmer() {
		
	}
	
	public Programmer(String name, String companyName, ArrayList<String> programLanguages) {
		this.name = name;
		this.companyName = companyName;
		this.programLanguages = programLanguages;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public ArrayList<String> getProgramLanguages() {
		return new ArrayList<String>(this.programLanguages);
	}

	public void setProgramLanguages(ArrayList<String> programLanguages) {
		this.programLanguages = new ArrayList<String>();
	}

	public void add(String language) {
		if (language == null) {
			System.out.println("invalid input");
		}else
			this.programLanguages.add(language);
		
	}

	public void forget(String language) {
			for(int i = 0; i < programLanguages.size()-1; i++) {
				if (language.equals(programLanguages.get(i))) 
					this.programLanguages.remove(language);
			}
			
		}

	public String toString() {
		return "Programmer name: " + name + ", Company: " + companyName + ", Program Languages Known: " + programLanguages;
	}
	
	
	
}
