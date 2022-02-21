package com.blz.linkedlist;

public class Stack_1 {
	LinkedList l = new LinkedList();
	/*
	 * Stack is a container of objects that are inserted 
	 * and removed according to the last-in first-out (LIFO) principle
	 * 
	 * 
	 */
	//in stack push is adding
	public void push(Object data) {
		l.addFirst(data);
	}
	
	//in stack pop is remove 
	public void pop() {
		l.deleteFirst();
	}
	//to display pushed and popped data
	public void showStack() {
		l.displayList();
	}

}
