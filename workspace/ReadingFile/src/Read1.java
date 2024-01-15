import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Read1 {
	Scanner scanner;
	void openFile() throws FileNotFoundException {
		String filename="Vishal.txt";
		
		File file=new File(filename);
		 scanner = new Scanner(file);
		
		
	}
	
	void readFile(){
		while(scanner.hasNextLine()) {
			String a=scanner.next();//to read first column ..1
			String b=scanner.next();//to read second column ..Vishal
			String c=scanner.next();//to read first column ..100
			System.out.printf("%s %s %s\n",a,b,c);
			
			}
	}
	void closeFile(){
		scanner.close();
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		Read1 r1=new Read1();
		r1.openFile();
		r1.readFile();
		r1.closeFile();
		
		
	}
	

}
