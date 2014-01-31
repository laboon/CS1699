package com.laboon;

import java.util.Stack;
import java.util.ArrayList;

public class StringFun {

	public static String reverseString(String toReverse) {
		String toReturn = "";
		for (int j = toReverse.length() - 1; j >= 0; j--) {
			toReturn = toReturn + toReverse.charAt(j);
		}
		return toReturn;
	}
	
	public static boolean allUnique(String toCheck) {
		boolean toReturn = true;
		ArrayList<Character> chars = new ArrayList<Character>();
		Character oneChar;
		for (int j=0; j < toCheck.length(); j++) {
			oneChar = new Character(toCheck.charAt(j));
			if (chars.contains(oneChar)) {
				toReturn = false;
				break;
			} else {
				chars.add(oneChar);
			}
		}
		return toReturn;
	}
	
	public static boolean allUniqueNoMem(String toCheck) {
		
		boolean foundMatch = false;
		for (int j=0; j < toCheck.length(); j++) {
			char c = toCheck.charAt(j);
			for (int k = 0; k < j; k++) {
				if (c == toCheck.charAt(k)) { 
					foundMatch = true;
					break;
				}
			}
			if (!foundMatch) {
				for (int k = j + 1; k < toCheck.length(); k++) {
					if (c == toCheck.charAt(k)) { 
						foundMatch = true;
						break;
					}
				}
			}
			if (foundMatch) break;
			
		}
		return !(foundMatch);
		
	}
	
	public static String reverseWords(String toReverse) {
		StringBuilder toReturn = new StringBuilder();
		StringBuilder tmpString = new StringBuilder();
		Stack<String> words = new Stack<String>();
		int ptr = 0;
		while (ptr < toReverse.length()) {
			//System.out.println(ptr + ": " + toReverse.charAt(ptr));
			while ( ptr < toReverse.length() && toReverse.charAt(ptr) != ' ') {
				tmpString.append(toReverse.charAt(ptr));
				ptr++;
			}
			//System.out.println( "Found word: " + tmpString.toString());
			words.push(tmpString.toString());
			tmpString = new StringBuilder();
			ptr++;
		}
			
		while (!words.empty()) { 
			toReturn.append(words.pop() + " ");
		}
		
		return toReturn.toString();
	}
	
	public static void main(String[] args) {
		String toTest = "Howdy";
		String result = reverseString(toTest);
		System.out.println(result);
		
		toTest = "Do or do not there is no try.";
		result = reverseWords(toTest);
		System.out.println(result);
		
		boolean br = false;
		
		toTest = "Do or do not there is no try.";
		br = allUnique(toTest);
		System.out.println(toTest + ": Unique chars?" + br);
		toTest = "abcdefg";
		br = allUnique(toTest);
		System.out.println(toTest + ": Unique chars?" + br);
		toTest = "a";
		br = allUnique(toTest);
		System.out.println(toTest + ": Unique chars?" + br);
		toTest = "aa";
		br = allUnique(toTest);
		System.out.println(toTest + ": Unique chars?" + br);
		toTest = "abcdefgg";
		br = allUnique(toTest);
		System.out.println(toTest + ": Unique chars?" + br);
	
		
		toTest = "Do or do not there is no try.";
		br = allUniqueNoMem(toTest);
		System.out.println(toTest + ": Unique chars?" + br);
		toTest = "abcdefg";
		br = allUniqueNoMem(toTest);
		System.out.println(toTest + ": Unique chars?" + br);
		toTest = "a";
		br = allUniqueNoMem(toTest);
		System.out.println(toTest + ": Unique chars?" + br);
		toTest = "aa";
		br = allUniqueNoMem(toTest);
		System.out.println(toTest + ": Unique chars?" + br);
		toTest = "abcdefgg";
		br = allUniqueNoMem(toTest);
		System.out.println(toTest + ": Unique chars?" + br);
		
	}

}
