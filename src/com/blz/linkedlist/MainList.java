package com.blz.linkedlist;

public class MainList {

    public static void main(String[] args) {
	LinkedList l = new LinkedList();
	l.addFirst(10);
	l.addFirst(20);
	l.addFirst(30);
	l.addLast(40);
	l.displayList();
	l.searchData(15);
	int count = l.getSize();
	System.out.println("count = " + count);

    }

}
