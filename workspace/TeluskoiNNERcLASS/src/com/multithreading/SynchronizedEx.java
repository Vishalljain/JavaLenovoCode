package com.multithreading;

class Counter{
	
	int count;
	
	public void increment() {//here multiple threads can access the increment method at same time that is not thread safe
		count++;//here we are doing 2 operation one is incrementing that is count+1 and then assigning to count
		//that is count = count+1
		
		//after count=300 imagine 
		//at the time t1 increments to from 300 to 301 same time t2 increments from 300 to 301 but it need to be 302
	}
}


public class SynchronizedEx {
	public static void main(String[] args) throws InterruptedException {
	Counter c = new Counter();
	
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
