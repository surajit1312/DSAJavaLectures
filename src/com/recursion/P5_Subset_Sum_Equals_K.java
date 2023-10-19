/**
 * 
 */
package com.recursion;

/**
 * Link:
 * https://www.codingninjas.com/studio/problems/subset-sum-equal-to-k_1550954
 */
public class P5_Subset_Sum_Equals_K {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input1 = { 6, 1, 2, 1 };
		int n1 = 4;
		int k1 = 4;
		boolean doesSumExist1 = subsetSumToK(n1, k1, input1);
		System.out.println("Subset of array has sum " + k1 + ": " + doesSumExist1);

		int[] input2 = { 2, 5, 1, 6, 7 };
		int n2 = 5;
		int k2 = 4;
		boolean doesSumExist2 = subsetSumToK(n2, k2, input2);
		System.out.println("Subset of array has sum " + k2 + ": " + doesSumExist2);
	}

	private static boolean subsetSumToK(int n, int k, int arr[]) {
		return sumSubsetHelper(arr, 0, k, n, 0);
	}

	private static boolean sumSubsetHelper(int arr[], int sum, int targetSum, int n, int index) {
		if (index == n) {
			if (sum == targetSum) {
				return true;
			} else {
				return false;
			}
		}
		// Not take
		boolean recurCall2 = sumSubsetHelper(arr, sum, targetSum, n, index + 1);
		// Take
		boolean recurCall1 = sumSubsetHelper(arr, sum + arr[index], targetSum, n, index + 1);
		return recurCall1 || recurCall2;
	}

}
