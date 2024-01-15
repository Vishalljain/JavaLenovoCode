import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader2 {
	public static void main(String[] args) throws IOException {
		String filename="Vishal.txt";
		FileReader fr=new FileReader(filename);
		BufferedReader br=new BufferedReader(fr);
		String line;
		while ((line=br.readLine()) !=null) {
			
			
			System.out.println(line);
			
		}
		
		
	}

}
