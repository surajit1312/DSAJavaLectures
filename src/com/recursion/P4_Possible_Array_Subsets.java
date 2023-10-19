/**
 * 
 */
package com.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Link: https://www.codingninjas.com/studio/problems/find-all-subsets_2041970
 */
public class P4_Possible_Array_Subsets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = { 3, 4, 5 };
		List<List<Integer>> result = findAllSubsets(input);
		System.out.println("All possible subsets of given array are: " + result);
	}

	private static List<List<Integer>> findAllSubsets(int[] arr) {
		List<Integer> subset = new ArrayList<Integer>();
		List<List<Integer>> result = getAllSubsets(arr, new ArrayList<List<Integer>>(), subset, 0);
		Collections.sort(result, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}
		});
		return result;
	}

	private static List<List<Integer>> getAllSubsets(int[] arr, List<List<Integer>> result, List<Integer> subset,
			int index) {
		if (index == arr.length) {
			if (subset.size() != 0) {
				result.add(subset);
			}
			return result;
		}
		// Take subset
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(subset);
		list.add(arr[index]);
		getAllSubsets(arr, result, list, index + 1);

		// Not Take subset
		getAllSubsets(arr, result, subset, index + 1);

		return result;
	}
}
