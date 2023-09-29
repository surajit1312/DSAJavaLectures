/**
 * 
 */
package com.collections;

class StackNodeLL {
	int data;
	StackNodeLL next;

	public StackNodeLL(int data) {
		this.data = data;
		this.next = null;
	}
}

/**
 * 
 */
public class Stack_Implementation_LinkedList {

	private static StackNodeLL head;

	private boolean isEmpty() {
		return head == null;
	}

	private void push(int data) {
		StackNodeLL newNode = new StackNodeLL(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	private int pop() {
		if (isEmpty()) {
			return -1;
		}
		int top = head.data;
		head = head.next;
		return top;
	}

	private int peek() {
		if (isEmpty()) {
			return -1;
		}
		return head.data;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack_Implementation_LinkedList s = new Stack_Implementation_LinkedList();
		s.push(1);
		s.push(2);
		s.push(3);

		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
