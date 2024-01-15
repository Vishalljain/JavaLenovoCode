package SerialDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException {
	Student student = new Student(100,"Vishal");
	FileOutputStream fos = new FileOutputStream("vl.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(student);
	oos.close();
}
}
//The ObjectOutputStream class is used to write primitive data types and java objects to an output stream
//The ObjectinputStream deserializes the object and primitive data written using an ObjectOutputStream.
//