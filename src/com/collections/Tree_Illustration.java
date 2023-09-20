/**
 * 
 */
package com.collections;

import java.util.Scanner;

class Node {
	Node left;
	Node right;
	int data;

	public Node(int data) {
		this.data = data;
	}
}

/**
 *               2
 *             /   \
 *            /     \
 *           4       1
 *          /       / \
 *         7       8   3
 */
public class Tree_Illustration {

	private static Scanner sc = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
		System.out.println("Tree has been created!" + root);

		System.out.println("Tree Traversal - In-Order");
		inOrder(root);
		System.out.println("");

		System.out.println("Tree Traversal - Pre-Order");
		preOrder(root);
		System.out.println("");

		System.out.println("Tree Traversal - Post-Order");
		postOrder(root);
		System.out.println("");
	}

	private static Node createTree() {
		Node root = null;

		System.out.println("Enter data for the node : ");
		int data = sc.nextInt();
		if (data == -1) {
			return null;
		}
		root = new Node(data);

		System.out.println("For left of node " + data);
		root.left = createTree();

		System.out.println("For right of node " + data);
		root.right = createTree();

		return root;
	}

	/**
	 * In-Order Traversal (Left Node Right - LNR)
	 */
	private static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	/**
	 * Pre-Order Traversal (Node Left Right - NLR)
	 */
	private static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	/**
	 * Post-Order Traversal (Left Right Node - LRN)
	 */
	private static void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

}
