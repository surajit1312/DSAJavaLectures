/**
 * 
 */
package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 */
public class LinkedList_Illustration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		System.out.println("Size of LinkedList: " + list.size());

		list.addFirst("this");
		list.add("list");
		System.out.println(list);
		System.out.println("Size of LinkedList: " + list.size());

		// Iterate through list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " -->  ");
		}
		System.out.println("NULL");

		list.removeFirst();
		System.out.println(list);
		System.out.println("Size of LinkedList: " + list.size());

		list.remove(2);
		System.out.println(list);
		System.out.println("Size of LinkedList: " + list.size());

		// Iterate using iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " -->  ");
		}
		System.out.println("NULL");
	}

}
