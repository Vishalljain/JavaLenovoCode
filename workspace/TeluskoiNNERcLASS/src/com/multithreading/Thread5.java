package com.multithreading;

//Annonymous Inner class with Lambda and still optimizing

public class Thread5 {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {

				}

			}

		});
		Thread t1 = new Thread(() -> {

			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {

				}

			}
		});

		t.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {

		}

		t1.start();

	}

}
