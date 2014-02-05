package com.laboon;

public class FizzBuzz {

	private boolean buzzy(int n) {
		return (n % 5 == 0);
	}
	
	private boolean fizzy(int n) {
		return (n % 3 == 0);
	}
	
	public String value(int n) {
		if (fizzy(n) && buzzy(n)) {
			return "FizzBuzz";
		} else if  (fizzy(n)) {
			return "Fizz";
		} else if (buzzy(n)) {
			return "Buzz";
		} else {
			return String.valueOf(n);
		}
	}
	
	public void run() {
		
	}
	
	public static void main(String[] args) {
		for (int j=1; j<=100; j++) {
			if (j % 3 == 0 && j % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (j % 3 == 0) {
				System.out.println("Fizz");
			} else if (j % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(j);
			}

		}
	}

}
