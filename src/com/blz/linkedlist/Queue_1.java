package com.blz.linkedlist;

public class Queue_1 {
	LinkedList l = new LinkedList();
	/*
	 *  Queue is a container of objects (a linear collection) that are inserted and removed according 
	 *  to the first-in first-out (FIFO) principle.
	 */
	//in stack push is adding
	public void enque(Object data) {
		l.addFirst(data);
	}
	
	//in stack pop is remove 
	public void deque() {
		l.deleteLast();
	}
	//to display pushed and popped data
	public void showQueue() {
		l.displayList();
	}

}
