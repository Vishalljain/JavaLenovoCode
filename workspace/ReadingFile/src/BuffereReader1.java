import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//there are 2 ways to take input from user that is scanner and bufferreader
//BufferedReader is a class in Java that reads text from a character-input stream,
//buffering characters so as to provide for the efficient reading of characters, lines and arrays
//BUFFERREADER CAN USE TO READ FILES USING  FILEREADER BUT NOT INPUTSTREAM READER  BECAUSE  IT USES SYSTEM.IN TO TAKE USER INPUT FROM KEYBOARD
public class BuffereReader1 {
	public static void main(String[] args) throws IOException {
		//inputstreamreader excepts streamm of data that is what expected by Bufferreader
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//OR //SYSTEM.IN IS USED TO TAKE INPUT FROM KEYBOARD
		//InputStreamReader r=new InputStreamReader(System.in);    
	   // BufferedReader br=new BufferedReader(r);       
		System.out.println("Enter the id");
		int id=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the name ");
		String name=br.readLine();
		System.out.println(" The id is:"+id);
		System.out.println(" The name is:"+name);
	}

}
