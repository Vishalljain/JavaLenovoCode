package AddEmpDetails.com;

/**
 * @author Vishal
 *
 */
public class Employee {
	public String Name;
	public int id;
	public String clg;
	public Employee(String name, int id, String clg) {
		super();
		Name = name;
		this.id = id;
		this.clg = clg;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	
	

}
