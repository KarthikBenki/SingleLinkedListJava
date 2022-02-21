package com.blz.linkedlist;

public class Queue_2 {
	LinkedList l = new LinkedList();
	/*
	 *  Queue is a container of objects (a linear collection) that are inserted and removed according 
	 *  to the first-in first-out (FIFO) principle.
	 */
	//in queue enque is adding
	public void enque(Object data) {
		l.addLast(data);
	}
	
	//in queue deque is remove 
	public void deque() {
		l.deleteFirst();
	}
	//to display enqued and dequed data
	public void showQueue() {
		l.displayList();
	}

}
