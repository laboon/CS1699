package com.laboon;

import java.util.Random;
import java.util.ArrayList;

public class Sorting {

	private int[] populateArray(int[] toPopulate) {
		int arrLen = toPopulate.length;
		Random rng = new Random();
		for (int j=0; j < arrLen; j++) {
			toPopulate[j] = rng.nextInt(32);
		}
		return toPopulate;
	}
	
	public static void printArray(int[] arrToPrint) {
		int arrLen = arrToPrint.length;
		for (int j=0; j < arrLen; j++) {
			System.out.print(arrToPrint[j]);
			if (j < (arrLen - 1)) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
	}
	
	public static int[] concat3Arrs(int[] a, int[] b, int[] c) {
		int[] toReturn = new int[a.length + b.length + c.length];
		System.arraycopy(a, 0, toReturn, 0, a.length);
		System.arraycopy(b, 0, toReturn, a.length, b.length);
		System.arraycopy(c, 0, toReturn, a.length + b.length, c.length);
		return toReturn;
	}
	
	public static int[] concatArrs(int[] a, int[] b) {
		int[] toReturn = new int[a.length + b.length];
		System.arraycopy(a, 0, toReturn, 0, a.length);
		System.arraycopy(b, 0, toReturn, a.length, b.length);
		return toReturn;
	}
	
	public static int[] convArrListToArr(ArrayList toConvert) {
		int arrListSize = toConvert.size();
		int[] toReturn = new int[arrListSize];
		for (int j=0; j < arrListSize; j++) {
			toReturn[j] = ((Integer) toConvert.get(j)).intValue();
		}
		return toReturn;
	}
	
	private int[] quicksort(int[] arrToSort) {
		if (arrToSort.length <= 1) {
			return arrToSort;
		}
		// select and remove pivot value
		int pivotNum = (int) arrToSort.length / 2;
		int pivot = arrToSort[pivotNum];
		// create empty lists lt and gt
		ArrayList gt = new ArrayList();
		ArrayList lt = new ArrayList();
		for (int j = 0; j < arrToSort.length; j++) {
			if (j == pivotNum) continue;
			if (arrToSort[j] <= pivot) {
				lt.add(arrToSort[j]);
			} else {
				gt.add(arrToSort[j]);
			}
		}
		int[] pivotArr = new int[1];
		pivotArr[0] = pivot;
		return concat3Arrs(quicksort(convArrListToArr(lt)), pivotArr, quicksort(convArrListToArr(gt)));
	}
	
	private ArrayList merge(ArrayList left, ArrayList right) {
		ArrayList toReturn = new ArrayList();
		while (left.size() > 0 || right.size() > 0) {
			if (left.size() > 0 && right.size() > 0) {
				if (((Integer) left.get(0)) <= ((Integer) right.get(0))) {
					toReturn.add(left.get(0));
					left.remove(0);
				} else {
					toReturn.add(right.get(0));
					right.remove(0);
				}
			} else if (left.size() > 0) {
				toReturn.add(left.get(0));
				left.remove(0);
			} else if (right.size() > 0) {
				toReturn.add(right.get(0));
				right.remove(0);
			}
		}
		return toReturn;
	}
	
	private ArrayList mergesort(ArrayList arrToSort) {
		if (arrToSort.size() <= 1) {
			return arrToSort;
		}
		ArrayList left = new ArrayList();
		ArrayList right = new ArrayList();
		int middle = (int) arrToSort.size() / 2;
		for (int j=0; j< middle; j++) {
			left.add(((Integer) arrToSort.get(j)).intValue());
		}
		for (int j=middle; j < arrToSort.size(); j++) {
			right.add(((Integer) arrToSort.get(j)).intValue());;
		}
		left = mergesort(left);
		right = mergesort(right);
		
		return merge(left, right);
	}
	
	public static ArrayList makeArrayList(int[] toConv) {
		ArrayList toReturn = new ArrayList();
		for (int j=0; j < toConv.length; j++) {
			toReturn.add(toConv[j]);
		}
		return toReturn;
	}
	
	public static void main(String args[]) {
		Sorting sorter = new Sorting();
		System.out.println("Concat test...");
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		int[] c = {7, 8, 9};
		printArray(concatArrs(a, b));
		printArray(concat3Arrs(a, b, c));
		
		System.out.println("Sorting test...");
		
		int[] arrToSort = new int[15];
		int[] sortedArr;
		ArrayList arrListSorted;
		arrToSort = sorter.populateArray(arrToSort);
		printArray(arrToSort);
		
		System.out.println("Quicksort...");
		sortedArr = sorter.quicksort(arrToSort);
		printArray(sortedArr);
		
		System.out.println("Merge Sort...");
		ArrayList toSort = makeArrayList(arrToSort);
		arrListSorted = sorter.mergesort(toSort);
		printArray(convArrListToArr(arrListSorted));
		
	}
}
