import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			System.out.println("Enter a text");
			String text1=s.next();
			switch(text1) {
			case "start" :
				System.out.println("Machine started");
				break;
			case "end" :
				System.out.println("Machine stopped");
				break;
			default:System.out.println("Invalid text");
				
			}
		}
		
	

}
