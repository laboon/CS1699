package com.laboon;

public class Stack<T> {

	private LinkedList<T> _stack = new LinkedList<T>();
	
	public T peek() {
		return _stack.getFrontData();
	}
	
	public T pop() {
		T toReturn = _stack.getFrontData();
		if (toReturn == null) {
			return null;
		} else {
			_stack.deleteFront();
			return toReturn;
		}
	}
	
	public void push(T toPush) {
		_stack.addToFront(new Node<T>(toPush));
	}
	
	
	
}
