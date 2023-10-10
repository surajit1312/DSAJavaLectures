/**
 * 
 */
package com.collections.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *      1 ------- 3
 *     /          |\
 *    /           | \
 *   0            |  5 --- 6
 *    \           | /
 *     \          |/
 *      2 ------- 4
 */
public class P3_Graph_BFS_Traversal_Illustration {

	static class BFSEdge {
		int src;
		int des;

		public BFSEdge(int src, int des) {
			this.src = src;
			this.des = des;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int v = 7;
		@SuppressWarnings("unchecked")
		ArrayList<BFSEdge>[] graph = new ArrayList[v];
		createGraph(graph);
		// print all neighbors
		int[] targets = { 0, 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < targets.length; i++) {
			System.out.print("Neighbors of " + targets[i] + ": ");
			for (int j = 0; j < graph[targets[i]].size(); j++) {
				System.out.print(graph[targets[i]].get(j).des + " ");
			}
			System.out.println();
		}
		boolean[] visited = new boolean[v];
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				ArrayList<Integer> traverseBFS = traverseGraphBFS(graph, i, visited);
				result.add(traverseBFS);
			}
		}
		System.out.println("Breadth First Search Traversal of graph: " + result);
	}

	private static void createGraph(ArrayList<BFSEdge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<BFSEdge>();
		}

		// creating edges from 0
		graph[0].add(new BFSEdge(0, 1));
		graph[0].add(new BFSEdge(0, 2));

		// creating edges from 1
		graph[1].add(new BFSEdge(1, 0));
		graph[1].add(new BFSEdge(1, 3));

		// creating edges from 2
		graph[2].add(new BFSEdge(2, 0));
		graph[2].add(new BFSEdge(2, 4));

		// creating edges from 3
		graph[3].add(new BFSEdge(3, 1));
		graph[3].add(new BFSEdge(3, 4));
		graph[3].add(new BFSEdge(3, 5));

		// creating edges from 4
		graph[4].add(new BFSEdge(4, 2));
		graph[4].add(new BFSEdge(4, 3));
		graph[4].add(new BFSEdge(4, 5));

		// creating edges from 5
		graph[5].add(new BFSEdge(5, 3));
		graph[5].add(new BFSEdge(5, 4));
		graph[5].add(new BFSEdge(5, 6));

		// creating edges from 6
		graph[6].add(new BFSEdge(6, 5));
	}

	private static ArrayList<Integer> traverseGraphBFS(ArrayList<BFSEdge>[] graph, int start, boolean[] visited) {
		ArrayList<Integer> traverse = new ArrayList<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(graph[start].get(start).src);
		while (!queue.isEmpty()) {
			int current = queue.poll();
			if (!visited[current]) {
				traverse.add(current);
				visited[current] = true;
				for (int i = 0; i < graph[current].size(); i++) {
					queue.add(graph[current].get(i).des);
				}
			}
		}
		return traverse;
	}

}
