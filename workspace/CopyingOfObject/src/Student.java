
public class Student  implements Cloneable{
int roolNo;
String name;
public Student(int roolNo, String name) {
	super();
	this.roolNo = roolNo;
	this.name = name;
}

@Override
public String toString() {
	return "Student [roolNo=" + roolNo + ", name=" + name + "]";
}
//public Object clone() throws CloneNotSupportedException{
//	return super.clone();
//	
//}

public static void main(String[] args)   {
	
	try {
		Student s1 = new Student(100, "Vishal1");
		Student s2 = (Student) s1.clone();
		System.out.println(s1);
		System.out.println(s2);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}



	