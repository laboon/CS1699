package com.laboon;

public class NChooseK {

	public long _n = 0;
	
	public long _k = 0;
	
	public NChooseK(long n, long k) {
		_n = n;
		_k = k;
	}
	
	public static long calcRecursive(NChooseK nck) {
		if (nck._n == nck._k) {
			return 1;
		} else if (nck._k == 0) {
			return 1;
		} else if (nck._n == 0) {
			return 0;
		} else {
			NChooseK nck1 = new NChooseK(nck._n -1, nck._k -1);
			NChooseK nck2 = new NChooseK(nck._n - 1, nck._k);
			return calcRecursive(nck1) + calcRecursive(nck2);
		}
	}
	
	public static long calcMult(NChooseK nck) {
		long total = 1;
		for (int j=1; j <= nck._k; j++) {
			total *= (nck._n - nck._k - j) / j;
		}
		return total;
	}
	
	public String toString() {
		return "C(" + _n + ", " + _k + ")";
	}
	
	public static void main(String[] args) {
		
		// timing var
		long timeCtr = 0;
		
		NChooseK test = new NChooseK(2, 1);
		timeCtr = System.currentTimeMillis();
		System.out.println("Recursive: " + test + " = " + NChooseK.calcRecursive(test));
		System.out.println("Took " + (System.currentTimeMillis() - timeCtr) + " ms");
		
		test = new NChooseK(100, 2);
		timeCtr = System.currentTimeMillis();
		System.out.println("Recursive: " + test + " = " + NChooseK.calcRecursive(test));
		System.out.println("Took " + (System.currentTimeMillis() - timeCtr) + " ms");
		
		test = new NChooseK(50, 3);
		timeCtr = System.currentTimeMillis();
		System.out.println("Recursive: " + test +" = " + NChooseK.calcRecursive(test));
		System.out.println("Took " + (System.currentTimeMillis() - timeCtr) + " ms");
		
		test = new NChooseK(50, 9);
		timeCtr = System.currentTimeMillis();
		System.out.println("Recursive: " + test +" = " + NChooseK.calcRecursive(test));
		System.out.println("Took " + (System.currentTimeMillis() - timeCtr) + " ms");
		
		test = new NChooseK(50, 9);
		timeCtr = System.currentTimeMillis();
		System.out.println("Mult: " + test + " = " + NChooseK.calcRecursive(test));
		System.out.println("Took " + (System.currentTimeMillis() - timeCtr) + " ms");
	}

}
