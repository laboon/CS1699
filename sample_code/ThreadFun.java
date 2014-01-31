package com.laboon;

public class ThreadFun {

	private class DeadlockingThread implements Runnable {
		private Object l1 = new Object();
		private Object l2 = new Object();
		
		private int _num = -1;
		
		public DeadlockingThread(int num) {
			_num = num;
			Thread t = new Thread(this);
			t.start();
		}
		
		public void run() {
			System.out.println("Thread #" + _num + " now running!");
			int randNum;
			
			while (true) {
				try {
					synchronized(l1) {
						randNum = (int) Math.floor(Math.random() * 2);
						if (randNum == 0) {
							l2.wait();
						} else {
							l1.wait();
						}
					}
				} catch (InterruptedException iex) {
					System.out.println("Bam interrupted exception!");
				}
			}
		}
		
	}
	
	private class MutexThread implements Runnable {
		private int _num = -1;
		
		public MutexThread(int num) {
			_num = num;
		}
		
		public void run() {
			
		}
	}
	
	private class OddGenThread implements Runnable {
		
		private int _max = -1;
		private Object _waiter;
		
		public OddGenThread(int max, Object waiter) {
			_max = max;
			_waiter = waiter;
		}
		
		public void run() {
			for (int j=1; j < _max; j += 2) {
				synchronized(_waiter) {
					System.out.println("Odd: " + j);
					try {
						_waiter.notifyAll();
						_waiter.wait();
					} catch (InterruptedException iex) {
						System.err.println("Odd interrupted @ " + j);
					}
					
				}
			}
		}
		
	}
	
	private class EvenGenThread implements Runnable {
		
		private int _max = -1;
		private Object _waiter;
		
		public EvenGenThread(int max, Object waiter) {
			_max = max;
			_waiter = waiter;
		}
		
		public void run() {
			for (int j=2; j < _max; j += 2) {
				synchronized(_waiter) {
					try {
						System.out.println("Even: " + j);
							
						_waiter.notifyAll();
						_waiter.wait();
							
					} catch (InterruptedException iex) {
						System.err.println("Even interrupted @ " + j);
					}
					//_waiter.notifyAll();
				}
			}
		}	
	}
	
	// -----------------------------
	// main methods
	// -----------------------------
	
	public ThreadFun() {
		
	}
	
	public void forceDeadlock() {
		Runnable foo;
		for (int j = 0; j < 5; j++) {
			foo = new DeadlockingThread(j);
		}
	}
	
	public void runMain() {
		
		
	}
	
	public void runEvenOdd() {
		
		int max = 100;
		Object waiterObj = new Object();
		Thread oddThread = new Thread(new OddGenThread(max, waiterObj));
		Thread evenThread = new Thread(new EvenGenThread(max, waiterObj));
		
		System.out.println("Starting...");
		oddThread.start();
		evenThread.start();
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadFun tf = new ThreadFun();
		tf.runEvenOdd();
		//tf.runMain();
		//tf.forceDeadlock();

	}

}
