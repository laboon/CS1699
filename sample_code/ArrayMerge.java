package com.laboon;

public class ArrayMerge {
	
	private static int[] mergeArrs(int a1[], int a2[]) {
		int[] toReturn = new int[a1.length + a2.length];
		int ptr1 = 0;
		int ptr2 = 0;
		int ptrRet = 0;
		while (ptrRet < toReturn.length) {
			
			if (ptr1 < a1.length && ptr2 < a2.length) {
				if (a1[ptr1] <= a2[ptr2]) {
					toReturn[ptrRet++] = a1[ptr1++];
				} else {
					toReturn[ptrRet++] = a2[ptr2++];
				}
			} else if (ptr1 < a1.length) {
				toReturn[ptrRet++] = a1[ptr1++];
			} else {
				toReturn[ptrRet++] = a2[ptr2++];
			} 
		}
		
		return toReturn;
	}
	
	
	private static void printArr(int[] arr) {
		for (int j=0; j< arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
	
	private static void printArrFe(int[] arr) {
		for (int j : arr) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int[] arr1 = {1, 3, 7, 9, 10, 12, 23, 24, 25};
		int[] arr2 = {4, 5, 11, 21, 22};
		//int[] arr1 = {1, 10};
		//int[] arr2 = {4, 11, 12};
		int[] arr3 = mergeArrs(arr1, arr2);
		printArr(arr3);
		printArrFe(arr3);
	}
}
