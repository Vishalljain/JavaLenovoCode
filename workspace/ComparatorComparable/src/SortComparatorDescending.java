import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee3{
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
	public Employee3(int rollno, String name, int salary) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee3 [rollno=" + rollno + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
class MyCom5 implements Comparator<Employee3>{

	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		if(o1.getSalary()>o2.getSalary()) {
			return -1;
		}
		else if(o1.getSalary()<o2.getSalary()) {
			return +1;
		}
		
		return 0;
	}
	
}
public class SortComparatorDescending {
	public static void main(String[] args) {
		List<Employee3> l = new ArrayList<>();
		l.add(new Employee3(101, "Vishal", 1000));
		l.add(new Employee3(102, "Akash", 10001));
		l.add(new Employee3(103, "Sangeetha", 10002));
		l.add(new Employee3(104, "Lalith", 5000000));
		l.add(new Employee3(1005, "Pooja", 100005));
		Collections.sort(l, new MyCom5());
		System.out.println(l);
		l.stream().sorted(Comparator.comparing(Employee3::getSalary).reversed()).forEach(System.out::println);
		

}
}
