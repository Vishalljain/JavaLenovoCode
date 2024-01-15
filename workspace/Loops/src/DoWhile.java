import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		/*System.out.println("Enter");
		int value = s.nextInt();
		while(value!=5)
			
		{
			System.out.println("Enter a number");
			 value = s.nextInt();
			
		}
		System.out.println("Got 5 ");*/
		int value=0;
		do {
			System.out.println("Enter");
			 value = s.nextInt();
			
		}while(value!=5);
		System.out.println("Hi your very much happy");
	}
	
	

}
