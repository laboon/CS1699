package com.laboon;

public class LPHash {

	private String[] entry;
	
	private int _size = 0;
	
	public LPHash(int size) {
		_size = size;
		entry = new String[_size];
	}
	
	public int addEntry(String toAdd) {
		int toReturn = -1;
		int loc = hash(toAdd);
		
		if (entry[loc] == null) {
			// Nothing ever put here!
			entry[loc] = toAdd;
			return -1;
		}
		
		
		// Otherwise, start linear probing
		String ptr = entry[loc];
		int ctr = 0;
		while (ctr < (_size - 1)) {
			if (ptr == null) {
				entry[(loc + ctr) % _size] = toAdd;
				return (loc + ctr) % _size;
			}
			
			ctr++;
			ptr = entry[(loc + ctr) % _size];
			
		}
		
		return toReturn;
		
	}
	
	public int get(String toFind) {
		int toReturn = -1;
		int loc = hash(toFind);
		
		if (entry[loc] == null) {
			// Nothing ever put here!
			return -1;
		}
		
		// check if entry there
		if (entry[loc] != null && entry[loc].equals(toFind)) {
			return loc;
		}
		
		// Otherwise, start linear probing
		String ptr = entry[loc];
		int ctr = 0;
		while (ptr != null && ctr < (_size - 1)) {
			if (ptr.equals(toFind)) {
				return (loc + ctr) % _size;
			}
			
			ctr++;
			ptr = entry[(loc + ctr) % _size];
		}
		
		return toReturn;
	}
	
	private int hash(String toHash) {
		int toReturn = 0;
		toReturn = toHash.length() % _size;
		// System.out.println(toHash + " #-> " + toReturn);
		return toReturn;
	}
	
	public String toString() {
		StringBuilder toReturn = new StringBuilder();
		for (int j=0; j < _size; j++) {
			toReturn.append(j + ":" + entry[j] + "\n");
		}
		return toReturn.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LPHash lph = new LPHash(10);
		lph.addEntry("a");
		lph.addEntry("ab");
		lph.addEntry("abc");
		System.out.println(lph);
		lph.addEntry("1");
		lph.addEntry("2");
		lph.addEntry("3");
		System.out.println(lph);
		System.out.println("Find a - " + lph.get("a"));
		System.out.println("Find 1 - " + lph.get("1"));
		System.out.println("Find 2 - " + lph.get("2"));
		
	}

}
