package com.laboon;

public class TQReader extends Thread {

	private LinkedList<Integer> ll = new LinkedList<Integer>();

	
	
	public void run() {
		int numElements = 0;
		//synchronized(this) {
			Integer fromQ = null;
			while (fromQ == null || numElements < TQ._finalVal) {
				//try {
				//	this.wait(10);
				//} catch (InterruptedException iex) {
				//	
				//}
				if (TQ._q != null) {
					//System.out.print(".");
					synchronized (TQ._q) {
						fromQ = TQ._q.getFrontData();
					}
					if (fromQ != null) {
						numElements++;
						System.out.println("Read " + fromQ.intValue());
						ll.addToEnd(new Node<Integer>(fromQ));
						TQ._q.deleteFront();
						
					}
				} else {
					System.out.println("TQ._q is null");
				}
				Thread.yield();
			}
		//}
		System.out.println("numElements is " + numElements);	
		ll.prettyPrint();
	}
	
}
