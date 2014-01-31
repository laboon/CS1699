package com.laboon;

import java.util.HashMap;

public class DynamicFib {

	private static HashMap<Long, Long> _prevResults = new HashMap<Long, Long>(); 
	
	private static long dynamicFib(long num) {
		// First check if in the Map
		Long numObj = new Long(num);
		if (_prevResults.containsKey(numObj)) {
			// System.out.println("\tRetrieved " + num + "->"  + _prevResults.get(numObj));
			return _prevResults.get(numObj).longValue(); 
		// Check base cases (0 returns 0, 1 returns 1)
		}	else if (num == 0) {
			return 0; 
		} else if (num == 1) {
			return 1;
		} else {
			// Otherwise make a recursive call of previous two
			long toReturn = dynamicFib(num - 1) + dynamicFib(num - 2);
			_prevResults.put(new Long(num), new Long(toReturn));
			return toReturn;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long timerMsStart = 0;
		long timerMsStop = 0;
		long result = 0;
		for (int j=0; j < 40; j++) {
			timerMsStart = System.currentTimeMillis();
			result = dynamicFib(j);
			timerMsStop = System.currentTimeMillis();
			System.out.println("(1) Fib(" + j + ") = " + result + " [ " + (timerMsStop - timerMsStart) + "ms ]");
		}
		for (int j=0; j < 40; j++) {
			timerMsStart = System.currentTimeMillis();
			result = dynamicFib(j);
			timerMsStop = System.currentTimeMillis();
			System.out.println("(2) Fib(" + j + ") = " + result + " [ " + (timerMsStop - timerMsStart) + "ms ]");
		}

	}

}
