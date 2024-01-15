package com.multithreading;


//Annonymous Inner class

public class Thread3 {
	
	public static void main(String[] args) {
		
		Runnable obj = new Runnable(){
			public void run() {

				for (int i = 1; i <= 5; i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {

					}
				}
			}

		};
		
		
		Runnable obj1 = new Runnable() {
			public void run() {

				for (int i = 1; i <= 5; i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {

					}

				}
			}
		};
		
		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj1);
		
		t.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		
		t1.start();
		
		
	}
	

}
