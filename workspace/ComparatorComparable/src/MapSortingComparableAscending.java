import java.util.Map;
import java.util.TreeMap;

class Employee5 implements Comparable<Employee5>{
	int rollno;
	String name;
	int salary;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee5 [rollno=" + rollno + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee5(int rollno, String name, int salary) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee5 o) {
		// TODO Auto-generated method stub
		//return this.salary-o.salary;//ascending
		return o.salary-this.salary;//descending
	}
	
}
public class MapSortingComparableAscending {
	public static void main(String[] args) {
		Map<Employee5,Integer> map = new TreeMap<Employee5, Integer>();
		map.put(new Employee5(101, "Vishal", 75000), 1);
		map.put(new Employee5(102, "Akash", 10001), 2);
		map.put(new Employee5(103, "Sangeetha", 10002), 3);
		map.put(new Employee5(104, "Lalith", 10003), 4);
		map.put(new Employee5(105, "Pooja", 100005), 5);
		System.out.println(map);
	}

}
