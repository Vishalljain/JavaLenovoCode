import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=sc.nextLine();
		String regex="^[A-Z]{3}[0-9]{9}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(input);
		if(matcher.matches()) {
			System.out.println("Given string is valid");
		}
		else {
			System.out.println("Given string is not valid");
		}
		
	}

}
