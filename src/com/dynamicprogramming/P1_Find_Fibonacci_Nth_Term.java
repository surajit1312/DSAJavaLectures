/**
 * 
 */
package com.dynamicprogramming;

import java.util.Arrays;

/**
 * 
 */
public class P1_Find_Fibonacci_Nth_Term {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		// introducing dynamic programming here to memoize calculations
		int[] mem = new int[n + 1];
		Arrays.fill(mem, -1);
		mem[0] = 0;
		mem[1] = 1;
		int result = findFibonacciTerm(n, mem);
		System.out.println("Fibonacci series " + n + "th term is : " + result);
		System.out.print("Fibonacci series is below: ");
		for (int x : mem) {
			System.out.print(x + " ");
		}
	}

	private static int findFibonacciTerm(int n, int[] mem) {
		if (n >= 2) {
			if (mem[n] != -1) {
				return mem[n];
			} else {
				mem[n] = findFibonacciTerm(n - 1, mem) + findFibonacciTerm(n - 2, mem);
			}
			return mem[n];
		}
		return n;
	}

}
