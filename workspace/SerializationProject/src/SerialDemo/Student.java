//Serialization allow us to conevert the state of an object into a byte stream which then can be saved into a file on the disk
// or sent over the network to some other machine
//Deserilaization is the process of reconverting the serialized bye stream to an object again
// Serialization and Deserilaization are platform independent which means an object serialized in one platform can be deserialized
//in another platform
//For serializing an object we called writeobject() method of objectOutputStream
//For Deserializing an object we called readObject() method of objectinputStream
//The string and all wrapper class implements java.io.Serializable by default
package SerialDemo;
import java.io.Serializable;
public class Student implements Serializable {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
