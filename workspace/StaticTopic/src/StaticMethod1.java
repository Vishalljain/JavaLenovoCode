
public class StaticMethod1 {
	String rollno;
	String name;
	static String clgName="Dayananda Sagar University";
	static void change() {
		
		clgName="DSU";
	}
	static {
		System.out.println("Bhadravathi");
	}
	
	public StaticMethod1( String name,String string) {
		
		this.rollno = string;
		this.name = name;
	}

	public void dispaly() {
		System.out.println("Name is:" + name + " RollNo is :" + rollno + " ClgName is :" + clgName);	
	}
	public static void main(String[] args) {
		change();
		StaticMethod1 s1=new StaticMethod1("Vishal","DSU15CS0099" );
		StaticMethod1 s2=new StaticMethod1("Suhas","DSU15CS0081" );
		StaticMethod1 s3=new StaticMethod1("Rohan","DSU15CS0069" );
		s1.dispaly();
		s2.dispaly();
		s3.dispaly();
		
	}

	

}

/* If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.*/
