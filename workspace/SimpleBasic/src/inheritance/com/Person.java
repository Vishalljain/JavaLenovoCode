package inheritance.com;

public class Person {
	
	private String name;
	private String email;
	private String phonenumber;
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + "]";
	}
	
	

}
