/**
 * 
 */
package com.recursion;

/**
 * 
 * Link: https://www.codingninjas.com/studio/problems/reverse-the-array_1230540
 */
public class P2_Reverse_Array_Elements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Use this incase proper calling method is not given 
		 * Scanner sc = new Scanner(System.in); 
		 * int n = sc.nextInt(); 
		 * int[] input = new int[n]; 
		 * for (int i = 0; i < n; i++) { input[i] = sc.nextInt(); }
		 * 
		 */
		int[] input = { 7, 5, 2, 11, 2, 43, 1, 10 };
		int n = 8;
		int[] reverse = reverseArray(input, n);
		for (int i : reverse) {
			System.out.print(i + " ");
		}
	}

	private static int[] reverseArray(int[] input, int n) {
		int start = 0;
		int end = n - 1;
		reverseHelper(input, start, end);
		return input;
	}

	private static void reverseHelper(int[] input, int start, int end) {
		// Base case
		if (input == null || input.length == 0) {
			return;
		}
		if (start >= end) {
			return;
		}

		// small calculation
		int temp = input[end];
		input[end] = input[start];
		input[start] = temp;

		// recursive call
		reverseHelper(input, start + 1, end - 1);
	}

}
