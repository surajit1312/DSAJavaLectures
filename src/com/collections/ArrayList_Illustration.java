/**
 * 
 */
package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 
 */
public class ArrayList_Illustration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		int[] nums = { 5, 6, 2, 1, 9 };

		// Adding elements to ArrayList
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		System.out.println(list);

		// Get element at an index from ArrayList
		System.out.println("Element at index 2 in ArrayList is: " + list.get(2));

		// Adding elements to a specific index in ArrayList
		list.add(3, 10);
		System.out.println(list);

		// Set element at an index (say index = 4) in ArrayList
		list.set(4, 7);
		System.out.println(list);

		// Delete element from an index (say index = 2) of ArrayList
		list.remove(2);
		System.out.println(list);

		// Get size/length of ArrayList
		System.out.println("Size/Length of ArrayList: " + list.size());

		// Loop/Iterate on ArrayList elements

		// Method 1 - Using loops
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// Method 1 - Using Iterator
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Sorting the ArrayList elements
		Collections.sort(list);
		System.out.println("Sorted ArrayList: " + list);
	}

}
