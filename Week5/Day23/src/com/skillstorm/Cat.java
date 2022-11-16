package com.skillstorm;

public class Cat implements Comparable{

	int cutenessLevel;
	String name;

	@Override
	// returns negative when 
	// returns 0 when
	// returns positive when
	
	public Cat() {
		super();
	}
	
	public Cat(String name, int cutenessLevel) {
		this.cutenessLevel = cutenessLevel;
		this.name = name;
	}
	

	
	
	public int compareTo(Object o) {
		Cat other = (Cat) o;
		if(this.cutenessLevel < other.cutenessLevel) {
			return -1;
		}else if(this.cutenessLevel > other.cutenessLevel) {
			return 1;
		}else {
			return 0;
		}
		
		
		//instead just do
		// return this.cuteness - o.cuteness;
	}

	public int getCutenessLevel() {
		return cutenessLevel;
	}

	public void setCutenessLevel(int cutenessLevel) {
		this.cutenessLevel = cutenessLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
