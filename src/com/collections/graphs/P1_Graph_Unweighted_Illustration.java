/**
 * 
 */
package com.collections.graphs;

import java.util.ArrayList;

/**
 *         0
 *          \       3
 *           \     / \
 *            \   /   \
 *             \ /     \
 *              2 ------1
 * 
 */
public class P1_Graph_Unweighted_Illustration {

	static class Edge {
		private int src;
		private int des;

		public Edge(int src, int des) {
			this.src = src;
			this.des = des;
		}

		public int getSource() {
			return this.src;
		}

		public int getDestination() {
			return this.des;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int v = 4;
		@SuppressWarnings("unchecked")
		ArrayList<Edge>[] graph = new ArrayList[v];
		createGraph(graph);

		// print all neighbors
		int[] targets = { 0, 1, 2, 3 };

		for (int i = 0; i < targets.length; i++) {
			System.out.print("Neighbors of " + targets[i] + ": ");
			for (int j = 0; j < graph[targets[i]].size(); j++) {
				System.out.print(graph[targets[i]].get(j).getDestination() + " ");
			}
			System.out.println();
		}
	}

	private static void createGraph(ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		// Adding edges from source 0
		graph[0].add(new Edge(0, 2));

		// Adding edges from source 1
		graph[1].add(new Edge(1, 2));
		graph[1].add(new Edge(1, 3));

		// Adding edges from source 2
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 1));
		graph[2].add(new Edge(2, 3));

		// Adding edges from source 3
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 2));

	}

}
