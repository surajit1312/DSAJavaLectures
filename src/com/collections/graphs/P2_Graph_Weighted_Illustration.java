/**
 * 
 */
package com.collections.graphs;

import java.util.ArrayList;

/**
 *         0
 *          \         3
 *           \       / \
 *        (2) \ (-1)/   \ (0)
 *             \   /     \
 *               2  ------1
 *                   (10)
 */
public class P2_Graph_Weighted_Illustration {

	static class WeightedEdge {
		private int src;
		private int des;
		private int weight;

		public WeightedEdge(int src, int des, int weight) {
			this.src = src;
			this.des = des;
			this.weight = weight;
		}

		public int getSource() {
			return this.src;
		}

		public int getDestination() {
			return this.des;
		}

		public int getWeight() {
			return this.weight;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int v = 4;
		@SuppressWarnings("unchecked")
		ArrayList<WeightedEdge>[] graph = new ArrayList[v];
		createGraph(graph);

		// print all neighbors with weights
		int[] targets = { 0, 1, 2, 3 };

		for (int i = 0; i < targets.length; i++) {
			System.out.print("Neighbors of " + targets[i] + ": ");
			for (int j = 0; j < graph[targets[i]].size(); j++) {
				System.out.print(graph[targets[i]].get(j).getDestination() + " (" + graph[targets[i]].get(j).getWeight() + ") ");
			}
			System.out.println();
		}
	}

	private static void createGraph(ArrayList<WeightedEdge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<WeightedEdge>();
		}
		// Adding edges from source 0
		graph[0].add(new WeightedEdge(0, 2, 2));

		// Adding edges from source 1
		graph[1].add(new WeightedEdge(1, 2, 10));
		graph[1].add(new WeightedEdge(1, 3, 0));

		// Adding edges from source 2
		graph[2].add(new WeightedEdge(2, 0, 2));
		graph[2].add(new WeightedEdge(2, 1, 10));
		graph[2].add(new WeightedEdge(2, 3, -1));

		// Adding edges from source 3
		graph[3].add(new WeightedEdge(3, 1, 0));
		graph[3].add(new WeightedEdge(3, 2, -1));

	}

}
