package SerialDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main1Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("vl.txt");
		ObjectInputStream  ois = new ObjectInputStream(fis);
		Student s = (Student) ois.readObject();
		System.out.println(s.id+" "+s.name+"");
	}

}
