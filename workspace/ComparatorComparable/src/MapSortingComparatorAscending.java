import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Employee4{
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
		return "Student4 [rollno=" + rollno + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee4(int rollno, String name, int salary) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.salary = salary;
	}
	
}
class myCom10 implements Comparator<Employee4>{

	@Override
	public int compare(Employee4 o1, Employee4 o2) {
		// TODO Auto-generated method stub
		//return o1.salary-o2.salary;
		return o2.salary-o1.salary;
	}
	
}
public class MapSortingComparatorAscending {
	public static void main(String[] args) {
		Map<Employee4,Integer> map = new TreeMap<Employee4, Integer>(new myCom10());
		map.put(new Employee4(101, "Vishal", 75000), 1);
		map.put(new Employee4(102, "Akash", 10001), 2);
		map.put(new Employee4(103, "Sangeetha", 10002), 3);
		map.put(new Employee4(104, "Lalith", 10003), 4);
		map.put(new Employee4(105, "Pooja", 100005), 5);
		System.out.println(map);
	}

}
