package com.laboon;

public class TQWriter extends Thread {

	
	private int nextVal = 0; 
	
	public void run() {
		// synchronized(this) {
			while (nextVal <= TQ._finalVal) {
				//try {
				//	this.wait(1);
				//} catch (InterruptedException iex) {
				//	
				//}
				//synchronized(TQ._q) {
					System.out.println("Adding " + nextVal);
					synchronized(TQ._q) {
						TQ._q.addToEnd(new Node<Integer>(new Integer(nextVal)));
					}
					
					Thread.yield();
					
				//} 
				nextVal++;
				
			}
		//}
		
	}
	

}
