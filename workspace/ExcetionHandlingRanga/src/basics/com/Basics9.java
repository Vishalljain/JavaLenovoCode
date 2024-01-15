package basics.com;

import java.util.Scanner;

public class Basics9 {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
		 sc = new Scanner(System.in);
		int[] numbers = {1,2,3,4,5,6};
		int number = numbers[7];
		
		
	}catch (Exception e) {
		//System.exit(1);//this line make sure finally block not get executed
		e.printStackTrace();
	}
		finally {
			System.out.println("before scanner close");
			if(sc!=null) {
			sc.close();
			} 
			System.out.println("After scanner close");
		}
		//System.out.println("this line will print as we handled exception in try catch block");
	}

}
