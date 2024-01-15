package HCL;

import java.util.Scanner;

public class threennine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		for(int i = 1 ; i<=number;i++) {
			if(i%9==0 && i%3==0 ) {
				System.out.println(i);
			}
		}
		
	}

}
