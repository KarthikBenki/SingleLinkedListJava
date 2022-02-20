package com.blz.linkedlist;

public class LinkedList {

    Node head;

    class Node {
	Object data;
	Node next;// creating a reference of same class inside class

	// constructor
	public Node(Object data) {
	    super();
	    this.data = data;
	}// end of constructor

    }// end of class node

    /*
     * Add Last method in linked list
     */
    public void addLast(Object data) {
	Node newNode = new Node(data);

	if (head == null)
	    head = newNode;
	else if (head.next == null)
	    head.next = newNode;
	else {
	    Node temp = head;
	    while (temp.next != null) {
		temp = temp.next;
	    }
	    temp.next = newNode;
	}
    }

    /*
     * displaying linked list
     */
    public void displayList() {
	if (head == null)
	    System.out.println("nothing to display");
	else {
	    Node temp = head;
	    while (temp.next != null) {
		System.out.print(temp.data + "=>");
		temp = temp.next;
	    }
	    System.out.println(temp.data);
	}
    }

    /*
     * delete first
     */
    public void deleteFirst() {
	if (head == null)
	    System.out.println("no elements to delete");
	else
	    head = head.next;
    }

    /*
     * Adding element at first
     */
    public void addFirst(Object data) {
	Node newNode = new Node(data);
	if (head == null)
	    head = newNode;
	else {
	    newNode.next = head;
	    head = newNode;
	}
    }

    /*
     * deleting element from last
     */
    public void deleteLast() {
	if (head == null)
	    System.out.println("no elements to delete");
	else if (head.next == null)
	    head = null;
	else {
	    Node temp = head;
	    while (temp.next.next != null)
		temp = temp.next;
	    temp.next = null;
	}

    }

    /*
     * Searching given data
     */
    public void searchData(Object data) {
	boolean isFound = false;
	if (head == null)
	    System.out.println("no elements to find");
	else {
	    Node temp = head;
	    while (temp.next != null) {
		if (temp.data == data) {
		    isFound = true;
		    break;
		}
		temp = temp.next;
	    }
	    if (temp.data == data)
		isFound = true;

	    if (isFound)
		System.out.println(data + " found");
	    else
		System.out.println(data + " not found");
	}
    }

    /*
     * calculating size of linked list
     */
    public int getSize() {
	int count = 0;
	if (head == null)
	    return count;
	else {
	    Node temp = head;
	    while (temp != null) {
		count++;
		temp = temp.next;
	    }
	    return count;
	}
    }

}
