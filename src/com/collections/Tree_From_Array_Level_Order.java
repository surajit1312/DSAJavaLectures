/**
 * 
 */
package com.collections;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.data = data;
	}
}

/**
 * Form a tree from array 
 * 
 * Input: arr: { 1, 2, 3, 4, 5, 6, 7 }
 * 
 * Output:
 *
 *               1
 *             /   \
 *            /     \
 *           2       3              2 -> 2 * i + 1                           3 ->   2 * i + 2,                i = 0
 *          / \     / \
 *         4   5   6   7            4 & 6   -> 2 * i + 1, 2 * i + 1          5 & 7 -> 2 * i + 2, 2 * i + 2,   i = 2
 *         
 */
public class Tree_From_Array_Level_Order {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input1 = { 1, 2, 3, 4, 5, 6, 7 };
		Tree_From_Array_Level_Order tree = new Tree_From_Array_Level_Order();
		TreeNode root = tree.insertTreeLevelOrder(input1, 0);
		System.out.println(root);
	}

	private TreeNode insertTreeLevelOrder(int[] arr, int index) {
		TreeNode root = null;
		if (index < arr.length) {
			root = new TreeNode(arr[index]);
			root.left = insertTreeLevelOrder(arr, 2 * index + 1);
			root.right = insertTreeLevelOrder(arr, 2 * index + 2);
		}
		return root;
	}
}
