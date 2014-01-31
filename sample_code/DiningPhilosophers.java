package com.laboon;
import java.util.concurrent.*;

public class DiningPhilosophers {

	private class Philosopher implements Runnable {
		
		private int _num = -1;
		private int _total = -1;
		
		public Philosopher(int num, int total) {
			_num = num;
			_total = total;
		}
		
		private boolean pickUp(int chopstickNum) {
			boolean toReturn = chopsticks[chopstickNum].tryAcquire();
			return toReturn;
		}
		
		// left chopstick is equal to the number of the philosopher
		
		private boolean pickUpLeft() {
			boolean toReturn = pickUp(_num);
			return toReturn;
		}
		
		private void putDownLeft() {
			chopsticks[_num].release();
		}
		
		// right chopstick is equal to number of philosopher + 1
		
		private boolean pickUpRight() {
			boolean toReturn = pickUp((_num + 1) % _total);
			return toReturn;
		}
		
		private void putDownRight() {
			chopsticks[(_num + 1) % _total].release();
		}
		
		public void run() {
			boolean hasLeft = false;
			boolean hasRight = false;
			boolean ate = false;
			int numEats = 0;
			while (true) {
				
				synchronized (this) {
					hasLeft = pickUpLeft();
					if (hasLeft) {
						hasRight = pickUpRight();
						if (hasRight) {
							numEats++;
							ate = true;
							System.out.println(_num + " is eating... (" + numEats + ")");
							try {
								Thread.sleep((int) Math.floor(Math.random() * 500));
							} catch (InterruptedException iex) {
								System.err.println("Interrupted exception");
							}
						}
					}
					if (hasLeft) {
						putDownLeft();
					}
					if (hasRight) {
						putDownRight();
					}
				}
				// If ate, go think for a while, otherwise loop around and try again
				if (ate) {
					// reset ate for when done thinking
					ate = false;
					try {
						System.out.println(_num + " is thinking..");
						Thread.sleep((int) Math.floor(Math.random() * 500));
					} catch (InterruptedException iex) {
						System.err.println("Interrupted exception");
					}
				} else {
					//try {
						//System.out.println(_num + " is trying again..");
						// Thread.sleep(50);
					//} catch (InterruptedException iex) {
					//	System.err.println("Interrupted exception");
					//}
				}
			}
		}
	}
	
	private int _numPhilosophers = 5;
	private int _numChopsticks = _numPhilosophers;
	
	private Semaphore[] chopsticks = new Semaphore[_numPhilosophers];
	
	public void go() {
		// Initialize the chopsticks/mutexes (=semaphore of count 1)
		for (int j=0; j < _numChopsticks; j++) {
			chopsticks[j] = new Semaphore(1);
		}
		
		// Initialize the philosophers
		Runnable phil;
		Thread t;
		for (int j=0; j < _numPhilosophers; j++) {
			phil = new Philosopher(j, _numPhilosophers);
			t = new Thread(phil);
			t.start();
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DiningPhilosophers dp = new DiningPhilosophers();
		dp.go();

	}

}
