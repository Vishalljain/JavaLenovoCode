package com.multithreading;

class Counter1{
	
	int count;
	
	public synchronized void increment() {//only one thread can access the increment method at a time when t1 is exceuting t2 will wait n vice versa
		count++;
}
}

public class SynchronizedEx2 {
	public static void main(String[] args) throws InterruptedException {
	Counter1 c = new Counter1();
	
	Thread t = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i = 1 ; i<=10000; i++ ) {
				c.increment();
			}
			
		}
	});
	
Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i = 1 ; i<=10000; i++ ) {
				c.increment();
			}
			
		}
	});
	
	t.start();
	t1.start();
	t.join();
	t1.join();
	
	
	System.out.println("Count : "+c.count);
	}
}
