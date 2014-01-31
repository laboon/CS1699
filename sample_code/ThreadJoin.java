package com.laboon;

public class ThreadJoin {

	private class WorkerThread implements Runnable {
		
		private int _num = 0;
		
		public WorkerThread(int num) {
			_num = num;
		}
		
		public void run() {
			int fin = 0; 
			for (int j=0; j < 10000; j++) {
				fin += (int) Math.floor(Math.sqrt(Math.atan(j)));
				
			}
			
			System.out.println(_num + " : fin is " + fin);
		}
		
	}
	
	public void runMain() {
		Thread[] wtArr = new Thread[20];
		WorkerThread tmp;
		for (int j = 0; j < 20; j++) {
			tmp = new WorkerThread(j);
			wtArr[j] = new Thread(tmp);
		}
		
		for (Thread wt : wtArr) {
			wt.start();
		}
		try {
			for (Thread wt: wtArr) {
				wt.join();
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("All done!");
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadJoin tj = new ThreadJoin();
		tj.runMain();

	}

}
