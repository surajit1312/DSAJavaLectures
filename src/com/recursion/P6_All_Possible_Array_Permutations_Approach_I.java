/**
 * 
 */
package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * Link: https://www.codingninjas.com/studio/problems/permuatations_892989
 */
public class P6_All_Possible_Array_Permutations_Approach_I {

	/**
	 * @param args
	 */
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
		ArrayList<Integer> ds = new ArrayList<Integer>();
		boolean[] freq = new boolean[size];
		Arrays.fill(freq, false);
		helper(arr, size, result, ds, freq);
		return result;
	}

	private static void helper(ArrayList<Integer> arr, int size, ArrayList<ArrayList<Integer>> result,
			ArrayList<Integer> ds, boolean[] freq) {
		if (size == ds.size()) {
			result.add(new ArrayList<Integer>(ds));
			return;
		}
		for (int i = 0; i < size; i++) {
			if (!freq[i]) {
				freq[i] = true;
				ds.add(arr.get(i));
				helper(arr, size, result, ds, freq);
				ds.remove(ds.size() - 1);
				freq[i] = false;
			}
		}
	}

}
