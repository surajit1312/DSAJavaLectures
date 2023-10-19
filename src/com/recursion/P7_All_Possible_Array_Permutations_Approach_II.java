/**
 * 
 */
package com.recursion;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Link: https://www.codingninjas.com/studio/problems/permuatations_892989
 */
public class P7_All_Possible_Array_Permutations_Approach_II {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3 };
		ArrayList<Integer> input = new ArrayList<Integer>();
		Collections.addAll(input, arr);
		int size = 3;
		ArrayList<ArrayList<Integer>> result = permutations(input, size);
		System.out.println("All possible permutations of " + input + " are : " + result);
	}

	private static ArrayList<ArrayList<Integer>> permutations(ArrayList<Integer> arr, int size) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		helper(arr, size, 0, result);
		return result;
	}

	private static void helper(ArrayList<Integer> arr, int size, int index, ArrayList<ArrayList<Integer>> result) {
		if (index == size) {
			ArrayList<Integer> ds = new ArrayList<Integer>(arr);
			result.add(ds);
			return;
		}
		for (int j = index; j < size; j++) {
			swap(arr, index, j);
			helper(arr, size, index + 1, result);
			swap(arr, index, j);
		}
	}

	private static void swap(ArrayList<Integer> arr, int a, int b) {
		Integer temp = arr.get(a);
		arr.set(a, arr.get(b));
		arr.set(b, temp);
	}

}
