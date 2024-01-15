package inheritance.com;

public class StudentRunner {
	public static void main(String[] args) {
	Student student = new Student();
	student.setName("Vishal");
	student.setPhonenumber("5788");
	//is a relationship that is "student is a person"
	
	
	//every class which does not extend anything actually extends object class ..in java every class extends object u can see wait,clone,notify,tostring,equals all methods....Person extends object
	//if a class does not exetn anything by default it will extend the object class..all classes are subclasses of object 
	//person extnds object
//student extends person
	
	EmployeeLast el = new EmployeeLast();
	el.setEmail("vj2008232@gmail.com");
	el.setEmployer("tcs");
	el.setTitle("System enginerr");
	System.out.println(el);
	
	}
	
	

}
