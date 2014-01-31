package com.laboon;

import java.io.*;
import java.util.*;

public class ProblemB {

	private static char _matrix[][];
	
	private static int _numIters = 0;
	
	private static int _xSize = 0;
	
	private static int _ySize = 0;
	
	private static void printMatrix() {
		for (int j =0; j < _xSize; j++) {
			for (int k = 0; k < _ySize; k++) {
				System.out.print(_matrix[j][k]);
			}
			System.out.println();
		}
	}
	
	private static class Cell {
		public int x = 0; // x loc
		public int y = 0;  // y loc
		public Cell(int newX, int newY) {
			x = newX;
			y = newY;
		}
	}
	
	private static void readMatrix(int x, String chars) {
		for (int j = 0; j < _ySize; j++ ) {
			_matrix[x][j] =  chars.charAt(j);
		}
	}
	
	private static boolean outOfBounds(int x, int y) {
		if (x < 0 || x >= _xSize || y < 0 || y >= _ySize) {
			return false;
		} else {
			return true;
		}
	}
	
	private static ArrayList<Cell> getNeighbors(int x, int y) {
		System.out.println("get neighbors");
		ArrayList<Cell> toReturn = new ArrayList<Cell>(); 
		if (!outOfBounds(x + 1, y)) {
			toReturn.add(new Cell(x + 1, y));
		}
		if (!outOfBounds(x - 1, y)) {
			toReturn.add(new Cell(x - 1, y));
		}
		if (!outOfBounds(x, y + 1)) {
			toReturn.add(new Cell(x, y + 1));
		}
		if (!outOfBounds(x, y - 1)) {
			toReturn.add(new Cell(x, y - 1));
		}
		System.out.println("END get neighbors");
		return toReturn;
	}
	
	private static ArrayList<Cell> checkOneRecursive(int x, int y) {
		//System.out.println("check one recursive");
		ArrayList<Cell> toReturn = new ArrayList<Cell>();
		// System.out.println("@@@");
		for (Cell oneCell : getNeighbors(x, y)) {
			System.out.println("!!!");
			if (getChar(oneCell.x, oneCell.y) == getChar(x, y)) {
				ArrayList<Cell> cells = checkOneRecursive(oneCell.x, oneCell.y);
				//System.out.println("...");
				toReturn.addAll(cells);
			}
		}
		System.out.println("end check one recursive");
		return toReturn;
	}
	
	private static void checkOneDisappear(int x, int y) {
		System.out.println("check one dis");
		ArrayList<Cell> toDisappear = checkOneRecursive(x, y);
		if (toDisappear.size() >= 3) {
			for (Cell oneCell : toDisappear) {
				_matrix[oneCell.x][oneCell.y] = '.';
			}
		}
		
	}
	
	private static void checkAllDisappear() {
		System.out.println("check dis");
		boolean someDropped = true;
		while (someDropped) {
			for (int j=0; j<_xSize; j++) {
				for (int k=0; k < _ySize; k++) {
					checkOneDisappear(j, k);
				}
			}
			someDropped = dropAll();
		}
	}
	
	private static void readInFile(String file) {
		try {
		  FileInputStream fstream = new FileInputStream(file);
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
		  
		  // get # iters
		  strLine = br.readLine();
		  _numIters = (int) Integer.parseInt(strLine);
		  
		  // for each iter, get data 
		  for (int j=0; j < _numIters; j++) {
			  strLine = br.readLine(); // should be xSize <sp> ySize
			  String[] tmp = strLine.split(" ");
			  _xSize = Integer.parseInt(tmp[0]);
			  _ySize = Integer.parseInt(tmp[1]);
			  _matrix = new char[_xSize][_ySize];
			  for (int k = 0; k < _xSize; k++) {
				  strLine = br.readLine();
				  readMatrix(k, strLine);
			  }
			  // printMatrix();
			  solve();
		  }
		  
		  
		  in.close();
		} catch (Exception e){//Catch exception if any
		    	System.err.println("Error: " + e.getMessage());
		}
	}
	
	private static boolean dropAll() {
		System.out.println("dropAll");
		boolean toReturn = false;
		// one column
		for (int j = 0; j < _ySize; j++) {
			// one row
			for (int k = 0; k < _xSize; k++) {
				if (!outOfBounds(k, j + 1 )) {
					if (_matrix[k][j + 1] == '.') {
						toReturn = true;
						_matrix[k][j+1] = _matrix[k][j];
					}
				}
			}
		}
		return toReturn;
	}
	
	private static void swap(Cell loc1, Cell loc2) {
		char tmpData = getChar(loc1.x, loc1.y);
		_matrix[loc1.x][loc1.y] = _matrix[loc2.x][loc2.y];
		_matrix[loc2.x][loc2.y] = tmpData;
		
	}
	
	private static char getChar(int x, int y) {
		return _matrix[x][y];
	}
	
	
	
	private static void solve() {
		checkAllDisappear();
		printMatrix();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("Start!");
		readInFile("/Users/wlaboon/goog/sample.txt");
		//System.out.println("Done!");
		
		

	}

}
