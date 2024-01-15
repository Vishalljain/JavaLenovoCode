 
public class StaticVariable {
String name;
String rollNo;
static String clgName="Dayananda Sagar University";
public StaticVariable(String name, String rollNo) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	

}
@Override
public String toString() {
	return "StaticVariable [name=" + name + ", rollNo=" + rollNo + "]";
}
public static void main(String[] args) {
	StaticVariable s1=new StaticVariable("Vishal","DSU15CS0099" );
	StaticVariable s2=new StaticVariable("Suhas","DSU15CS0081" );
	StaticVariable s3=new StaticVariable("Rohan","DSU15CS0069" );
//	s1.display();
//	s2.display();
//	s3.display();
	System.out.println(s1);
}
void display() {
System.out.println("Name is:" + name + " RollNo is :" + rollNo + " ClgName is :" + clgName);	
}

}
//static keyword is used for memory management.We can apply static keyword for variable,method ,block and nested class
// The static variable gets memory only once in the class area at the time of class loading.
// Static variable is used for memory management and is used to refer common property of an object.
//when a variable is declared as static  then a single copy of the variable is created and shared among all the objects at the class level
//thus company name is shared among s1 s2 ss3 obj
//static variable occupies space at class or method area 
//object occupies space at heap area

//Consider the ex counter 1 and 2.
//To showcase
///object occupies space at heap area
//static variable occupies space at class or method area 

