import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		//System.out.println(x);
		System.out.println(intSquare(x));
		//System.out.println(x);
		
	}
public static int intSquare(int x) {
	return x*x;


}
}
