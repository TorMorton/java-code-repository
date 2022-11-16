package com.skillstorm;

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		
		Node emptyNode = new Node();
		
		System.out.println(emptyNode.getValue());
		System.out.println(emptyNode.getNext());
		
		System.out.println();
		
		Node<String> funNode = new Node<>("Programming is fun");
		
		System.out.println(funNode.getValue());
		System.out.println(funNode.getNext());
		
		Node<String> myNewFunNode = new Node<>("I am mr. head", funNode);
		System.out.println(funNode);
		System.out.println(myNewFunNode.getNext());
		
		Node<Integer> myNumericallyFunNode = new Node<Integer>(42);
		
		// can not do this because myfunnode requiresa node of string type to be next
		//myFunNode.setNext(myNumericallyFunNode);
		
		System.out.println();
		
		MyLinkedList<String> stringList = new MyLinkedList<String>();
		
		stringList.add("It don't");
		stringList.add("small");
		stringList.add("leave me alone");
		stringList.add(null);
		stringList.add("help");
		stringList.add("help");
		stringList.add("fullon psycho");
		
		System.out.println(stringList.size());
		System.out.println(stringList.get(6));
		
		
		
	}

}
