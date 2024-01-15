
public class Person {
	int age;
	String name;
	void method(){
		System.out.println("My name is "+ name+  " My age is "+ age);
		
	}
	public static void main(String[] args) {
		Person p1=new Person();
		p1.age=22;
		p1.name="Vishal";
		p1.name="AKASH";
		p1.method();
		Person p2=new Person();
		p2.age=25;
		p2.name="Akash";
		System.out.println(p1.name);
		System.out.println(p2.name);
	}

}
