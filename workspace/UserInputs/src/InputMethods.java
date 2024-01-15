import java.util.Scanner;

public class InputMethods {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the age");
		int age=s.nextInt();
		System.out.println("Enter the Gender");
		char gender=s.next().charAt(0);
		System.out.println("Enter the salary");
		long salary=s.nextLong();
		
System.out.println("Name :"+name);
System.out.println("Age :"+age);
System.out.println("Gender :"+gender);
System.out.println("Salary :"+salary);
		

	}

}
