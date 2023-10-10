/**
 * 
 */
package com.collections.graphs;

import java.util.ArrayList;

/**
 *      1 ------- 3
 *     /          |\
 *    /           | \
 *   0            |  5 --- 6
 *    \           | /
 *     \          |/
 *      2 ------- 4
 */
public class P5_Graph_DFS_Find_All_Paths {

	static class DFSEdgeAllPath {
		int src;
		int des;

		public DFSEdgeAllPath(int src, int des) {
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
		ArrayList<DFSEdgeAllPath>[] graph = new ArrayList[v];
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
		int start = 0, target = 5;
		String paths = start + "";
		System.out.println("Paths from " + start + " to " + target + " are: ");
		findAllPaths(graph, start, target, visited, paths);
	}

	private static void createGraph(ArrayList<DFSEdgeAllPath>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<DFSEdgeAllPath>();
		}

		// creating edges from 0
		graph[0].add(new DFSEdgeAllPath(0, 1));
		graph[0].add(new DFSEdgeAllPath(0, 2));

		// creating edges from 1
		graph[1].add(new DFSEdgeAllPath(1, 0));
		graph[1].add(new DFSEdgeAllPath(1, 3));

		// creating edges from 2
		graph[2].add(new DFSEdgeAllPath(2, 0));
		graph[2].add(new DFSEdgeAllPath(2, 4));

		// creating edges from 3
		graph[3].add(new DFSEdgeAllPath(3, 1));
		graph[3].add(new DFSEdgeAllPath(3, 4));
		graph[3].add(new DFSEdgeAllPath(3, 5));

		// creating edges from 4
		graph[4].add(new DFSEdgeAllPath(4, 2));
		graph[4].add(new DFSEdgeAllPath(4, 3));
		graph[4].add(new DFSEdgeAllPath(4, 5));

		// creating edges from 5
		graph[5].add(new DFSEdgeAllPath(5, 3));
		graph[5].add(new DFSEdgeAllPath(5, 4));
		graph[5].add(new DFSEdgeAllPath(5, 6));

		// creating edges from 6
		graph[6].add(new DFSEdgeAllPath(6, 5));
	}

	private static void findAllPaths(ArrayList<DFSEdgeAllPath>[] graph, int current, int target, boolean[] visited,
			String paths) {
		if (current == target) {
			System.out.println(paths);
			return;
		}
		if (!visited[current]) {
			visited[current] = true;
			for (int i = 0; i < graph[current].size(); i++) {
				findAllPaths(graph, graph[current].get(i).des, target, visited,
						paths + " -> " + graph[current].get(i).des);
			}
			visited[current] = false;
		}
	}

}
