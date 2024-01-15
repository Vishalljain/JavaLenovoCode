package CheckedException;

//Checked exceptions are checked at compile-time. It means if a method is throwing a
//checked exception then it should handle the exception using try-catch block or 
//it should declare the exception using throws keyword
//, otherwise the program will give a compilation error.

//ex are i/o exception
//ClassNotFoundException


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundException1 {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName="C:\\Users\\Vishal\\Desktop\\vi.txt";//equal to String fileName1="C:/Users/Vishal/Desktop/vi.txt";

		
		File f1=new File(fileName);
		Scanner scanner=new Scanner(f1);//scanner is used to read lines
		String in=scanner.next();//first line in text document is int
		scanner.nextLine();
		//int count=1;
		System.out.println(in);
		while(scanner.hasNextLine()) {
			String m=scanner.nextLine();
			System.out.println(m);
			//count++;
		
		}
		
	}

}
