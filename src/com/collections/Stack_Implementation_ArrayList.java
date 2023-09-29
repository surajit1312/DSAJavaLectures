/**
 * 
 */
package com.collections;

import java.util.ArrayList;

/**
 * 
 */
public class Stack_Implementation_ArrayList {

	private ArrayList<Integer> list = new ArrayList<Integer>();

	private boolean isEmpty() {
		return list.size() == 0;
	}

	private void push(int data) {
		list.add(data);
	}

	private int pop() {
		if (isEmpty()) {
			return -1;
		}
		int top = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return top;
	}

	private int peek() {
		if (isEmpty()) {
			return -1;
		}
		return list.get(list.size() - 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack_Implementation_ArrayList s = new Stack_Implementation_ArrayList();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
