package com.blz.linkedlist;

public class Stack_2 {
	LinkedList l = new LinkedList();
	/*
	 * Stack is a container of objects that are inserted 
	 * and removed according to the last-in first-out (LIFO) principle
	 * 
	 * 
	 */
	//in stack push is adding
	public void enque(Object data) {
		l.addLast(data);
	}
	
	//in stack pop is remove 
	public void pop() {
		l.deleteLast();
	}
	//to display pushed and popped data
	public void showStack() {
		l.displayList();
	}

}
