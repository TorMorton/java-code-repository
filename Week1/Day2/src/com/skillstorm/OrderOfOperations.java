package com.skillstorm;

public class OrderOfOperations {

	public static void main(String[] args) {
		//Order of operations
		
		//What will this equal
		int x = 3 + 4 *5;
		System.out.println(x);// x is 23
		
		//int y = x++; //this is the same as saying y = x; x = x + 1;
		int y = ++x; //this is the same as saying x = x + 1; y = x;
		System.out.println("y = " + y); // 24 because ++ adds
		
		//remember we are reusing x and y here
		//x = 24 to start
		//y = 24 to start
		int z = x++ + ++y; //old value of x + new value of y
		//unary operators are first before addition
		// x = 24 + 1 = 25
		// y = 24 + 1 = 25
		// z = 24 + 25 = 49
		System.out.println("z = " + z);
		
		//here x is not reassigned
		z = x + 1;
		System.out.println("z is now " + z + " and x is now " + x);
		
		
		//Logic Operators
		// > greater than
		// < less than
		// >= greater than or equal to
		// <= less than or equal to
		// == equals to
		// ! not
		// != not equal to
		
		// AND uses the & symbol
		// OR uses the | symbol
		
		// AND with && uses short circuit evaluation
		// ___&&____ 
		int someNumber = 9;
		if (someNumber > 10 & someNumber++ < 20) {
			
		}
		System.out.println("someNumber is now " + someNumber);
	}

}
