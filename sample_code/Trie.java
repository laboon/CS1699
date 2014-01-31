package com.laboon;

public class Trie {
	TrieNode _top = new TrieNode('\0');
	
	public Trie() {
		
	}
	
	public void addString(String toAdd) {
		// System.out.println("Adding " + toAdd + "...");
		int j = 0;
		TrieNode currNode = _top;
		char currChar;
		while (j < toAdd.length()) {
			
			currChar = toAdd.charAt(j);
			// System.out.println("Current char: " + currChar);
			if (currNode.hasNode(currChar)) {
				currNode = currNode.traverse(currChar);
			} else {
				currNode.addNode(currChar);
				currNode = currNode.traverse(currChar);
			}
			j++;
		}
		if (currNode.getData() == null) {
			// System.out.println("Added " + toAdd);
			currNode.setData(toAdd);
		}
	}
	
	public boolean stringExists(String toCheck) {
		boolean toReturn = traverseTrie(_top, toCheck);
		return toReturn;
	}
	
	private boolean traverseTrie(TrieNode startNode, String toCheck) {
		TrieNode current = startNode;
		// Let us assume null or zero-length strings don't exist
		if (toCheck == null || toCheck.length() == 0) {
			// System.out.println("\tnull or 0-len string");
			return false;
		}
		
		// Get first char - we know there is at least one char due 
		// to earlier check
		int j = 0;
		char nextChar = toCheck.charAt(j);
		
		while (j < toCheck.length() && current != null) {
			// System.out.println("\t" + j + ": " + nextChar);
			if (j == (toCheck.length() -1)) {
				if (current != null) {
					current = current.traverse(nextChar);
					//System.out.println("\tEOS");
				}
				break;
			} else {
				current = current.traverse(nextChar);
				j++;
				nextChar = toCheck.charAt(j);
				
			}
		}
		if (j < (toCheck.length() -1)) {
			// System.out.println("\t" + j + " < " + toCheck.length());
			return false;
		}
		if (current == null || current.getData() == null) {
			//System.out.println("\tno data");
			return false;
		} else {
			//System.out.println("\tfound data");
			return true;
		}
		
	}
	
	public static void main(String args[]) {
		Trie testTrie = new Trie();
		testTrie.addString("BILL");
		testTrie.addString("BEE");
		testTrie.addString("BILLOW");
		testTrie.addString("APPLE");
		testTrie.addString("APPLES");
		System.out.println("Check if strings exist... these ones should");
		System.out.println("BILL? " + testTrie.stringExists("BILL"));
		System.out.println("BEE? " + testTrie.stringExists("BEE"));
		System.out.println("BILLOW? " + testTrie.stringExists("BILLOW"));
		System.out.println("APPLE? " + testTrie.stringExists("APPLE"));
		System.out.println("APPLES? " + testTrie.stringExists("APPLES"));
		System.out.println("Check if strings exist... these ones should NOT");
		System.out.println("<null>? " + testTrie.stringExists(null));
		System.out.println("0-len? " + testTrie.stringExists(""));
		System.out.println("GLAD? " + testTrie.stringExists("GLAD"));
		System.out.println("BEELINE? " + testTrie.stringExists("BEELINE"));
		System.out.println("BILLOWS? " + testTrie.stringExists("BILLOWS"));
		System.out.println("APP? " + testTrie.stringExists("APP"));
		System.out.println("A? " + testTrie.stringExists("A"));
		
	}
	
}
