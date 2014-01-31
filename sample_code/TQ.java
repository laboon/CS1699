package com.laboon;

public class TQ {

	public static LinkedList<Integer> _q = new LinkedList<Integer>();
	
	public static final int _finalVal = 100;
	
	public static void main(String[] args) {
		TQReader reader = new TQReader();
		TQWriter writer = new TQWriter();
		System.out.println("Starting reader...");
		reader.start();
		System.out.println("Starting writer...");
		writer.start();
	}

}
