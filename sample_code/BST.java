package com.laboon;

import java.util.Stack;

public class BST {

	private BSTNode _root = null;
	
	public BSTNode getRoot() {
		return _root;
	}
	
	public void add(int val) {
		System.out.println("Adding " + val);
		if (_root == null) {
			// Brand new BST!
			System.out.println("\tRoot set to " + val);
			_root = new BSTNode(val, null, null);
		} else {
			// Traverse looking for a good place to put it
			BSTNode currentNode = _root;
			BSTNode newNode = new BSTNode(val, null, null);
			boolean nodeInserted = false;
			while (!nodeInserted) {
				if (val > currentNode.getVal()) {
					System.out.println("\t" + val + ">" + currentNode.getVal() + ", going right..");
					if (currentNode.right() == null) {
						System.out.println("\t" + val + " right ptr from " + currentNode.getVal());
						currentNode.setRight(newNode);
						nodeInserted = true;
					} else {
						System.out.println("\t Going from " + currentNode.getVal() + " to " + currentNode.right().getVal());
						currentNode = currentNode.right();
					}
				}
				if (val < currentNode.getVal()) {
					System.out.println("\t" + val + "<" + currentNode.getVal() + ", going left..");
					if (currentNode.left() == null) {
						System.out.println("\t" + val + " left ptr from " + currentNode.getVal());
						currentNode.setLeft(newNode);
						nodeInserted = true;
					} else {
						System.out.println("\t Going from " + currentNode.getVal() + " to " + currentNode.left().getVal());
						currentNode = currentNode.left();
					}
				}
				if (val == currentNode.getVal()) {
					// if same value already exists, just return
					nodeInserted = true;
				}
			}
		}
	}
	
	public void preOrderTraverse(BSTNode node) {
		if (node == null) {
			return;
		} else {
			System.out.print(node.getVal() + " ");
			preOrderTraverse(node.left());
			preOrderTraverse(node.right());
		}
	}
	
	public void inOrderTraverse(BSTNode node) {
		if (node == null) {
			return;
		} else {
			inOrderTraverse(node.left());
			System.out.print(node.getVal() + " ");
			inOrderTraverse(node.right());
		}
	}
	
	public void postOrderTraverse(BSTNode node) {
		if (node == null) {
			return;
		} else {
			postOrderTraverse(node.left());
			postOrderTraverse(node.right());
			System.out.print(node.getVal() + " ");
		}
	}
	
	public void preOrderTraverseNR(BSTNode node) {
		Stack<BSTNode> nodeStack = new Stack<BSTNode>();
		nodeStack.push(node);
		BSTNode currentNode;
		while (!nodeStack.empty()) {
			currentNode = nodeStack.pop();
			if (currentNode == null) {
				// Do nothing, wait for next iter
			} else {
				System.out.print(currentNode.getVal() + " ");
				if (currentNode.left() != null) {
					nodeStack.push(currentNode.left());
				}
				
				if (currentNode.right() != null) {
					nodeStack.push(currentNode.right());
				}
			}
		}
		System.out.println();
	}
	
	
	public BSTNode findLowestAncestor(BSTNode node, int num1, int num2) {
		while (node != null) {
			if (node.getVal() > num1 && node.getVal() > num2) {
				node = node.left();
			} else if (node.getVal() < num1 && node.getVal() < num2) {
				node = node.right();
			} else {
				return node;
			}
		}
		
		return null;
	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BST bst =  new BST();
		
		bst.add(5);
		bst.add(2);
		bst.add(1);
		bst.add(3);
		bst.add(8);
		bst.add(6);
		bst.add(10);

		
		System.out.println("Pre-order");
		bst.preOrderTraverse(bst.getRoot());
		System.out.println();
		
		System.out.println("In-order");
		bst.inOrderTraverse(bst.getRoot());
		System.out.println();
		
		System.out.println("Post-order");
		bst.postOrderTraverse(bst.getRoot());
		System.out.println();
		
		System.out.println("Pre-order Non-Recursive");
		bst.preOrderTraverseNR(bst.getRoot());
		
		System.out.println("Lowest Common Ancestor:");
		BSTNode lca = bst.findLowestAncestor(bst.getRoot(), 6, 10);
		System.out.println(lca.getVal());
	}

}
