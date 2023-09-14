/**
 * 
 */
package com.collections;

/**
 * 
 */
public class LinkedList_Implementation {

	private Node head;
	private int size;

	class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	// Add element to the beginning of LinkedList
	public void addFirst(String data) {
		Node newNode = new Node(data);
		this.size++;
		if (this.head == null) {
			this.head = newNode;
			return;
		}
		newNode.next = this.head;
		this.head = newNode;
	}

	// Add element to the end of LinkedList
	public void addLast(String data) {
		Node newNode = new Node(data);
		this.size++;
		if (this.head == null) {
			this.head = newNode;
			return;
		}
		Node currentNode = this.head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}

	// Print LinkedList
	public void printLinkedList() {
		Node currentNode = this.head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " --> ");
			currentNode = currentNode.next;
		}
		System.out.println("NULL");
	}

	// Delete first element of the LinkedList
	public void deleteFirst() {
		this.size--;
		if (this.head == null) {
			System.out.println("The list is empty!");
			return;
		}
		this.head = this.head.next;
	}

	// Delete last element of the LinkedList
	public void deleteLast() {
		if (this.head == null) {
			System.out.println("The list is empty!");
			return;
		}
		this.size--;
		if (this.head.next == null) {
			this.head = null;
			return;
		}
		Node currentNode = this.head;
		Node secondLastNode = null;
		while (currentNode.next != null) {
			secondLastNode = currentNode;
			currentNode = currentNode.next;
		}
		secondLastNode.next = null;
	}

	// Get size of the LinkedList
	public int getSize() {
		return this.size;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList_Implementation ll = new LinkedList_Implementation();
		ll.addFirst("a");
		ll.addFirst("is");
		ll.printLinkedList();
		System.out.println("Size of LinkedList: " + ll.getSize());

		ll.addLast("list");
		ll.addFirst("this");
		ll.printLinkedList();
		System.out.println("Size of LinkedList: " + ll.getSize());

		ll.deleteFirst();
		ll.printLinkedList();
		System.out.println("Size of LinkedList: " + ll.getSize());

		ll.deleteLast();
		ll.printLinkedList();
		System.out.println("Size of LinkedList: " + ll.getSize());
	}

}
