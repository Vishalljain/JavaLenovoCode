package com.multithreading.RaceContion;

class Counter1 implements Runnable {

	private int c = 0;

	public void increment() {
		c++;

	}

	public void decrement() {
		c--;
	}

	public int getCValue() {
		return c;
	}

	@Override
	public synchronized void run() {
		//synchronized (this) {
		this.increment();
		System.out.println(
				"Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getCValue());
		this.decrement();
		System.out.println("Value for Thread decrement" + Thread.currentThread().getName() + " " + this.getCValue());
	}
}
//}

public class RaceContion2 {
	public static void main(String[] args) throws InterruptedException {
		Runnable count = new Counter1();
		Thread t1 = new Thread(count, "Thread-1");
		Thread t2 = new Thread(count, "Thread-2");
		Thread t3 = new Thread(count, "Thread-3");

		t1.start();
		
		t2.start();
		
		t3.start();

	}

}
