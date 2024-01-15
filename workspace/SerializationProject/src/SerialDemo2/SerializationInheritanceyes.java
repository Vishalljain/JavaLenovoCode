package SerialDemo2;
//If a class implements serilaizable then all its sub class will also be serializable
import java.io.Serializable;

class Person implements Serializable{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
class student extends Person{
	int roolNo;

	public student(int id, String name, int roolNo) {
		super(id, name);
		this.roolNo = roolNo;
	}
	
	
}

public class SerializationInheritanceyes {

}
