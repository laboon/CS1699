package com.laboon;

import java.util.ArrayList;


/**
 * Undirected graph example using Matrix representation.
 * 
 * @author wlaboon
 *
 */

public class GraphMatrix {

	private int _numNodes = 0;
	
	private boolean[][] _graphRep = null; 
	
	private boolean[] _visited;
	
	public GraphMatrix(int numNodes) {
		_numNodes = numNodes;
		_graphRep = new boolean[_numNodes][numNodes];
		
	}
	
	public void clearEdges() {
		for (int j=0; j<_numNodes; j++) {
			for (int k=0; k < _numNodes; k++) {
				_graphRep[j][k] = false;
			}
		}
	}
	
	public void addEdge(int node1, int node2) {
		_graphRep[node1][node2] = _graphRep[node2][node1] = true;
	}
	
	public void removeEdge(int node1, int node2) {
		_graphRep[node1][node2] = _graphRep[node2][node1] = false;
	}
	
	public ArrayList<Integer> getAdjacent(int node) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		for (int j = 0; j < _numNodes; j++) {
			if (_graphRep[node][j]) {
				toReturn.add(new Integer(j));
			}
		}
		return toReturn;
		
	}
	
	private void dfsTraverseInner(int node) {
		
		System.out.println("Visited " + node);
		_visited[node] = true;
		int childNode = -1;
		
		for (Integer childNodeObj : getAdjacent(node)) {
			childNode = childNodeObj.intValue();
			if (!_visited[childNode]) {
				dfsTraverseInner(childNode);
			}
		}
	}
	
	public void dfsTraverse(int node) {
		_visited = new boolean[_numNodes];
		for (int j = 0; j < _numNodes; j++) {
			_visited[j] = false;
		}
		
		dfsTraverseInner(node);
		
	}
	
	private void bfsTraverseInner(int node) {
		
		
		_visited[node] = true;
		int childNode = -1;
		
		for (Integer childNodeObj : getAdjacent(node)) {
			childNode = childNodeObj.intValue();
			
			if (!_visited[childNode]) {
				dfsTraverseInner(childNode);
			}
		}
		
	}
	
	public void bfsTraverse(int node) {
		_visited = new boolean[_numNodes];
		for (int j = 0; j < _numNodes; j++) {
			_visited[j] = false;
		}
		
		bfsTraverseInner(node);
	}
	
	public void prettyPrint() {
		
		System.out.print("  ");
		for (int j=0; j < _numNodes; j++) {
			System.out.print(" " + j + " ");
		}
		System.out.println();
		
		for (int j = 0; j < _numNodes; j++) {
			System.out.print(j + " ");
			for (int k = 0; k < _numNodes; k++) {
				if (_graphRep[j][k]) {
					System.out.print(" * ");
				} else {
					System.out.print(" _ ");
				}
			}
			System.out.println();
		}
		
	}
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("New graph..");
		GraphMatrix gm = new GraphMatrix(5);
		gm.prettyPrint();
		
		System.out.println("Add edges..");
		gm.addEdge(0, 1);
		gm.addEdge(1, 2);
		gm.addEdge(2, 3);
		gm.addEdge(3, 4);
		gm.prettyPrint();
		
		System.out.println("DFS Traverse from Edge 0 (0 -> 1 -> 2 -> 3 -> 4");
		gm.dfsTraverse(0);

		System.out.println("DFS Traverse from Edge 4 (4 -> 3 - > 2 -> 1 -> 0)");
		gm.dfsTraverse(4);
		
		System.out.println("DFS Traverse from Edge 0 with Cycle (0-1-2-3-4-0");
		gm.addEdge(4,0);
		gm.dfsTraverse(0);
		
		System.out.println("Remove edges..");
		gm.removeEdge(0, 1);
		gm.removeEdge(1, 2);
		gm.removeEdge(2, 3);
		gm.removeEdge(3, 4);
		gm.prettyPrint();
		
		System.out.println("DFS Traverse from Edge 0 (0 -> 1,2,3,4)");
		gm.addEdge(0, 1);
		gm.addEdge(0, 2);
		gm.addEdge(0, 3);
		gm.addEdge(0, 4);
		gm.dfsTraverse(0);
		
		System.out.println("DFS Traverse from Edge 0, Two Paths (0->1->3, 0->2->4)");
		gm.clearEdges();
		gm.addEdge(0,1);
		gm.addEdge(1,3);
		gm.addEdge(0,2);
		gm.addEdge(2,4);
		gm.dfsTraverse(0);
		
		System.out.println("DFS Traverse from Edge 0, Two Paths (0->1->3, 0->2->4)");
		gm.bfsTraverse(0);
		

	}

}
