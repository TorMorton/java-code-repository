package com.skillstorm;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueues {

	public static void main(String[] args) {

		/*
		 * STACKS VS QUEUES
		 * 
		 * Stacks are last in first our
		 * - like a stack of plates
		 * - like the Java call stack
		 * - think of a stack like a pile; you have to get the thing on top first
		 * 
		 * Queues are first in first out
		 * - like a line at the supermarket is supposed to work
		 * - like a karaoke playlist
		 * - queue is like a line
		 * 
		 * also something called a deque, which stands fro double-ended queue
		 * - you can get items from the back too
		 * 
		 */
		
		// declare a stack just like any other data structure (ArrayList, LinkedList, etc.)
		Stack<String> myTowels = new Stack<String>();
		
		// three main functions for a stack:
		// to add, use push()
		myTowels.push("Fluffy");
		myTowels.push("The Eiffel Towel");
		myTowels.push("The Exfoliator");
		myTowels.push("The Leaning Towel of Pisa");
		
		System.out.println(myTowels);
		
		// to see what's on top, use peek()
		// doesn't do anything with it
		System.out.println(myTowels.peek());
		
		// to take the top one off, use pop()
		// also returns the value
		
		// can take the value and print it or do whatever with it
		//System.out.println(myTowels.pop());
		myTowels.pop();
		System.out.println(myTowels);
		
		// QUEUES
		// declare a queue just like any other data structure
		Queue<String> myPlanets = new LinkedList<String>();
		
		// to add we use offer()
		myPlanets.offer("Saturn");
		myPlanets.offer("Earth");
		myPlanets.offer("Wolftopia");
		myPlanets.offer("Hollywood");
		
		System.out.println(myPlanets);
		
		// just like with stacks, use peek() to see what's next
		// doesn't do anything with it
		
		System.out.println(myPlanets.peek());
		
		// to remove the first item and return it use pool()
		myPlanets.poll();
		System.out.println(myPlanets);

	}

}
