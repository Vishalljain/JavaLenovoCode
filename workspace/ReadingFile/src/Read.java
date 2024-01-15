//There are several ways to read a plain text file in Java 
//e.g. you can use FileReader, BufferedReader or Scanner to read a text file.




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) throws FileNotFoundException {
		//String fileName="C:\\Users\\Vishal\\Desktop\\vi.txt";//equal to String fileName1="C:/Users/Vishal/Desktop/vi.txt";
//i have copied file to project so simply use
		String fileName="vi.txt";
		File f1=new File(fileName);
		Scanner scanner=new Scanner(f1);//scanner is used to read lines
		int in=scanner.nextInt();//first line in text document is int
		//scanner.nextLine();
		int count=2;
		System.out.println(in);
		while(scanner.hasNextLine()) {
			String m=scanner.nextLine();
			System.out.println(count  +  ":" +m);
			count++;
		
		}
		
	}

}
//second line is empty so use  scanner.nextLine(); i hve comented