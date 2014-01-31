package com.laboon;

public class FooImpl implements FooInterface {
	public boolean meow(int bar) {
		return true;
	}
	
	public static void main(String[] args) {
		FooImpl f = new FooImpl();
		boolean a = f.meow(1);
		if (a) {
			System.out.println("ja");
		}
	}
}
