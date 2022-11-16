package com.skillstorm;

public class Review {

	public static void main(String[] args) {
		
		// STACK AND HEAP
		
		// for the Stack, local variables and their values are stored here
		
		
		// the minuted this for loop is complete, the i variable is removed from the stack
		for(int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}
		
		//cannot access i here because it was removed from the stack after loop completed
		
		System.out.println(add(5, 7));
		
		//cannot do either one of these, because these loval cariables from the add() method
		// were removed from stack after add method complete
		// system.out.println(first);
		// system.out.println(sum);

		Object myObject = new Object();
		System.out.println(myObject);
		
		BilliardBall myBall = new BilliardBall("Black", (byte)8, true);
		
		//CAN dot this if color is public because its value lives in the heap
		// system.out.println(myBall.myColor);
		
		System.out.println(myBall);
		
		BilliardBall myBall2 = myBall;
		BilliardBall myBall3 = myBall;
		

		//this does not remove the object from the heap, because other references remain
		myBall = null;
		
		//when I do this, the BiliardBall referred to b y myBall is now eligible for garvage collection
		// no references to it remain
		myBall2 = null;
		myBall3 = myBall;
		
		System.out.println(myBall);
		
		BilliardBall myNewBall = new BilliardBall("Black", (byte)8, true);
		
		System.out.println(myNewBall);
		
		myNewBall.setNumber((byte) 13);
		
		System.out.println(myNewBall);
		
		BetterBilliardBall myBetterBall = new BetterBilliardBall((byte)15);
		
		System.out.println(myBetterBall.getPattern());
		
		myBetterBall.setNumber((byte) 6).getPattern();
		System.out.println(myBetterBall.getColor());
		
		BetterBilliardBall myCueBall = new BetterBilliardBall((byte)-50);
		
		System.out.println(myCueBall.getColor());
		
	}
	
	public static int add(int first, int second) {
		int sum = first + second;
		return sum;
	}

}
