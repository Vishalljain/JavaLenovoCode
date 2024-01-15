package basics.com;

import java.util.Scanner;

public class Basics8 {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		int[] numbers = {1,2,3,4,5,6};
		int number = numbers[7];
		System.out.println("before scanner close");
		sc.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
		System.out.println("this line will print as we handled exception in try catch block");
	}

}
/*
 let say the below code is executed millions of times and out of which 1000 or 10000 times there are exceptions then ur causing leakage of objects this code is causing an exception and we are not closing the scanner
 Scanner sc = new Scanner(System.in);
	int[] numbers = {1,2,3,4,5,6};
	int number = numbers[7];
	
	how do we ensure that scanner is always close that is where finally blocks comes in
*/