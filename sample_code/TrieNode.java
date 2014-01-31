package com.laboon;

import java.util.HashMap;

public class TrieNode {
	
	private char _character;
	
	private String _data = null;
	
	private HashMap<Character, TrieNode> _nodes = new HashMap<Character, TrieNode>();
	
	public TrieNode(char c) {
		_character = c;
	}
	
	public TrieNode(char c, String data) {
		_character = c;
		_data = data;
	}
	
	public void setData(String data) {
		_data = data;
	}
	
	public String getData() {
		return _data;
	}
	
	public boolean hasNode(char c) {
		if (_nodes.containsKey(new Character(c))) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addNode(char c) {
		if (!hasNode(c)) {
			TrieNode newNode = new TrieNode(c);
			_nodes.put(new Character(c), newNode);
		}
	}
	
	public char getChar() {
		return _character;
	}
	
	public TrieNode traverse(char c) {
		Character charKey = new Character(c);
		if (_nodes.containsKey(charKey)) {
			// System.out.println("\tTraversing to " + _nodes.get(charKey).getChar());
			return _nodes.get(charKey);
		} else {
			return null;
		}
	}
}
