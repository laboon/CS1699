package com.laboon;

public class BSTNode {

	private int _val = 0;
	
	private BSTNode _left = null;
	
	private BSTNode _right = null;
	
	public BSTNode left() {
		return _left;
	}
	
	public BSTNode right() {
		return _right;
	}
	
	public void setRight(BSTNode newRight) {
		_right = newRight;
	}
	
	public void setLeft(BSTNode newLeft) {
		_left = newLeft;
	}
	
	public int getVal() {
		return _val;
	}
	
	public BSTNode(int val, BSTNode left, BSTNode right) {
		_val = val;
		_left = left;
		_right = right;
	}
	
}
