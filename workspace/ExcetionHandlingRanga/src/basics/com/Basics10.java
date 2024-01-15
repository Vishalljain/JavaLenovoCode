package basics.com;

import java.util.Scanner;

public class Basics10 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){;
		int[] numbers = {1,2,3,4,5,6};
		int number = numbers[7];
	}
	}

}

//try(Scanner sc = new Scanner(System.in))what it would do is the tryWith resource will automatically call the scanner.close at the end of the execution or if any exception will come it will close automatically