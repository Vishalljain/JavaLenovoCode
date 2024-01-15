package com.multithreading;

class Hi1 implements Runnable {//in next handson this class is used only once why to create separate class we can do anonymous

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

class Hello1 implements Runnable {//used once why to used separate class we can do annonymous

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

public class Thread2 {
	
	public static void main(String[] args) {
		
		
		
		Hi1 obj = new Hi1();
		Thread t = new Thread(obj);
		
		
		//Hello1 obj1 = new Hello1(); or
		Runnable obj1 = new Hello1();
		Thread t1 = new Thread(obj1);
		
		t.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		
		t1.start();
		
		
	}

}
