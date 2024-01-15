import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//BufferWriter is used to write in files
public class BufferWriter1  {
	public static void main(String[] args) throws IOException{
		String filename="Vishal L.txt";
		//File f=new File(filename);
		FileWriter file=new FileWriter(filename);
		BufferedWriter bw=new BufferedWriter(file);
		bw.write("Hi this is Vishal L");
		bw.newLine();
		bw.write("Empid is 802587");
		bw.newLine();
		bw.write("Domain is insurance\n Project name is Hanover grp of insurance");
		bw.close();
		
		
			
		
		
		
	}

}
