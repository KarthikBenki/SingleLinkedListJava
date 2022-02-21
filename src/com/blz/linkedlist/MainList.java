package com.blz.linkedlist;

public class MainList {

    public static void main(String[] args) {
	LinkedList l = new LinkedList();
	Queue_2 queue = new Queue_2();
	queue.enque(10);
	queue.enque(20);
	queue.enque(30);
	queue.showQueue();
	queue.deque();
	queue.showQueue();

    }

}
