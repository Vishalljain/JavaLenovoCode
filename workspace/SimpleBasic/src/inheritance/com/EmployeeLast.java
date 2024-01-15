package inheritance.com;

public class EmployeeLast extends Person {
	private String title;
	private String employer;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	@Override
	public String toString() {
		return super.toString()+ title + " " +employer ;//undertand this
		
	}
	

}
