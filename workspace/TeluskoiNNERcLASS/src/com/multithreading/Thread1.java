package com.multithreading;

class Hi extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}

	}
}

class Hello extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}

		}
		
	}
}

public class Thread1 {
	
	public static void main(String[] args) {
		
		Hi obj = new Hi();
		Hello obj1 = new Hello();
		
		obj.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		
		obj1.start();
		
		
	}

}
