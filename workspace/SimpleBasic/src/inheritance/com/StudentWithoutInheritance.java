package inheritance.com;

public class StudentWithoutInheritance {
	
	private String name;
	private String email;
	private String phonenumber;
	public String College;
	public int year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	//lot of duplication code is present ....later say i change email from string to object  then we need to change in both class
	//this is where inheritance comes.Inheritance help us to reuse the code inside the person class and create a new class call student which only has the new things that it would want to contain
	//so we would want to extend the person class and create  student class  and have a few additional attributes and methods
}
